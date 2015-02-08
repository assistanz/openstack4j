package org.openstack4j.openstack.storage.block.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import org.openstack4j.api.storage.QuotaSetService;
import org.openstack4j.model.storage.block.QuotaSet;
import org.openstack4j.openstack.storage.block.domain.CinderQuotaSet;

/**
 * OpenStack Quota-Set API Implementation
 * 
 * @author Jeremy Unruh
 */
public class QuotaSetServiceImpl extends BaseBlockStorageServices implements QuotaSetService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuotaSet get(String tenantId) {
		return get(tenantId, null);
	}
        
        /**
	 * {@inheritDoc}
	 */
	@Override
	public QuotaSet get(String tenantId, String userId) {
		checkNotNull(tenantId);
		String uri = (userId != null) ? uri("/os-quota-sets/%s?user_id=%s", tenantId, userId) : uri("/os-quota-sets/%s", tenantId);
		return get(CinderQuotaSet.class, uri).execute();
	}

	

        @Override
        public QuotaSet put(QuotaSet quotaSet, String tenantId) {

            checkNotNull(tenantId);
            String uri = uri("/os-quota-sets/%s", tenantId);
            return put(CinderQuotaSet.class, uri)
                    .entity(quotaSet)
                    .execute();
            
        }

        
	
	

}
