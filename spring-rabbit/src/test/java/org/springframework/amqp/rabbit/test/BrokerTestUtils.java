/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.springframework.amqp.rabbit.test;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;

/**
 * Global convenience class for all integration tests, carrying constants and other utilities for broker set up.
 *
 * @author Dave Syer
 * @author Gary Russell
 *
 */
public class BrokerTestUtils {

	public static final int DEFAULT_PORT = 5672;

	/**
	 * The port that the broker is listening on (e.g. as input for a {@link ConnectionFactory}).
	 *
	 * @return a port number
	 */
	public static int getPort() {
		return DEFAULT_PORT;
	}

}