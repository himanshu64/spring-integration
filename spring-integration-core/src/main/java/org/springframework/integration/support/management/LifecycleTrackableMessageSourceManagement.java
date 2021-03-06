/*
 * Copyright 2016 the original author or authors.
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

package org.springframework.integration.support.management;

import org.springframework.context.Lifecycle;
import org.springframework.integration.endpoint.MessageSourceManagement;

/**
 * An extension to {@link LifecycleTrackableMessageSourceMetrics} for sources
 * that implement {@link MessageSourceManagement}.
 *
 * @author Gary Russell
 * @since 5.0
 *
 */
public class LifecycleTrackableMessageSourceManagement extends LifecycleTrackableMessageSourceMetrics
		implements MessageSourceManagement {

	public LifecycleTrackableMessageSourceManagement(Lifecycle lifecycle, MessageSourceManagement delegate) {
		super(lifecycle, delegate);
	}

	@Override
	public void setMaxFetchSize(int maxFetchSize) {
		((MessageSourceManagement) this.delegate).setMaxFetchSize(maxFetchSize);
	}

	@Override
	public int getMaxFetchSize() {
		return ((MessageSourceManagement) this.delegate).getMaxFetchSize();
	}


}
