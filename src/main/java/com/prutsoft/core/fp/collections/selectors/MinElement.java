/*
 * Copyright 2008-2009 Ruslan Khmelyuk, Prutsoft.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.prutsoft.core.fp.collections.selectors;

import com.prutsoft.core.fp.Function;
import com.prutsoft.core.utils.ObjectUtils;
import com.prutsoft.core.asserts.ArgumentAssert;

import java.util.Collection;

/**
 * The minimal collection element selector.
 * Collection can't be null. The result is {@code null} if collection is empty.
 *
 * @author Ruslan Khmelyuk
 * @version $Rev: 25 $
 * @since 2009-01-05 02:13
 */
public class MinElement<T extends Comparable> implements Function<Collection<T>, T> {

    public T run(Collection<T> collection) {
        ArgumentAssert.isNotNull(collection, "Collection can't be null.");

        T min = null;
        for (T each : collection) {
            if (min == null || ObjectUtils.compareTo(min, each) > 0) {
                min = each;
            }
        }

        return min;
    }
}