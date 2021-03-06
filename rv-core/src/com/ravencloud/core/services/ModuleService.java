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
package com.ravencloud.core.services;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ravencloud.core.iu.ManagerViews;
import com.ravencloud.core.rest.ThreadContextRest;
import com.ravencloud.core.rest.TypeRestServer;
import com.ravencloud.core.rest.TypeRestServer.TypeURL;

import io.swagger.v3.oas.annotations.Hidden;

@Hidden
@Path("{moduleName}.ui")
public class ModuleService {

	@GET
 	@PermitAll
	@Produces(MediaType.TEXT_HTML)
	@TypeRestServer(type = TypeURL.MODULE)
	public Response view(@PathParam("moduleName") String moduleName) {
		
		ThreadContextRest.INSTANCE.getActivity().setObservations("Module: " + moduleName);
		
		return Response.ok(ManagerViews.INSTANCE.get(moduleName), MediaType.TEXT_HTML).build();
	}
}
