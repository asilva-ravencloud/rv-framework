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
package com.ravencloud.core.iu.builder;

import org.xmlet.htmlapifaster.EnumTypeInputType;

import com.ravencloud.core.iu.model.IView;

public class PasswordInputViewBuilder extends InputViewBuilder {
	
	public PasswordInputViewBuilder(Class<? extends IView> classView, String property) {
		
		super(classView,property);
	}
	
	public PasswordInputViewBuilder() {
		
		super();
	}
	
	@Override
	public EnumTypeInputType getType() { return EnumTypeInputType.PASSWORD; }
}
