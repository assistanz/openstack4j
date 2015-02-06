package org.openstack4j.openstack.networking.internal.ext;

import com.google.common.base.Preconditions;
import static com.google.common.base.Preconditions.checkNotNull;
import java.util.List;
import org.openstack4j.api.networking.ext.NetQuotaService;
import org.openstack4j.model.compute.ActionResponse;
import org.openstack4j.model.network.NetQuota;
import org.openstack4j.openstack.networking.domain.NeutronNetQuota;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

/**
 * Networking (Neutron) Quota Extension API
 * 
 * @author Jeremy Unruh
 */
public class NetQuotaServiceImpl extends BaseNetworkingServices implements NetQuotaService {

    @Override
    public NetQuota get(String tenantId) {
        checkNotNull(tenantId);
        return get(NeutronNetQuota.class, uri("/quotas/%s",tenantId)).execute();
    }

    @Override
    public NetQuota update(NetQuota netQuota) {
        Preconditions.checkNotNull(netQuota, "NetQuota must not be null");
        return put(NeutronNetQuota.class, uri("/quotas")).entity(netQuota).execute();
    }

    @Override
    public ActionResponse reset() {
        return deleteWithResponse(uri("/quotas")).execute();
    }
    
    @Override
    public NetQuota put(NetQuota netQuota, String tenantId) {

        checkNotNull(tenantId);
        String uri = uri("/quotas/%s", tenantId);
        return put(NeutronNetQuota.class, uri)
                .entity(netQuota)
                .execute();
    }

        

   
    
    

}
