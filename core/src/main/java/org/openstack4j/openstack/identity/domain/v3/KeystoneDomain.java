package org.openstack4j.openstack.identity.domain.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import java.util.List;
import org.openstack4j.model.identity.v3.Domain;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.identity.domain.KeystoneRole;

/**
 * Represents an OpenStack Identity Version 3 Domain. Domains represent
 * collections of users, groups, and projects. Each is owned by exactly one
 * domain. Users, however, can be associated with multiple projects by granting
 * roles to the user on a project, including projects owned by other domains.
 *
 * @author Sujai SD
 */
public class KeystoneDomain implements Domain {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    private String enabled; 

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String getEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(getClass()).omitNullValues()
                .add("id", id).add("name", name).add("description", description).add("enabled", enabled).toString();
    }

    public static class Domains extends ListResult<KeystoneDomain> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("domains")
        private List<KeystoneDomain> list;

        @Override
        protected List<KeystoneDomain> value() {
            return list;
        }

    }

}
