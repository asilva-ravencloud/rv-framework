/**
 * Ravencloud, open source library.
 * Copyright (c) 2020 Alejandro Silva Sanahuja
 * mailto:asilva@ravencloud.es
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */
package com.ravencloud.core.implemented.view;

import com.ravencloud.core.iu.NoModel;
import com.ravencloud.core.iu.model.IModuleView;
import com.ravencloud.core.iu.model.RavencloudContext;
import com.ravencloud.util.exception.NotImplementedException;

import htmlflow.HtmlView;

public class NotInitModelView implements IModuleView<RavencloudContext<NoModel>> {
	
	@Override
	public HtmlView<RavencloudContext<NoModel>> getView() {
		
		throw new NotImplementedException();
	}
	
	@Override
	public RavencloudContext<NoModel> getInitModel(String moduleName) {
		
		return new RavencloudContext<>(moduleName);
	}
}
