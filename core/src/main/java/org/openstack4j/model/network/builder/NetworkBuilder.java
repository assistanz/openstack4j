package org.openstack4j.model.network.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.Network;
import org.openstack4j.model.network.NetworkType;

/**
 * A Builder which creates a Network
 * 
 * @author Jeremy Unruh
 */
public interface NetworkBuilder extends Builder<NetworkBuilder, Network> {

	/**
	 * @see Network#getName()
	 */
	NetworkBuilder name(String name);
	
	/**
	 * @see Network#isAdminStateUp()
	 */
	NetworkBuilder adminStateUp(boolean adminStateUp);
        
        /**
         * 
         * @see Network#isShared()
         */
	NetworkBuilder isShared(boolean isShared);
        
        /**
         * 
         * @see Network#isRouterExternal()
         */
	NetworkBuilder isRouterExternal(boolean isRouterExternal);
	
	/**
	 * @see Network#getNetworkType()
	 */	
	NetworkBuilder networkType(NetworkType networkType);
	
	/**
	 * @see Network#getProviderPhyNet()
	 */
	NetworkBuilder physicalNetwork(String providerPhysicalNetwork);
	
	/**
	 * @see Network#getProviderSegID()
	 */
	NetworkBuilder segmentId(String providerSegmentationId);
	
	/**
	 * @see Network#getTenantId()
	 */
	NetworkBuilder tenantId(String tenantId);
}
