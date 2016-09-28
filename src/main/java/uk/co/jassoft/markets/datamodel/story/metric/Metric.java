package uk.co.jassoft.markets.datamodel.story.metric;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by jonshaw on 22/12/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metric {

    private final int metricOrder;
    private final String name;
    private final Date start;
    private final Date end;
    private final String detail;

    @JsonCreator
    public Metric(@JsonProperty("metricOrder") int metricOrder,
                  @JsonProperty("name") String name,
                  @JsonProperty("start") Date start,
                  @JsonProperty("end") Date end,
                  @JsonProperty("detail") String detail) {
        this.metricOrder = metricOrder;
        this.name = name;
        this.start = start;
        this.end = end;
        this.detail = detail;
    }

    public int getMetricOrder() {
        return metricOrder;
    }

    public String getName() {
        return name;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public String getDetail() {
        return detail;
    }
}
