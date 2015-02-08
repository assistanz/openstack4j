package org.openstack4j.api.storage;


import org.openstack4j.common.RestService;
import org.openstack4j.model.storage.block.QuotaSet;


/**
 * OpenStack Quota-Set Operation API
 * 
 * @author Jeremy Unruh
 */
public interface QuotaSetService extends RestService {

	/**
	 * Gets the QuotaSet for the given tenant ID
	 *
	 * @param tenantId the tenant id
	 * @return the quota set
	 */
	QuotaSet get(String tenantId);
        
        
        
        /**
	 * Gets the QuotaSet for the given tenant and user ID
	 * @param tenantId the identifier for the tenant
	 * @param userId the identifier of the user
	 * @return the quota set
	 */
	QuotaSet get(String tenantId, String userId);
	
	/**
         * update the quota set 
         * 
         * @param quotaSet
         * @param tenantId
         * @return 
         */
        QuotaSet put(QuotaSet quotaSet, String tenantId);
	
}
