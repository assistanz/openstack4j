/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstack4j.model.identity.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.model.identity.v3.Project;

/**
 * A Builder which creates a Identity Project
 * 
 * @author Abdul
 */
public interface ProjectBuilder extends Builder<ProjectBuilder, Project>{
    
       /**
        * @see Project#getName()
        */
       ProjectBuilder name(String name);

       /**
        * @see Project#getDescription()
        */
       ProjectBuilder description(String desc);

       /**
        * @see Project#getEnabled()
        */
       ProjectBuilder enabled(boolean enabled);
       
        /**
        * @see Project#getDomainId()
        */
       ProjectBuilder domainId(String domainId);
    
}
