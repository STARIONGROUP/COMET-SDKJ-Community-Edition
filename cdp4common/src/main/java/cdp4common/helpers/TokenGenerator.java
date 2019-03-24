/*
 * TokenGenerator.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.helpers;

import java.nio.charset.Charset;
import java.util.concurrent.ThreadLocalRandom;

public class TokenGenerator {
    /**
     * Generates a random string that is used as a token in log statements to match log statements related to the
     * processing of one request
     *
     * @return random token
     */
    public static String generateRandomToken() {
        byte[] data = new byte[6];
        ThreadLocalRandom.current().nextBytes(data);

        return new String(data, Charset.forName("UTF-8")).replace("-", "");
    }
}
