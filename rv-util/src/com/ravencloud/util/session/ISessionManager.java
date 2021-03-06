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
package com.ravencloud.util.session;

import javax.servlet.http.HttpSession;

public interface ISessionManager {

	public void setSession(HttpSession session);
	
	public void unsetSession();
	
	public void set(String key,Object value);
	
	public void set(String key,String value);
	
	public <T> T get(String key,Class<T> clazz);
	
	public String get(String key);
	
	public void sessionDestroyed(HttpSession session);
}
