/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.visionarts.powerjambda.cors;

import java.util.Optional;

/**
 * Default implementation of {@code CorsConfiguration}.
 * This class appends {@code Access-Control-Allow-Origin: "*"} to the response header.
 */
public final class DefaultCorsConfiguration implements CorsConfiguration {

    private static final Optional<String> ALLOW_ANY_ORIGIN = Optional.of("*");

    @Override
    public Optional<String> getAllowOrigin() {
        return ALLOW_ANY_ORIGIN;
    }

}
