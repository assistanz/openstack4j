/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstack4j.model.common.functions;

import com.google.common.base.Function;
import org.openstack4j.model.common.NameEntity;

/**
 *
 * @author Abdul
 */
public class NameEntityToString implements Function<NameEntity, String>{
    
    public static final NameEntityToString INSTANCE = new NameEntityToString();
    
    @Override
    public String apply(NameEntity input) {
        return input.getName();
    }
}
