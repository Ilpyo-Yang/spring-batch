/*
 * Copyright 2008-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.batch.integration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;

public class JobSupport implements Job {

	String name;

	public JobSupport(String name) {
		this.name = name;
	}

	@Override
	public void execute(JobExecution execution) {
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isRestartable() {
		return false;
	}

}
