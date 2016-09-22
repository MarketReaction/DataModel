package com.jassoft.markets.datamodel.sources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by jonshaw on 13/06/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SourceUrl {

    private String url;
    private boolean enabled;
    private Date disabledUntil;
    private Date lastCrawled;
    private Integer crawlInterval;
    private boolean pendingCrawl;

    public SourceUrl() {
    }

    @JsonCreator
    public SourceUrl(@JsonProperty("url") String url,
                     @JsonProperty("enabled") boolean enabled,
                     @JsonProperty("disabledUntil") Date disabledUntil,
                     @JsonProperty("lastCrawled") Date lastCrawled,
                     @JsonProperty("crawlInterval") Integer crawlInterval,
                     @JsonProperty("pendingCrawl") boolean pendingCrawl) {
        this.url = url;
        this.enabled = enabled;
        this.disabledUntil = disabledUntil;
        this.lastCrawled = lastCrawled;
        this.crawlInterval = crawlInterval;
        this.pendingCrawl = pendingCrawl;
    }

    public SourceUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setDisabledUntil(Date disabledUntil) {
        this.disabledUntil = disabledUntil;
    }

    public Date getDisabledUntil() {
        return disabledUntil;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCrawlInterval() {
        return crawlInterval;
    }

    public void setCrawlInterval(Integer crawlInterval) {
        this.crawlInterval = crawlInterval;
    }

    public Date getLastCrawled() {
        return lastCrawled;
    }

    public void setLastCrawled(Date lastCrawled) {
        this.lastCrawled = lastCrawled;
    }

    public boolean isPendingCrawl() {
        return pendingCrawl;
    }

    public void setPendingCrawl(boolean pendingCrawl) {
        this.pendingCrawl = pendingCrawl;
    }
}
