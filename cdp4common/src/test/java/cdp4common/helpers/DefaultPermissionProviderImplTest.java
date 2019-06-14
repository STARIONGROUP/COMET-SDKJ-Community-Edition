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
            assertDoesNotThrow(() -> this.defaultPermissionProvider.getDefaultPersonPermission(classKind.name()));
        }

        assertEquals(PersonAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.Person.name()));
        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.NotThing.name()));

        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.ElementDefinition.name()));
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

        assertEquals(PersonAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.Person));

        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.NotThing));
        assertEquals(PersonAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultPersonPermission(ClassKind.ElementDefinition));
    }

    @Test
    void verify_that_for_all_classKindsAsString_a_default_ParticipantPermission_is_returned() {
        var classKinds = ClassKind.values();

        for (var classKind : classKinds) {
            assertDoesNotThrow(() -> this.defaultPermissionProvider.getDefaultParticipantPermission(classKind.name()));
        }

        assertEquals(ParticipantAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.ElementDefinition.name()));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.Person.name()));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.NotThing.name()));
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

        assertEquals(ParticipantAccessRightKind.NONE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.ElementDefinition));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.Person));
        assertEquals(ParticipantAccessRightKind.NOT_APPLICABLE, this.defaultPermissionProvider.getDefaultParticipantPermission(ClassKind.NotThing));
    }
}
