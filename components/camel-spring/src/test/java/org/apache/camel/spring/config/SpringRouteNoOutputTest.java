/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.spring.config;

import org.apache.camel.spring.SpringTestSupport;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class SpringRouteNoOutputTest extends SpringTestSupport {

    @Override
    protected void setUp() throws Exception {
        createApplicationContext();
    }

    public void testRouteNoOutput() {
        // noop
    }

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        try {
            return new ClassPathXmlApplicationContext("org/apache/camel/spring/config/SpringRouteNoOutputTest.xml");
        } catch (Exception e) {
            IllegalArgumentException iae = (IllegalArgumentException) e.getCause().getCause();
            assertEquals("Route myRoute has no outputs: Route[[From[direct:start]] -> []]", iae.getMessage());
            return null;
        }
    }
}
