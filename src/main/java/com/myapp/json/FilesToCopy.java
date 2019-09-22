
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
    "fileNamePrefix",
    "fileNameDateTimePattern",
    "fileNameSufix",
    "isCopyfileToHDFS",
    "type",
    "columnDelimiter",
    "isHeaderPresent",
    "customHeader"
})
public class FilesToCopy {

    @JsonProperty("fileNamePrefix")
    private String fileNamePrefix;
    @JsonProperty("fileNameDateTimePattern")
    private String fileNameDateTimePattern;
    @JsonProperty("fileNameSufix")
    private String fileNameSufix;
    @JsonProperty("isCopyfileToHDFS")
    private Boolean isCopyfileToHDFS;
    @JsonProperty("type")
    private String type;
    @JsonProperty("columnDelimiter")
    private String columnDelimiter;
    @JsonProperty("isHeaderPresent")
    private Boolean isHeaderPresent;
    @JsonProperty("customHeader")
    private String customHeader;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fileNamePrefix")
    public String getFileNamePrefix() {
        return fileNamePrefix;
    }

    @JsonProperty("fileNamePrefix")
    public void setFileNamePrefix(String fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
    }

    public FilesToCopy withFileNamePrefix(String fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
        return this;
    }

    @JsonProperty("fileNameDateTimePattern")
    public String getFileNameDateTimePattern() {
        return fileNameDateTimePattern;
    }

    @JsonProperty("fileNameDateTimePattern")
    public void setFileNameDateTimePattern(String fileNameDateTimePattern) {
        this.fileNameDateTimePattern = fileNameDateTimePattern;
    }

    public FilesToCopy withFileNameDateTimePattern(String fileNameDateTimePattern) {
        this.fileNameDateTimePattern = fileNameDateTimePattern;
        return this;
    }

    @JsonProperty("fileNameSufix")
    public String getFileNameSufix() {
        return fileNameSufix;
    }

    @JsonProperty("fileNameSufix")
    public void setFileNameSufix(String fileNameSufix) {
        this.fileNameSufix = fileNameSufix;
    }

    public FilesToCopy withFileNameSufix(String fileNameSufix) {
        this.fileNameSufix = fileNameSufix;
        return this;
    }

    @JsonProperty("isCopyfileToHDFS")
    public Boolean getIsCopyfileToHDFS() {
        return isCopyfileToHDFS;
    }

    @JsonProperty("isCopyfileToHDFS")
    public void setIsCopyfileToHDFS(Boolean isCopyfileToHDFS) {
        this.isCopyfileToHDFS = isCopyfileToHDFS;
    }

    public FilesToCopy withIsCopyfileToHDFS(Boolean isCopyfileToHDFS) {
        this.isCopyfileToHDFS = isCopyfileToHDFS;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public FilesToCopy withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("columnDelimiter")
    public String getColumnDelimiter() {
        return columnDelimiter;
    }

    @JsonProperty("columnDelimiter")
    public void setColumnDelimiter(String columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
    }

    public FilesToCopy withColumnDelimiter(String columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
        return this;
    }

    @JsonProperty("isHeaderPresent")
    public Boolean getIsHeaderPresent() {
        return isHeaderPresent;
    }

    @JsonProperty("isHeaderPresent")
    public void setIsHeaderPresent(Boolean isHeaderPresent) {
        this.isHeaderPresent = isHeaderPresent;
    }

    public FilesToCopy withIsHeaderPresent(Boolean isHeaderPresent) {
        this.isHeaderPresent = isHeaderPresent;
        return this;
    }

    @JsonProperty("customHeader")
    public String getCustomHeader() {
        return customHeader;
    }

    @JsonProperty("customHeader")
    public void setCustomHeader(String customHeader) {
        this.customHeader = customHeader;
    }

    public FilesToCopy withCustomHeader(String customHeader) {
        this.customHeader = customHeader;
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

    public FilesToCopy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FilesToCopy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fileNamePrefix");
        sb.append('=');
        sb.append(((this.fileNamePrefix == null)?"<null>":this.fileNamePrefix));
        sb.append(',');
        sb.append("fileNameDateTimePattern");
        sb.append('=');
        sb.append(((this.fileNameDateTimePattern == null)?"<null>":this.fileNameDateTimePattern));
        sb.append(',');
        sb.append("fileNameSufix");
        sb.append('=');
        sb.append(((this.fileNameSufix == null)?"<null>":this.fileNameSufix));
        sb.append(',');
        sb.append("isCopyfileToHDFS");
        sb.append('=');
        sb.append(((this.isCopyfileToHDFS == null)?"<null>":this.isCopyfileToHDFS));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("columnDelimiter");
        sb.append('=');
        sb.append(((this.columnDelimiter == null)?"<null>":this.columnDelimiter));
        sb.append(',');
        sb.append("isHeaderPresent");
        sb.append('=');
        sb.append(((this.isHeaderPresent == null)?"<null>":this.isHeaderPresent));
        sb.append(',');
        sb.append("customHeader");
        sb.append('=');
        sb.append(((this.customHeader == null)?"<null>":this.customHeader));
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
        result = ((result* 31)+((this.isCopyfileToHDFS == null)? 0 :this.isCopyfileToHDFS.hashCode()));
        result = ((result* 31)+((this.customHeader == null)? 0 :this.customHeader.hashCode()));
        result = ((result* 31)+((this.fileNameDateTimePattern == null)? 0 :this.fileNameDateTimePattern.hashCode()));
        result = ((result* 31)+((this.fileNameSufix == null)? 0 :this.fileNameSufix.hashCode()));
        result = ((result* 31)+((this.isHeaderPresent == null)? 0 :this.isHeaderPresent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fileNamePrefix == null)? 0 :this.fileNamePrefix.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.columnDelimiter == null)? 0 :this.columnDelimiter.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilesToCopy) == false) {
            return false;
        }
        FilesToCopy rhs = ((FilesToCopy) other);
        return ((((((((((this.isCopyfileToHDFS == rhs.isCopyfileToHDFS)||((this.isCopyfileToHDFS!= null)&&this.isCopyfileToHDFS.equals(rhs.isCopyfileToHDFS)))&&((this.customHeader == rhs.customHeader)||((this.customHeader!= null)&&this.customHeader.equals(rhs.customHeader))))&&((this.fileNameDateTimePattern == rhs.fileNameDateTimePattern)||((this.fileNameDateTimePattern!= null)&&this.fileNameDateTimePattern.equals(rhs.fileNameDateTimePattern))))&&((this.fileNameSufix == rhs.fileNameSufix)||((this.fileNameSufix!= null)&&this.fileNameSufix.equals(rhs.fileNameSufix))))&&((this.isHeaderPresent == rhs.isHeaderPresent)||((this.isHeaderPresent!= null)&&this.isHeaderPresent.equals(rhs.isHeaderPresent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fileNamePrefix == rhs.fileNamePrefix)||((this.fileNamePrefix!= null)&&this.fileNamePrefix.equals(rhs.fileNamePrefix))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.columnDelimiter == rhs.columnDelimiter)||((this.columnDelimiter!= null)&&this.columnDelimiter.equals(rhs.columnDelimiter))));
    }

}
