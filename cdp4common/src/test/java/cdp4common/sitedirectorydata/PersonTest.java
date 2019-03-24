/*
 * PersonTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void TestGetNAme() {
        Person person = new Person();
        person.setGivenName("givenName");
        person.setSurname("surname");

        assertEquals("givenName surname", person.getName());
    }
}
