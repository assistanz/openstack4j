/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstack4j.openstack.identity.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import java.util.List;
import org.openstack4j.api.identity.ProjectService;
import org.openstack4j.api.identity.TenantService;
import static org.openstack4j.core.transport.ClientConstants.PATH_TENANTS;
import org.openstack4j.model.compute.ActionResponse;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.model.identity.v3.Project;
import org.openstack4j.openstack.identity.domain.KeystoneTenant;
import org.openstack4j.openstack.identity.domain.v3.KeystoneProject;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Identity Project based Operations
 * 
 * @author Abdul
 */
public class ProjectServiceImpl extends BaseOpenStackService implements ProjectService {
    
    @Override
	public List<? extends Project> list() {
		return get(KeystoneProject.Projects.class, uri("/projects")).execute().getList();
	}

	@Override
	public Project get(String projectId) {
		checkNotNull(projectId);
		return get(KeystoneProject.class, uri("/projects"), "/", projectId).execute();
	}
        
        @Override
	public Project create(Project project) {
		checkNotNull(project);
		return post(KeystoneProject.class, uri("/projects")).entity(project).execute();
	}
        
        @Override
	public ActionResponse delete(String projectId) {
		checkNotNull(projectId);
		return deleteWithResponse(uri("/projects"), "/", projectId).execute();
	}

    
}
