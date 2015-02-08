package org.openstack4j.openstack.compute.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.Objects;
import org.openstack4j.model.compute.QuotaSet;
import org.openstack4j.model.compute.builder.QuotaSetBuilder;

/**
 * An OpenStack Quota-Set
 * 
 * @author Jeremy Unruh
 */
@JsonRootName("quota_set")
public class NovaQuotaSet implements QuotaSet {

	private static final long serialVersionUID = 1L;

	private String id;

	@JsonProperty("metadata_items")
	private int metadataItems;

	@JsonProperty("injected_file_content_bytes")
	private int injectedFileContentBytes;

	@JsonProperty("injected_files")
	private int injectedFiles;

	private int gigabytes;
	private int ram;

	@JsonProperty("floating_ips")
	private int floatingIps;

	private int instances;

	private int volumes;

	private int cores;

	@JsonProperty("security_groups")
	private int securityGroups;

	@JsonProperty("security_group_rules")
	private int securityGroupRules;

	@JsonProperty("injected_file_path_bytes")
	private int injectedFilePathBytes;

	@JsonProperty("key_pairs")
	private int keyPairs;
        
        public static QuotaSetBuilder builder() {
		return new QuotaSetConcreteBuilder();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getMetadataItems() {
		return metadataItems;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getInjectedFileContentBytes() {
		return injectedFileContentBytes;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getInjectedFiles() {
		return injectedFiles;
	}

	/**
	 * {@inheritDoc}
	 */
//	@Override
//	public int getGigabytes() {
//		return gigabytes;
//	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getRam() {
		return ram;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getFloatingIps() {
		return floatingIps;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getInstances() {
		return instances;
	}

	/**
	 * {@inheritDoc}
	 */
//	@Override
//	public int getVolumes() {
//		return volumes;
//	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getCores() {
		return cores;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getSecurityGroups() {
		return securityGroups;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getSecurityGroupRules() {
		return securityGroupRules;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getInjectedFilePathBytes() {
		return injectedFilePathBytes;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getKeyPairs() {
		return keyPairs;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this).omitNullValues()
				     .add("id", id).add("metadataItems", metadataItems).add("injectedFileContentBytes", injectedFileContentBytes)
				     .add("injectedFileContentBytes", injectedFileContentBytes).add("injectedFiles", injectedFiles)
				     .add("ram", ram).add("securityGroups", securityGroups).add("securityGroupRules", securityGroupRules)
				     .add("cores", cores).add("floatingIps", floatingIps).add("instances", instances)
				     .add("injectedFilePathBytes", injectedFilePathBytes).add("keyPairs", keyPairs)
				     .toString();
	}

    @Override
    public QuotaSetBuilder toBuilder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        public static class QuotaSetConcreteBuilder implements QuotaSetBuilder {

		private NovaQuotaSet m;
		
		QuotaSetConcreteBuilder() {
			this(new NovaQuotaSet());
		}
		
		QuotaSetConcreteBuilder(NovaQuotaSet model) {
			this.m = model;
		}
		
		
		public QuotaSetBuilder cores(int cores) {
			m.cores = cores;
			return this;
		}
		
		@Override
		public QuotaSet build() {
			return m;
		}

		@Override
		public QuotaSetBuilder from(QuotaSet in) {
			m = (NovaQuotaSet) in;
			return this;
		}

                @Override
                public QuotaSetBuilder ram(int ram) {
                    m.ram = ram;
                    return this;
                }

                @Override
                public QuotaSetBuilder floatingIps(int floatingIps) {
                    m.floatingIps = floatingIps;
                    return this;
                }

                @Override
                public QuotaSetBuilder instances(int instances) {
                    m.instances = instances;
                    return this;
                }

                @Override
                public QuotaSetBuilder metadataItems(int metadataItems) {
                    m.metadataItems = metadataItems;
                    return this;
                }

                @Override
                public QuotaSetBuilder injectedFiles(int injectedFiles) {
                    m.injectedFiles = injectedFiles;
                    return this;
                }

                @Override
                public QuotaSetBuilder injectedFileContentBytes(int injectedFileContentBytes) {
                    m.injectedFileContentBytes = injectedFileContentBytes;
                    return this;
                }

                @Override
                public QuotaSetBuilder securityGroups(int securityGroups) {
                    m.securityGroups = securityGroups;
                    return this;
                }

                @Override
                public QuotaSetBuilder securityGroupRules(int securityGroupRules) {
                    m.securityGroupRules = securityGroupRules;
                    return this;
                }
                
                @Override
                public QuotaSetBuilder injectedFilePathBytes(int injectedFilePathBytes) {
                    m.injectedFilePathBytes = injectedFilePathBytes;
                    return this;
                }
                
                @Override
                public QuotaSetBuilder keyPairs(int keyPairs) {
                    m.keyPairs = keyPairs;
                    return this;
                }


                
                
                
		
	}
}
