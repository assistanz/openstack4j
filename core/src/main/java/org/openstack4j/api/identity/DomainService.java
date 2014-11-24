package org.openstack4j.api.identity;

import java.util.List;
import org.openstack4j.common.RestService;
import org.openstack4j.model.identity.v3.Domain;

/**
 * Identity Domain based Operations
 * 
 * @author Sujai SD
 */
public interface DomainService extends RestService {
    
    /**
     * Lists all domains
     *
     * @return the list<? extends Domain>
     */
    List<? extends Domain> list();
}
