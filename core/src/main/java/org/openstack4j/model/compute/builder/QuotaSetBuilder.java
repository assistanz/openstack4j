package org.openstack4j.model.compute.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.compute.QuotaSet;

/**
 * Builder for a QuotaSet model class
 * 
 */
public interface QuotaSetBuilder extends Builder<QuotaSetBuilder, QuotaSet> {

	QuotaSetBuilder cores(int cores);
        
	QuotaSetBuilder ram(int ram);
        
//	QuotaSetBuilder floatingIps(int floatingIps);
        
	QuotaSetBuilder instances(int instances);
	
}
