package org.openstack4j.api.storage;

import org.openstack4j.api.storage.QuotaSetService;
import org.openstack4j.common.RestService;
import org.openstack4j.model.storage.block.BlockLimits;

/**
 * Block Storage (Cinder) Service Operation API
 * 
 * @author Jeremy Unruh
 */
public interface BlockStorageService extends RestService {

	/**
	 * @return the Volume Service API
	 */
	BlockVolumeService volumes();
	
	/**
	 * @return the Volume Snapshot Service API
	 */
	BlockVolumeSnapshotService snapshots();
	
	/**
	 * Gets the Absolute limits used by this tenant
	 * 
	 * @return the absolute limits
	 */
	BlockLimits getLimits();
        
        /**
	 * Quota-Set Service API
	 *
	 * @return the quota set service
	 */
	QuotaSetService quotaSets();
}
