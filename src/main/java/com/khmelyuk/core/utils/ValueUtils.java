/*
 * Copyright 2008-2012 Ruslan Khmelyuk.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.khmelyuk.core.utils;

/**
 * Contains utils to work with values.
 *
 * @author Ruslan Khmelyuk
 * @since 1.0.2, 2009-12-20 20:32
 */
public final class ValueUtils {

    /**
     * Returns <code>value</code> if it is not null. Otherwise returns <code>otherwise</code> value.
     *
     * @param value     the value.
     * @param otherwise the otherwise value.
     * @param <T>       the method parameters and result type.
     * @return T the <code>value</code> if not null, else <code>otherwise</code> value.
     */
    public static <T> T ifNull(T value, T otherwise) {
        return (value != null ? value : otherwise);
    }

    /**
     * Returns <code>value</code> if it is true. Otherwise returns null.
     *
     * @param condition the condition.
     * @param value     the value.
     * @param <T>       the method parameter and result type.
     * @return T the <code>value</code> if not true, else null.
     */
    public static <T> T ifTrue(boolean condition, T value) {
        return condition ? value : null;
    }

    /**
     * Returns <code>value</code> if it is false. Otherwise returns null.
     *
     * @param condition the condition.
     * @param value     the value.
     * @param <T>       the method parameter and result type.
     * @return T the <code>value</code> if not false, else null.
     */
    public static <T> T ifFalse(boolean condition, T value) {
        return (!condition ? value : null);
    }

}
