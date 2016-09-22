package com.jassoft.markets.datamodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Jonny on 02/09/2014.
 */
public class Page<T> {
    private final int totalRecords;
    private final List<T> data;

    @JsonCreator
    public Page(@JsonProperty("totalRecords") int totalRecords,
                @JsonProperty("data")List<T> data) {
        this.totalRecords = totalRecords;
        this.data = data;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public List<T> getData() {
        return data;
    }
}
