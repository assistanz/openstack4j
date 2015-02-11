package org.openstack4j.openstack.storage.object.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.openstack4j.api.Apis;
import org.openstack4j.api.storage.ObjectStorageContainerService;
import org.openstack4j.model.storage.object.SwiftContainer;
import org.openstack4j.openstack.common.ListResult;

/**
 * Represents an OpenStack Swift Container which holds Objects
 * 
 * @author Jeremy Unruh
 */
public class SwiftContainerImpl implements SwiftContainer {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String name;
    
    @JsonProperty("count")
    private int objectCount;
    
    @JsonProperty("bytes")
    private long totalSize;
    
    @JsonProperty("content_type")
    private String contentType;
    
    private String hash;
    
    @JsonProperty("last_modified")
    private Date lastModified;
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getObjectCount() {
        return objectCount;
    }

    @Override
    public long getTotalSize() {
        return totalSize;
    }
    
    public String getContentType() {
        return contentType;
    }

    public String getHash() {
        return hash;
    }

    public Date getLastModified() {
        return lastModified;
    }
    
    @Override
    public Map<String, String> getMetadata() {
        return Apis.get(ObjectStorageContainerService.class).getMetadata(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this).omitNullValues()
                   .add("name", name).add("content type", contentType).add("hash", hash)
                   .add("object count", objectCount)
                   .add("totalSize",totalSize)
                   .add("last modified", lastModified)
                   .toString();
    }
    
    public static class Containers extends ListResult<SwiftContainerImpl> {
        

        private static final long serialVersionUID = 1L;

        List<SwiftContainerImpl> containers;

        public List<SwiftContainerImpl> value() {    
            return containers;
        }
    }
    
}
