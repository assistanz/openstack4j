

package org.openstack4j.model.identity.v3;

import org.openstack4j.model.ModelEntity;

/**
 * Represents an OpenStack Identity Version 3 Domain. Domains represent collections of users, groups, and projects. Each is owned by exactly one domain. Users, however, can be associated with multiple projects by granting roles to the user on a project, including projects owned by other domains. 
 * 
 * 
 * @author Sujai SD
 */
public interface Domain extends ModelEntity {
    
    /**
     * @return the unique identifier for this domain
     */
    String getId();

    /**
     * @return the name of the domain
     */
    String getName();
    
    /**
     * @return the description of the domain
     */
    String getDescription();
}
