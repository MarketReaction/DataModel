package com.jassoft.markets.datamodel.story.metric;

import java.util.Date;

/**
 * Created by jonshaw on 22/12/2015.
 */
public class MetricBuilder {

    private final static int METRIC_CRAWLER = 1;
    private final static int METRIC_COLLECT = 2;
    private final static int METRIC_ANALYSE = 3;
    private final static int METRIC_MATCH = 4;
    private final static int METRIC_SENTIMENT = 5;

    private final int metricOrder;
    private final String name;
    private Date start;
    private Date end;
    private String detail;

    private MetricBuilder(int metricOrder, String name) {
        this.metricOrder = metricOrder;
        this.name = name;
    }

    public static MetricBuilder aCrawlerMetric() {
        return new MetricBuilder(METRIC_CRAWLER, "Crawler");
    }
    public static MetricBuilder aCollectMetric() {
        return new MetricBuilder(METRIC_COLLECT, "Collect");
    }
    public static MetricBuilder anAnalyseMetric() {
        return new MetricBuilder(METRIC_ANALYSE, "Analyse");
    }
    public static MetricBuilder aMatchMetric() {
        return new MetricBuilder(METRIC_MATCH, "Match");
    }
    public static MetricBuilder aSentimentMetric() {
        return new MetricBuilder(METRIC_SENTIMENT, "Sentiment");
    }

    public MetricBuilder withStart(Date start) {
        this.start = start;
        return this;
    }

    public MetricBuilder withEnd(Date end) {
        this.end = end;
        return this;
    }

    public MetricBuilder withEndNow() {
        this.end = new Date();
        return this;
    }

    public MetricBuilder withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public Metric build() {
        Metric metric = new Metric(metricOrder, name, start, end, detail);
        return metric;
    }
}
