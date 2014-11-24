/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openstack4j.openstack.identity.domain.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.Objects;
import java.util.List;
import org.openstack4j.api.Apis;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.model.identity.builder.ProjectBuilder;
import org.openstack4j.model.identity.v3.Project;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.identity.domain.KeystoneTenant;

/**
 * Project Model class use to group/isolate resources and/or identity objects
 * 
 * @author abdul
 * 
 */
@JsonRootName("project")
@JsonIgnoreProperties(ignoreUnknown=true)
public class KeystoneProject implements Project {
    
    private static final long serialVersionUID = 1L; 
    public String keystoneDomain;
    private String id;
    private String name;
    private String description;
    private Boolean enabled = true;
    @JsonProperty("domain_id")
    private String domainId;   
    
    public static ProjectBuilder builder() {
		return new ProjectConcreteBuilder();
    }

    @Override
    public ProjectBuilder toBuilder() {
            return new ProjectConcreteBuilder(this);
    }
    
    /**
    * By providing an ID it is assumed this object will be mapped to an existing Project
    *
    * @return the id of the project
    */
    public String getId() {
            return id;
    }
    
    /**
     * @return the name of the project
     */
    public String getName() {
            return name;
    }


    /**
     * @return the description of the project
     */
    public String getDescription() {
            return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEnabled() {
            return (enabled != null && enabled);
    }

    /**
     * Sets the enabled.
     *
     * @param enabled the new enabled
     */
    public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
    }
    
    /**
     * 
     * @return domainId of the project
     */
    @Override
    public String getDomainId() {
        return domainId;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void delete() {
           if (id != null) {
                   Apis.getIdentityServices().projects().delete(getId());
           }
    }
    
        /**
        * {@inheritDoc}
        */
        @Override
        public String toString() {
            return Objects.toStringHelper(getClass()).omitNullValues()
                    .add("id", id).add("name", name).add("description", description)
                    .add("enabled", enabled).add("domainId", domainId).toString();
        }

        public static class ProjectConcreteBuilder implements ProjectBuilder {

                KeystoneProject model;

                ProjectConcreteBuilder() {
                        this(new KeystoneProject());
                }

                ProjectConcreteBuilder(KeystoneProject model) {
                        this.model = model;
                }

                /**
                 * @see KeystoneProject#getName()
                 */
                public ProjectBuilder name(String name) {
                        model.name = name;
                        return this;
                }

                /**
                 * @see KeystoneProject#getDescription()
                 */
                public ProjectBuilder description(String desc) {
                        model.description = desc;
                        return this;
                }

                /**
                 * @see KeystoneProject#getEnabled()
                 */
                public ProjectBuilder enabled(boolean enabled) {
                        model.enabled = enabled;
                        return this;
                }
                
                /**
                 * @see KeystoneProject#getId()
                 */
                public ProjectBuilder domainId(String domainId) {
                        model.domainId = domainId;
                        return this;
                }

                /**
                 * {@inheritDoc}
                 */
                @Override
                public Project build() {
                        return model;
                }

                /**
                 * {@inheritDoc}
                 */
                @Override
                public ProjectBuilder from(Project in) {
                        if (in != null)
                                this.model = (KeystoneProject)in;
                        return this;
                }
            }


        public static class Projects extends ListResult<KeystoneProject> {

            private static final long serialVersionUID = 1L;
            @JsonProperty("projects")
            private List<KeystoneProject> list;

            @Override
            protected List<KeystoneProject> value() {
                return list;
            }

        }
    
}
