/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstack4j.api.identity;

import java.util.List;
import org.openstack4j.common.RestService;
import org.openstack4j.model.compute.ActionResponse;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.model.identity.v3.Project;

/**
 *Identity Project based Operations
 * 
 * @author Abdul
 */
public interface ProjectService extends RestService {
    
    /**
	 * Lists projects to which the specified token has access.
	 *
	 * @return List of Projects
	 */
	List<? extends Project> list();
	
	/**
	 * Gets detailed information about a specified project by ID
	 *
	 * @param projectId the project id
	 * @return the project
	 */
	Project get(String projectId);
        
        /**
	 * Gets detailed information about a specified project by Name
	 *
	 * @param projectName the project name
	 * @return List of Projects
	 */
	List<? extends Project> getByName(String projectName);
        
        /**
	 * Creates a new Project
	 *
	 * @param project the project to create
	 * @return the newly created project and it's assigned ID
	 */
	Project create(Project project);
        
        	/**
	 * Deletes the specified project by ID
	 *
	 * @param projectId the project id
	 * @return the action response
	 */
	ActionResponse delete(String projectId);
    
}
