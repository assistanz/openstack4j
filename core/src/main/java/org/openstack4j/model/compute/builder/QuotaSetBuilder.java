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
        
	QuotaSetBuilder floatingIps(int floatingIps);
        
	QuotaSetBuilder instances(int instances);
        
	QuotaSetBuilder metadataItems(int metadataItems);
        
	QuotaSetBuilder injectedFiles(int injectedFiles);
        
	QuotaSetBuilder injectedFileContentBytes(int injectedFileContentBytes);
        
	QuotaSetBuilder securityGroups(int securityGroups);
        
	QuotaSetBuilder securityGroupRules(int securityGroupRules);
        
	QuotaSetBuilder injectedFilePathBytes(int injectedFilePathBytes);
        
	QuotaSetBuilder keyPairs(int keyPairs);
	
}
