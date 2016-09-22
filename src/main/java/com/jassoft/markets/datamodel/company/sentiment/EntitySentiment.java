package com.jassoft.markets.datamodel.company.sentiment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jonshaw on 24/08/15.
 */
public class EntitySentiment {
    private String entity;
    private Integer sentiment;

    public EntitySentiment() {
    }

    @JsonCreator
    public EntitySentiment(@JsonProperty("entity") String entity,
                           @JsonProperty("sentiment") Integer sentiment) {
        this.entity = entity;
        this.sentiment = sentiment;
    }

    public String getEntity() {
        return entity;
    }

    public Integer getSentiment() {
        return sentiment;
    }
}
