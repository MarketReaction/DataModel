package com.jassoft.markets.datamodel.sources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonshaw on 17/03/2016.
 */
public class SourceBuilder {
    private boolean disabled;
    private String id;
    private String name;
    private List<SourceUrl> urls;
    private SourceType type;
    private List<String> exclusionList;
    private String publishedDateSelector;
    private String publishedDateFormat;
    private int timezoneOffset;
    private boolean collectDirectlyLinked;
    private List<String> storyTitleRemovals;

    private SourceBuilder() {
    }

    public static SourceBuilder aSource() {
        return new SourceBuilder();
    }

    public SourceBuilder withDisabled(boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public SourceBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public SourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public SourceBuilder withUrls(List<SourceUrl> urls) {
        this.urls = urls;
        return this;
    }

    public SourceBuilder withUrl(SourceUrl url) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }

        urls.add(url);
        return this;
    }

    public SourceBuilder withType(SourceType type) {
        this.type = type;
        return this;
    }

    public SourceBuilder withExclusionList(List<String> exclusionList) {
        this.exclusionList = exclusionList;
        return this;
    }

    public SourceBuilder withPublishedDateSelector(String publishedDateSelector) {
        this.publishedDateSelector = publishedDateSelector;
        return this;
    }

    public SourceBuilder withPublishedDateFormat(String publishedDateFormat) {
        this.publishedDateFormat = publishedDateFormat;
        return this;
    }

    public SourceBuilder withTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    public SourceBuilder withCollectDirectlyLinked(boolean collectDirectlyLinked) {
        this.collectDirectlyLinked = collectDirectlyLinked;
        return this;
    }

    public SourceBuilder withStoryTitleRemovals(List<String> storyTitleRemovals) {
        this.storyTitleRemovals = storyTitleRemovals;
        return this;
    }

    public SourceBuilder but() {
        return aSource().withDisabled(disabled).withId(id).withName(name).withUrls(urls).withType(type).withExclusionList(exclusionList).withPublishedDateSelector(publishedDateSelector).withPublishedDateFormat(publishedDateFormat).withTimezoneOffset(timezoneOffset).withCollectDirectlyLinked(collectDirectlyLinked);
    }

    public Source build() {
        Source source = new Source(id, name, urls, type, exclusionList, publishedDateSelector, publishedDateFormat, timezoneOffset, disabled, collectDirectlyLinked, storyTitleRemovals);
        return source;
    }
}
