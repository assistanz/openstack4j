package org.openstack4j.api.networking;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.compute.ActionResponse;
import org.openstack4j.model.network.SecurityGroup;


/**
 * Provides Neutron-based Security Group services.
 *
 * @author Nathan Anderson
 */
public interface SecurityGroupService extends RestService {

  /**
   * Get list of security groups accessible by the current tenant
   *
   * @return the list<? extends security group>
   */
  List<? extends SecurityGroup> list();
  
  /**
   * Gets the Security Group by id.
   *
   * @param id the id
   * @return the security group
   */
  SecurityGroup get(String id);
  
  /**
   * Deletes SecurityGroup by id.
   *
   * @param id SecurityGroup id
   */
  ActionResponse delete(String id);
  
  /**
   * Creates a SecurityGroup.
   *
   * @param securityGroup the security group
   * @return the security group
   */
  SecurityGroup create(SecurityGroup securityGroup);
  
  /**
   * Updates a SecurityGroup
   * 
   * @param securityGroupId
   * @param name
   * @param description
   * @return the security group
   */
  SecurityGroup update(String securityGroupId, String name, String description);
  
}
