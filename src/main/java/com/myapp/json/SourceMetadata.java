
package com.myapp.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sourceName",
    "sourceDesc",
    "sourceType",
    "sourceDirName",
    "sourceDirpath",
    "isUnderDateDir",
    "filesToCopy"
})
public class SourceMetadata {

    @JsonProperty("sourceName")
    private String sourceName;
    @JsonProperty("sourceDesc")
    private String sourceDesc;
    @JsonProperty("sourceType")
    private String sourceType;
    @JsonProperty("sourceDirName")
    private String sourceDirName;
    @JsonProperty("sourceDirpath")
    private String sourceDirpath;
    @JsonProperty("isUnderDateDir")
    private String isUnderDateDir;
    @JsonProperty("filesToCopy")
    private List<FilesToCopy> filesToCopy = new ArrayList<FilesToCopy>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sourceName")
    public String getSourceName() {
        return sourceName;
    }

    @JsonProperty("sourceName")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public SourceMetadata withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    @JsonProperty("sourceDesc")
    public String getSourceDesc() {
        return sourceDesc;
    }

    @JsonProperty("sourceDesc")
    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    public SourceMetadata withSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
        return this;
    }

    @JsonProperty("sourceType")
    public String getSourceType() {
        return sourceType;
    }

    @JsonProperty("sourceType")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public SourceMetadata withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    @JsonProperty("sourceDirName")
    public String getSourceDirName() {
        return sourceDirName;
    }

    @JsonProperty("sourceDirName")
    public void setSourceDirName(String sourceDirName) {
        this.sourceDirName = sourceDirName;
    }

    public SourceMetadata withSourceDirName(String sourceDirName) {
        this.sourceDirName = sourceDirName;
        return this;
    }

    @JsonProperty("sourceDirpath")
    public String getSourceDirpath() {
        return sourceDirpath;
    }

    @JsonProperty("sourceDirpath")
    public void setSourceDirpath(String sourceDirpath) {
        this.sourceDirpath = sourceDirpath;
    }

    public SourceMetadata withSourceDirpath(String sourceDirpath) {
        this.sourceDirpath = sourceDirpath;
        return this;
    }

    @JsonProperty("isUnderDateDir")
    public String getIsUnderDateDir() {
        return isUnderDateDir;
    }

    @JsonProperty("isUnderDateDir")
    public void setIsUnderDateDir(String isUnderDateDir) {
        this.isUnderDateDir = isUnderDateDir;
    }

    public SourceMetadata withIsUnderDateDir(String isUnderDateDir) {
        this.isUnderDateDir = isUnderDateDir;
        return this;
    }

    @JsonProperty("filesToCopy")
    public List<FilesToCopy> getFilesToCopy() {
        return filesToCopy;
    }

    @JsonProperty("filesToCopy")
    public void setFilesToCopy(List<FilesToCopy> filesToCopy) {
        this.filesToCopy = filesToCopy;
    }

    public SourceMetadata withFilesToCopy(List<FilesToCopy> filesToCopy) {
        this.filesToCopy = filesToCopy;
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

    public SourceMetadata withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceMetadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceName");
        sb.append('=');
        sb.append(((this.sourceName == null)?"<null>":this.sourceName));
        sb.append(',');
        sb.append("sourceDesc");
        sb.append('=');
        sb.append(((this.sourceDesc == null)?"<null>":this.sourceDesc));
        sb.append(',');
        sb.append("sourceType");
        sb.append('=');
        sb.append(((this.sourceType == null)?"<null>":this.sourceType));
        sb.append(',');
        sb.append("sourceDirName");
        sb.append('=');
        sb.append(((this.sourceDirName == null)?"<null>":this.sourceDirName));
        sb.append(',');
        sb.append("sourceDirpath");
        sb.append('=');
        sb.append(((this.sourceDirpath == null)?"<null>":this.sourceDirpath));
        sb.append(',');
        sb.append("isUnderDateDir");
        sb.append('=');
        sb.append(((this.isUnderDateDir == null)?"<null>":this.isUnderDateDir));
        sb.append(',');
        sb.append("filesToCopy");
        sb.append('=');
        sb.append(((this.filesToCopy == null)?"<null>":this.filesToCopy));
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
        result = ((result* 31)+((this.filesToCopy == null)? 0 :this.filesToCopy.hashCode()));
        result = ((result* 31)+((this.sourceDesc == null)? 0 :this.sourceDesc.hashCode()));
        result = ((result* 31)+((this.sourceType == null)? 0 :this.sourceType.hashCode()));
        result = ((result* 31)+((this.sourceDirName == null)? 0 :this.sourceDirName.hashCode()));
        result = ((result* 31)+((this.isUnderDateDir == null)? 0 :this.isUnderDateDir.hashCode()));
        result = ((result* 31)+((this.sourceName == null)? 0 :this.sourceName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sourceDirpath == null)? 0 :this.sourceDirpath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceMetadata) == false) {
            return false;
        }
        SourceMetadata rhs = ((SourceMetadata) other);
        return (((((((((this.filesToCopy == rhs.filesToCopy)||((this.filesToCopy!= null)&&this.filesToCopy.equals(rhs.filesToCopy)))&&((this.sourceDesc == rhs.sourceDesc)||((this.sourceDesc!= null)&&this.sourceDesc.equals(rhs.sourceDesc))))&&((this.sourceType == rhs.sourceType)||((this.sourceType!= null)&&this.sourceType.equals(rhs.sourceType))))&&((this.sourceDirName == rhs.sourceDirName)||((this.sourceDirName!= null)&&this.sourceDirName.equals(rhs.sourceDirName))))&&((this.isUnderDateDir == rhs.isUnderDateDir)||((this.isUnderDateDir!= null)&&this.isUnderDateDir.equals(rhs.isUnderDateDir))))&&((this.sourceName == rhs.sourceName)||((this.sourceName!= null)&&this.sourceName.equals(rhs.sourceName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sourceDirpath == rhs.sourceDirpath)||((this.sourceDirpath!= null)&&this.sourceDirpath.equals(rhs.sourceDirpath))));
    }

}
