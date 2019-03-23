/*
 * TokenGeneratorTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.helpers;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TokenGeneratorTest {
    @Test
    void verify_that_a_random_token_is_generated_and_unique() {
        Set<String> hashSet = new HashSet<>();

        for (int i = 0; i < 100000; i++) {
            var token = TokenGenerator.generateRandomToken();
            assertDoesNotThrow(() -> hashSet.add(token));
        }
    }
}
