/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstack4j.model.common;

import org.openstack4j.model.ModelEntity;

/**
 *
 * @author Abdul
 */
public interface NameEntity extends ModelEntity {
    
    /**
     * @return the name for this resource
     */
    String getName();
    
    /**
     * Sets the name for this resource. 
     * assign one on the create call
     * 
     * @param name the name
     */
    void setName(String name);
    
}
