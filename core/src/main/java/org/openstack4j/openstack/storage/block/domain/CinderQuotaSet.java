package org.openstack4j.openstack.storage.block.domain;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.Objects;
import org.openstack4j.model.storage.block.QuotaSet;
import org.openstack4j.model.storage.block.builder.QuotaSetBuilder;

/**
 * An OpenStack Quota-Set
 *
 * @author Jeremy Unruh
 */
@JsonRootName("quota_set")
public class CinderQuotaSet implements QuotaSet {

    private static final long serialVersionUID = 1L;

    private String id;

    private int gigabytes;

    private int volumes;

    private int snapshots;

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

    @Override
    public int getSnapshots() {
        return snapshots;
    }

    @Override
    public int getVolumes() {
        return volumes;
    }

    @Override
    public int getGigabytes() {
        return gigabytes;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).omitNullValues()
                .add("id", id).add("gigabytes", gigabytes).add("volumes", volumes)
                .add("snapshots", snapshots)
                .toString();
    }

    @Override
    public QuotaSetBuilder toBuilder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public static class QuotaSetConcreteBuilder implements QuotaSetBuilder {

        private CinderQuotaSet m;

        QuotaSetConcreteBuilder() {
            this(new CinderQuotaSet());
        }

        QuotaSetConcreteBuilder(CinderQuotaSet model) {
            this.m = model;
        }

        @Override
        public QuotaSet build() {
            return m;
        }

        @Override
        public QuotaSetBuilder from(QuotaSet in) {
            m = (CinderQuotaSet) in;
            return this;
        }

        @Override
        public QuotaSetBuilder volumes(int volumes) {
             m.volumes = volumes;
             return this;
        }

        @Override
        public QuotaSetBuilder snapshots(int snapshots) {
             m.snapshots = snapshots;
             return this;
        }

        @Override
        public QuotaSetBuilder gigabytes(int gigabytes) {
            m.gigabytes = gigabytes;
            return this;
        }

    }
}
