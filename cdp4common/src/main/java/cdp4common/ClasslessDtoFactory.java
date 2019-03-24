/*
 * ClasslessDtoFactory.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common;

import cdp4common.dto.Thing;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ClasslessDtoFactory {
    /**
     * Given a {@link List} of properties to add, populate this plain DTO from a {@link cdp4common.dto.Thing}. The Iid and ClassKind are populated automatically and thus
     * do not require to be entered into the {@code propertyList} variable. If {@code propertyList} is null then only the Iid and ClassKind are passed.
     *
     * @param <T>          of type {@link Thing}
     * @param thing        the {@link Thing}, properties of which to use to populate this DTO with.
     * @param propertyList The list of names of property names to use to filter. Can be null to produce the simplest form with just Id and ClassKind
     * @return The {@link ClasslessDTO}.
     * @throws NullPointerException If the provided {@link Thing} is null this exception is thrown.
     */
    public static <T extends Thing> ClasslessDTO fromThing(T thing, List<String> propertyList) {
        if (thing == null) {
            throw new NullPointerException("A thing cannot be null.");
        }

        var classlessDto = new ClasslessDTO();

        // the iid and classkind properties are transferred automatically
        classlessDto.put("CLASS_KIND", thing.CLASS_KIND);
        classlessDto.put("iid", thing.getIid());

        // all other named properties
        if (propertyList != null) {
            List<Field> fields = FieldUtils.getAllFieldsList(thing.getClass());
            for(var property : propertyList)
            {
                // if iid or classkind somehow gets included into the list just skip it
                if (property.equals("iid") || property.equals("CLASS_KIND")) {
                    continue;
                }

                // find appropriate field get annotation of a field
                Optional<Field> optionalField = fields.stream().filter(x -> x.getName().equals(property)).findFirst();
                Field field = optionalField
                        .orElseThrow(() -> new NoSuchElementException("Non-existent property is supplied: " + property));

                // get annotations of a field
                UmlInformation umlInformation = field.getAnnotation(UmlInformation.class);
                DataMember dataMember = field.getAnnotation(DataMember.class);

                if (!umlInformation.isDerived() && dataMember != null) {
                    field.setAccessible(true);
                    Object fieldValue;
                    try {
                        fieldValue = field.get(thing);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Unable to get value of a field: " + property);
                    }

                    if (fieldValue == null && !umlInformation.isNullable()) {
                        fieldValue = "";
                    }

                    classlessDto.put(property, fieldValue);
                }
            }
        }

        return classlessDto;
    }

    /**
     * The full {@link ClasslessDTO} from thing.
     *
     * @param thing The thing.
     * @param <T> Of type {@link Thing}
     * @return The {@link ClasslessDTO}.
     * @throws NullPointerException If the provided {@link Thing} is null this exception is thrown.
     */
    public static <T extends Thing> ClasslessDTO fullFromThing(T thing)
    {
        if (thing == null) {
            throw new NullPointerException("thing");
        }

        var classlessDto = new ClasslessDTO();

        // the Iid and ClassKind properties are transferred automatically
        classlessDto.put("CLASS_KIND", thing.CLASS_KIND);
        classlessDto.put("iid", thing.getIid());
        List<Field> fields = FieldUtils.getAllFieldsList(thing.getClass());

        for(var field : fields)
        {
            // get annotations of a field
            UmlInformation umlInformation = field.getAnnotation(UmlInformation.class);
            DataMember dataMember = field.getAnnotation(DataMember.class);

            if (field.getName().equals("iid") || field.getName().equals("CLASS_KIND") || dataMember == null || umlInformation.isDerived()) {
                continue;
            }

            field.setAccessible(true);
            Object fieldValue;
            try {
                fieldValue = field.get(thing);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unable to get value of a field: " + field.getName());
            }

            if (fieldValue == null && !umlInformation.isNullable()) {
                fieldValue = "";
            }

            classlessDto.put(field.getName(), fieldValue);
        }

        return classlessDto;
    }
}
