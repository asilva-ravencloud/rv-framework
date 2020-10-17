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
package com.ravencloud.core.bd.util;

import com.ravencloud.core.bd.dao.ParamDao;
import com.ravencloud.util.stringconverter.StringConverter;

public enum ParamUtils {
	
	INSTANCE;
	
	public <V> V getProperty(Class<V> type, String key, V defaultValue) {
		
		return StringConverter.INSTANCE.converter(ParamDao.INSTANCE.getValue(key), type, defaultValue);
	}
	
	public <V> V getProperty(Class<V> type, String key) {
		
		return StringConverter.INSTANCE.converter(ParamDao.INSTANCE.getValue(key), type);
	}
}
