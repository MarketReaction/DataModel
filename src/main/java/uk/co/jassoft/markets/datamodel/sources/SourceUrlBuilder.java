package uk.co.jassoft.markets.datamodel.sources;

import java.util.Date;

/**
 * Created by jonshaw on 05/07/2016.
 */
public final class SourceUrlBuilder {
    private String url;
    private boolean enabled;
    private Date disabledUntil;
    private Date lastCrawled;
    private Integer crawlInterval;
    private boolean pendingCrawl;

    private SourceUrlBuilder() {
    }

    public static SourceUrlBuilder aSourceUrl() {
        return new SourceUrlBuilder();
    }

    public SourceUrlBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public SourceUrlBuilder withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public SourceUrlBuilder withDisabledUntil(Date disabledUntil) {
        this.disabledUntil = disabledUntil;
        return this;
    }

    public SourceUrlBuilder withLastCrawled(Date lastCrawled) {
        this.lastCrawled = lastCrawled;
        return this;
    }

    public SourceUrlBuilder withCrawlInterval(Integer crawlInterval) {
        this.crawlInterval = crawlInterval;
        return this;
    }

    public SourceUrlBuilder withPendingCrawl(boolean pendingCrawl) {
        this.pendingCrawl = pendingCrawl;
        return this;
    }

    public SourceUrl build() {
        SourceUrl sourceUrl = new SourceUrl(url, enabled, disabledUntil, lastCrawled, crawlInterval, pendingCrawl);
        return sourceUrl;
    }
}
