/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jassoft.markets.datamodel.story;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jassoft.markets.datamodel.BaseObject;
import com.jassoft.markets.datamodel.story.metric.Metric;
import org.springframework.data.mongodb.core.mapping.Document;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jonny
 */
@Document(collection = "stories")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Story extends BaseObject
{
    private URL url;
    private Date dateFound;
    private String title;
    private String body;
    private Date datePublished;
    private NamedEntities entities;
    
    private String parentSource;

    private List<String> matchedCompanies;
    
    private int sentiment;

    private List<Metric> metrics;

    public Story()
    {
        super(null);
        metrics = new ArrayList<>();
    }

    @JsonCreator
    public Story(@JsonProperty("id") String id,
                    @JsonProperty("url") URL url,
                    @JsonProperty("dateFound") Date dateFound,
                    @JsonProperty("title") String title,
                    @JsonProperty("body") String body,
                    @JsonProperty("parentSource") String parentSource,
                    @JsonProperty("datePublished") Date datePublished,
                    @JsonProperty("keywords") NamedEntities entities,
                    @JsonProperty("matchedCompanies") List<String> matchedCompanies,
                    @JsonProperty("sentiment") int sentiment,
                    @JsonProperty("metrics") List<Metric> metrics)
    {
        super(id);
        
        this.url = url;
        this.dateFound = dateFound;
        this.body = body;
        this.parentSource = parentSource;
        this.datePublished = datePublished;
        this.entities = entities;
        this.sentiment = sentiment;
        this.matchedCompanies = matchedCompanies;
        this.metrics = metrics;
    }

    public Story(String title, URL url, Date dateFound, String parentSource)
    {
        super(null);
        
        this.title = title;
        this.url = url;
        this.dateFound = dateFound;
        this.parentSource = parentSource;
        this.metrics = new ArrayList<>();
    }

    public URL getUrl()
    {
        return url;
    }

    public String getBody()
    {
        return body;
    }

    public Date getDateFound()
    {
        return dateFound;
    }

    public String getParentSource()
    {
        return parentSource;
    }

    public String getTitle()
    {
        return title;
    }

    public Date getDatePublished()
    {
        return datePublished;
    }

    public NamedEntities getEntities()
    {
        return entities;
    }

    public int getSentiment()
    {
        return sentiment;
    }

    public void setSentiment(int sentiment)
    {
        this.sentiment = sentiment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public List<String> getMatchedCompanies() {
        if(matchedCompanies == null) {
            matchedCompanies = new ArrayList<>();
        }

        return matchedCompanies;
    }

    public List<Metric> getMetrics() {
        return metrics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Story story = (Story) o;

        if (title != null ? !title.equals(story.title) : story.title != null) return false;
        if (body != null ? !body.equals(story.body) : story.body != null) return false;
        return datePublished != null ? datePublished.equals(story.datePublished) : story.datePublished == null;

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (datePublished != null ? datePublished.hashCode() : 0);
        return result;
    }
}
