
package com.myapp.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hdfsRootDir",
    "isFileUnderDateDir",
    "datePattern"
})
public class TargetHdfsConfig {

    @JsonProperty("hdfsRootDir")
    private String hdfsRootDir;
    @JsonProperty("isFileUnderDateDir")
    private Boolean isFileUnderDateDir;
    @JsonProperty("datePattern")
    private String datePattern;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hdfsRootDir")
    public String getHdfsRootDir() {
        return hdfsRootDir;
    }

    @JsonProperty("hdfsRootDir")
    public void setHdfsRootDir(String hdfsRootDir) {
        this.hdfsRootDir = hdfsRootDir;
    }

    public TargetHdfsConfig withHdfsRootDir(String hdfsRootDir) {
        this.hdfsRootDir = hdfsRootDir;
        return this;
    }

    @JsonProperty("isFileUnderDateDir")
    public Boolean getIsFileUnderDateDir() {
        return isFileUnderDateDir;
    }

    @JsonProperty("isFileUnderDateDir")
    public void setIsFileUnderDateDir(Boolean isFileUnderDateDir) {
        this.isFileUnderDateDir = isFileUnderDateDir;
    }

    public TargetHdfsConfig withIsFileUnderDateDir(Boolean isFileUnderDateDir) {
        this.isFileUnderDateDir = isFileUnderDateDir;
        return this;
    }

    @JsonProperty("datePattern")
    public String getDatePattern() {
        return datePattern;
    }

    @JsonProperty("datePattern")
    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    public TargetHdfsConfig withDatePattern(String datePattern) {
        this.datePattern = datePattern;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TargetHdfsConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TargetHdfsConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hdfsRootDir");
        sb.append('=');
        sb.append(((this.hdfsRootDir == null)?"<null>":this.hdfsRootDir));
        sb.append(',');
        sb.append("isFileUnderDateDir");
        sb.append('=');
        sb.append(((this.isFileUnderDateDir == null)?"<null>":this.isFileUnderDateDir));
        sb.append(',');
        sb.append("datePattern");
        sb.append('=');
        sb.append(((this.datePattern == null)?"<null>":this.datePattern));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.isFileUnderDateDir == null)? 0 :this.isFileUnderDateDir.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hdfsRootDir == null)? 0 :this.hdfsRootDir.hashCode()));
        result = ((result* 31)+((this.datePattern == null)? 0 :this.datePattern.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TargetHdfsConfig) == false) {
            return false;
        }
        TargetHdfsConfig rhs = ((TargetHdfsConfig) other);
        return (((((this.isFileUnderDateDir == rhs.isFileUnderDateDir)||((this.isFileUnderDateDir!= null)&&this.isFileUnderDateDir.equals(rhs.isFileUnderDateDir)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hdfsRootDir == rhs.hdfsRootDir)||((this.hdfsRootDir!= null)&&this.hdfsRootDir.equals(rhs.hdfsRootDir))))&&((this.datePattern == rhs.datePattern)||((this.datePattern!= null)&&this.datePattern.equals(rhs.datePattern))));
    }

}
