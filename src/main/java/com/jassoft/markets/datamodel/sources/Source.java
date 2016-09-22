/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jassoft.markets.datamodel.sources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonny
 */
@Document(collection = "sources")
public class Source extends BaseObject
{
    private String name;
    private List<SourceUrl> urls;
    private SourceType type;
    private List<String> exclusionList;
    private List<String> storyTitleRemovals;
    
    private String publishedDateSelector;
    private String publishedDateFormat;
    private int timezoneOffset;
    
    private boolean disabled;
    
    private boolean collectDirectlyLinked;

    public Source()
    {
        super(null);
    }


    @JsonCreator
    public Source(@JsonProperty("id") String id,
                    @JsonProperty("name") String name,
                    @JsonProperty("urls") List<SourceUrl> urls,
                    @JsonProperty("type") SourceType type,
                    @JsonProperty("exclusionList") List<String> exclusionList,
                    @JsonProperty("publishedDateSelector") String publishedDateSelector,
                    @JsonProperty("publishedDateFormat") String publishedDateFormat,
                    @JsonProperty("timezoneOffset") int timezoneOffset,
                    @JsonProperty("disabled") boolean disabled,
                    @JsonProperty("collectDirectlyLinked") boolean collectDirectlyLinked,
                    @JsonProperty("storyTitleRemovals") List<String> storyTitleRemovals)
    {
        super(id);
        
        this.name = name;
        this.urls = urls;
        this.type = type;
        this.exclusionList = (exclusionList == null) ? new ArrayList<String>() : exclusionList;
        this.publishedDateSelector = publishedDateSelector;
        this.publishedDateFormat = publishedDateFormat;
        this.timezoneOffset = timezoneOffset;
        this.disabled = disabled;
        this.collectDirectlyLinked = collectDirectlyLinked;
        this.storyTitleRemovals = storyTitleRemovals;
    }
    
    public Source(String name, SourceUrl url, SourceType type, String publishedDateSelector, String publishedDateFormat, int timezoneOffset)
    {
        super(null);
        
        this.name = name;
        this.urls = new ArrayList<>();
        urls.add(url);
        this.type = type;
        this.exclusionList = new ArrayList<>();
        this.publishedDateSelector = publishedDateSelector;
        this.publishedDateFormat = publishedDateFormat;
        this.timezoneOffset = timezoneOffset;
        this.disabled = false;
        this.collectDirectlyLinked = false;
    }
    
    public Source(String name, List<SourceUrl> urls, SourceType type, String publishedDateSelector, String publishedDateFormat, int timezoneOffset)
    {
        super(null);
        
        this.name = name;
        this.urls = urls;
        this.type = type;
        this.exclusionList = new ArrayList<>();
        this.publishedDateSelector = publishedDateSelector;
        this.publishedDateFormat = publishedDateFormat;
        this.timezoneOffset = timezoneOffset;
        this.disabled = false;
        this.collectDirectlyLinked = false;
    }

    public String getName()
    {
        return name;
    }

    public List<SourceUrl> getUrls()
    {
        return urls;
    }

    public SourceType getType()
    {
        return type;
    }

    public List<String> getExclusionList()
    {
        return exclusionList;
    }

    public String getPublishedDateSelector()
    {
        return publishedDateSelector;
    }

    public String getPublishedDateFormat()
    {
        return publishedDateFormat;
    }

    public int getTimezoneOffset()
    {
        return timezoneOffset;
    }

    public boolean isDisabled()
    {
        return disabled;
    }

    public boolean isCollectDirectlyLinked()
    {
        return collectDirectlyLinked;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public List<String> getStoryTitleRemovals() {
        return storyTitleRemovals;
    }
}
