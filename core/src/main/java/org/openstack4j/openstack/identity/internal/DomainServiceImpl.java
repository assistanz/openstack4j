package org.openstack4j.openstack.identity.internal;

import java.util.List;
import org.openstack4j.api.identity.DomainService;
import org.openstack4j.model.identity.v3.Domain;
import org.openstack4j.openstack.identity.domain.KeystoneRole;
import org.openstack4j.openstack.identity.domain.v3.KeystoneDomain;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Identity Domain based Operations
 * 
 * @author Sujai SD
 */
public class DomainServiceImpl extends BaseOpenStackService implements DomainService {

    @Override
    public List<? extends Domain> list() {
        return get(KeystoneDomain.Domains.class, uri("/domains")).execute().getList();
    }
    
}
