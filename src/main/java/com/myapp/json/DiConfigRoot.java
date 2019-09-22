
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
    "sourceMetadata",
    "targetHdfsConfig"
})
public class DiConfigRoot {

    @JsonProperty("sourceMetadata")
    private SourceMetadata sourceMetadata;
    @JsonProperty("targetHdfsConfig")
    private TargetHdfsConfig targetHdfsConfig;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sourceMetadata")
    public SourceMetadata getSourceMetadata() {
        return sourceMetadata;
    }

    @JsonProperty("sourceMetadata")
    public void setSourceMetadata(SourceMetadata sourceMetadata) {
        this.sourceMetadata = sourceMetadata;
    }

    public DiConfigRoot withSourceMetadata(SourceMetadata sourceMetadata) {
        this.sourceMetadata = sourceMetadata;
        return this;
    }

    @JsonProperty("targetHdfsConfig")
    public TargetHdfsConfig getTargetHdfsConfig() {
        return targetHdfsConfig;
    }

    @JsonProperty("targetHdfsConfig")
    public void setTargetHdfsConfig(TargetHdfsConfig targetHdfsConfig) {
        this.targetHdfsConfig = targetHdfsConfig;
    }

    public DiConfigRoot withTargetHdfsConfig(TargetHdfsConfig targetHdfsConfig) {
        this.targetHdfsConfig = targetHdfsConfig;
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

    public DiConfigRoot withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DiConfigRoot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceMetadata");
        sb.append('=');
        sb.append(((this.sourceMetadata == null)?"<null>":this.sourceMetadata));
        sb.append(',');
        sb.append("targetHdfsConfig");
        sb.append('=');
        sb.append(((this.targetHdfsConfig == null)?"<null>":this.targetHdfsConfig));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sourceMetadata == null)? 0 :this.sourceMetadata.hashCode()));
        result = ((result* 31)+((this.targetHdfsConfig == null)? 0 :this.targetHdfsConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiConfigRoot) == false) {
            return false;
        }
        DiConfigRoot rhs = ((DiConfigRoot) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.sourceMetadata == rhs.sourceMetadata)||((this.sourceMetadata!= null)&&this.sourceMetadata.equals(rhs.sourceMetadata))))&&((this.targetHdfsConfig == rhs.targetHdfsConfig)||((this.targetHdfsConfig!= null)&&this.targetHdfsConfig.equals(rhs.targetHdfsConfig))));
    }

}
