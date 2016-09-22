/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jassoft.markets.datamodel.story;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Jonny
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NamedEntity
{
    private String name;
    private int count;

    private boolean matched;
    private Collection<Sentiment> sentiments = new ArrayList<>();

    public NamedEntity()
    {
    }

    @JsonCreator
    public NamedEntity(@JsonProperty("name") String name,
                @JsonProperty("count") int count,
                @JsonProperty("matched") boolean matched,
                @JsonProperty("sentiments") Collection<Sentiment> sentiments)
    {
        this.name = name;
        this.count = count;
        this.matched = matched;
        this.sentiments = sentiments;
    }

    public NamedEntity(String name)
    {
        this.name = name;
        this.count = 1;
        this.matched = false;
        this.sentiments = new ArrayList<>();
    }

    public int getCount()
    {
        return count;
    }

    @JsonIgnore
    public void increment()
    {
        count = count + 1;
    }

    @JsonIgnore
    public void decrease()
    {
        count = count - 1;
    }

    public String getName()
    {
        return name;
    }

    public Collection<Sentiment> getSentiments()
    {
        return sentiments;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    @Override
    public boolean equals(Object obj) 
    {
        NamedEntity namedEntityToCompare = (NamedEntity) obj;
        return namedEntityToCompare.getName().equals(name);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return name + " (" + count + ")";
    }
}
