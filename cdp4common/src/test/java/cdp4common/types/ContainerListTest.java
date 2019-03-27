/*
 * ContainerListTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4common.types;

import cdp4common.sitedirectorydata.EmailAddress;
import cdp4common.sitedirectorydata.Person;
import com.google.common.collect.Iterables;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ContainerListTest {
    private Person person;
    private ContainerList<EmailAddress> emailAddresses;

    @BeforeEach
    void setup() {
        this.person = new Person(UUID.randomUUID(), null, null);
        this.emailAddresses = new ContainerList<>(this.person);
    }

    @AfterEach
    void tearDown() {
        this.emailAddresses.clear();
    }

    @Test
    void verifyThatAddWorks() {
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);

        this.emailAddresses.add(email);

        assertEquals(1, this.emailAddresses.size());
        assertEquals(this.person, Iterables.getOnlyElement(this.emailAddresses).getContainer());
    }

    @Test
    void verifyThatAddAllWorks() {
        List<EmailAddress> emails = List.of(
                new EmailAddress(UUID.randomUUID(), null, null),
                new EmailAddress(UUID.randomUUID(), null, null),
                new EmailAddress(UUID.randomUUID(), null, null)
        );

        this.emailAddresses.addAll(emails);

        assertEquals(3, this.emailAddresses.size());
        for (EmailAddress email : this.emailAddresses) {
            assertEquals(this.person, email.getContainer());
        }
    }

    @Test
    void verifyThatGetSetAtIndexWorks() {
        this.emailAddresses.add(new EmailAddress(UUID.randomUUID(), null, null));

        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        this.emailAddresses.set(0, email);

        EmailAddress returnedEmail = this.emailAddresses.get(0);

        assertEquals(this.person, returnedEmail.getContainer());
        assertEquals(email.getIid(), returnedEmail.getIid());
    }

    @Test
    void verifyThatContainerSetToClone() {
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        this.person.getEmailAddress().add(email);

        Person clone = this.person.clone(false);
        assertSame(this.person, email.getContainer());

        clone.getEmailAddress().clear();
        clone.getEmailAddress().add(email);
        assertSame(clone, email.getContainer());
    }

    @Test
    void verifyThatGetIndexerThrowsExceptionWhenArgumentOutOfRange() {
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        this.person.getEmailAddress().add(email);
        int invalidIndex = this.person.getEmailAddress().size();

        assertThrows(IndexOutOfBoundsException.class, () -> this.person.getEmailAddress().get(invalidIndex));
    }

    @Test
    void verifyThatSetIndexerThrowsExceptionWhenArgumentOutOfRange() {
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        this.person.getEmailAddress().add(email);
        int invalidIndex = this.person.getEmailAddress().size();

        assertThrows(IndexOutOfBoundsException.class, () -> this.person.getEmailAddress().set(invalidIndex, email));
    }

    @Test
    void verifyThatSetIndexerThrowsExceptionIfValueIsNull() {
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        this.person.getEmailAddress().add(email);

        assertThrows(IllegalArgumentException.class, () -> this.person.getEmailAddress().set(0, null));
    }

    @Test
    void verifyThatIfContainedItemAddedMoreThatInvalidOperationExceptionIsThrown() {
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        this.person.getEmailAddress().add(email);

        EmailAddress otheremail = new EmailAddress(UUID.randomUUID(), null, null);
        this.person.getEmailAddress().add(otheremail);

        assertThrows(IllegalArgumentException.class, () -> this.person.getEmailAddress().add(email));
        assertThrows(IllegalArgumentException.class, () -> this.person.getEmailAddress().set(1, email));
    }
}
