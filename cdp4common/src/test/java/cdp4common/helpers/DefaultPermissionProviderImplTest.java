package cdp4common.helpers;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DefaultPermissionProviderImplTest {
    private DefaultPermissionProvider defaultPermissionProvider;

    @BeforeEach
    void setUp() {
        this.defaultPermissionProvider = new DefaultPermissionProviderImpl();
    }

    @Test
    void verify_that_For_all_classKindsAsString_a_default_PersonPermission_is_returned() {
        var classKinds = ClassKind.values();

        for (var classKind : classKinds) {
            assertDoesNotThrow(() -> this.defaultPermissionProvider.getDefaultPersonPermission(classKind.toClassName()));
        }

        assertEquals(PersonAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.PERSON.toClassName()));
        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.NOT_THING.toClassName()));

        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.ELEMENT_DEFINITION.toClassName()));
    }

    @Test
    void verify_that_For_unknown_type_exception_is_thrown_on_GetDefaultPersonPermission() {
        assertThrows(IllegalArgumentException.class, () -> this.defaultPermissionProvider.getDefaultPersonPermission("unknown-type"));
    }

    @Test
    void verify_that_For_all_classKinds_a_default_PersonPermission_is_returned() {
        var classKinds = ClassKind.values();

        for (var classKind : classKinds) {
            assertDoesNotThrow(() -> this.defaultPermissionProvider.getDefaultPersonPermission(classKind));
        }

        assertEquals(PersonAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.PERSON));

        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.NOT_THING));
        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.ELEMENT_DEFINITION));
    }

    @Test
    void verify_that_for_all_classKindsAsString_a_default_ParticipantPermission_is_returned() {
        var classKinds = ClassKind.values();

        for (var classKind : classKinds) {
            assertDoesNotThrow(() -> this.defaultPermissionProvider.getDefaultParticipantPermission(classKind.toClassName()));
        }

        assertEquals(ParticipantAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.ELEMENT_DEFINITION.toClassName()));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.PERSON.toClassName()));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.NOT_THING.toClassName()));
    }

    @Test
    void verify_that_for_unknown_type_exception_is_thrown_on_GetDefaultParticipantPermission() {
        assertThrows(IllegalArgumentException.class, () -> this.defaultPermissionProvider.getDefaultParticipantPermission("unknown-type"));
    }

    @Test
    void verify_that_for_all_classKinds_a_default_ParticipantPermission_is_returned() {
        var classKinds = ClassKind.values();

        for (var classKind : classKinds) {
            assertDoesNotThrow(() -> this.defaultPermissionProvider.getDefaultParticipantPermission(classKind));
        }

        assertEquals(ParticipantAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.ELEMENT_DEFINITION));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.PERSON));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.NOT_THING));
    }
}
