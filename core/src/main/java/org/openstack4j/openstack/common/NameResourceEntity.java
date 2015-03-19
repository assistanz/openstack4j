/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstack4j.openstack.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import org.openstack4j.model.common.NameEntity;

/**
 *
 * @author Abdul
 */
public class NameResourceEntity implements NameEntity{
    private static final long serialVersionUID = 1L;
    
    @JsonProperty
    private String name;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
       return name;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String name) {
       this.name = name;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(getClass()).omitNullValues()
                     .add("name", name)
                     .toString();
    }
}
