package org.opensearch.client.util;

/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

public class PathEncoder {

    private final static String httpClient4UtilClassName = "org.apache.http.client.utils.URLEncodedUtils";
    private static final boolean isHttpClient4UtilPresent = isHttpClient4UtilPresent();

    public static String encode(String uri) {
        if (isHttpClient4UtilPresent) {
            return encodeByHttpClient4Util(uri);
        } else {
            return org.apache.hc.core5.net.URLEncodedUtils.formatSegments(uri).substring(1);
        }
    }

    private static String encodeByHttpClient4Util(String uri) {
        try {
            Method formatSegments = Class.forName(httpClient4UtilClassName).getMethod("formatSegments", Iterable.class, Charset.class);
            String invoke = (String) formatSegments.invoke(null, Collections.singletonList(uri), StandardCharsets.UTF_8);
            return invoke.substring(1);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Failed to encode URI using HttpClient4Util", e);
        }
    }

    private static boolean isHttpClient4UtilPresent() {
        try {
            Class.forName(PathEncoder.httpClient4UtilClassName, false, PathEncoder.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
