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

    private final static Method formatSegmentsMethod = formatSegmentsMethod();
    public static Method formatSegmentsMethod() {
        try {
            String className = getClassName();
            Class<?> clazz = Class.forName(className);
            return clazz.getMethod("formatSegments", Iterable.class, Charset.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to dynamically load and invoke URLEncodedUtils", e);
        }
    }

    public static String encode(String uri) {
        try {
            String invoke = (String) formatSegmentsMethod.invoke(null, Collections.singletonList(uri), StandardCharsets.UTF_8);
            return invoke.substring(1);
        } catch (Exception e) {
            throw new RuntimeException("Failed to dynamically load and invoke URLEncodedUtils", e);
        }
    }

    private static String getClassName() {
        if (isClassPresent("org.apache.http.client.utils.URLEncodedUtils")) {
            return "org.apache.http.client.utils.URLEncodedUtils";
        } else if (isClassPresent("org.apache.hc.core5.net.URLEncodedUtils")) {
            return "org.apache.hc.core5.net.URLEncodedUtils";
        } else {
            throw new IllegalStateException("No suitable URLEncodedUtils class found on classpath");
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
