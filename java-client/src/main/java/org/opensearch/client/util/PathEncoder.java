/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.util;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

public class PathEncoder {
    public static String encode(String uri) {
        try {
            if (isClassPresent("org.apache.http.client.utils.URLEncodedUtils")) {
                // Apache HttpClient 4.x 버전 사용
                Class<?> clazz = Class.forName("org.apache.http.client.utils.URLEncodedUtils");
                Method method = clazz.getMethod("formatSegments", Iterable.class, Charset.class);
                String invoke = (String) method.invoke(null, Collections.singletonList(uri), StandardCharsets.UTF_8);
                return invoke.substring(1);
            } else if (isClassPresent("org.apache.hc.core5.net.URLEncodedUtils")) {
                // Apache HttpClient 5.x 버전 사용
                Class<?> clazz = Class.forName("org.apache.hc.core5.net.URLEncodedUtils");
                Method method = clazz.getMethod("formatSegments", Iterable.class, Charset.class);
                String invoke = (String) method.invoke(null, Collections.singletonList(uri), StandardCharsets.UTF_8);
                return invoke.substring(1);
            } else {
                throw new IllegalStateException("No suitable URLEncodedUtils class found on classpath");
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to dynamically load and invoke URLEncodedUtils", e);
        }
    }

    private static boolean isClassPresent(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

}
