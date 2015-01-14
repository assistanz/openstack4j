package org.openstack4j.model.network;

import org.openstack4j.model.ModelEntity;

/**
 *
 * @author Abdul
 */
public interface ExternalGatewayInfo extends ModelEntity {
    
        /**
	 * @return the network identifier
	 */
	String getNetworkId();
    
}
