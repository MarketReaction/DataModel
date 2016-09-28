/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.story;

import uk.co.jassoft.markets.datamodel.story.metric.Metric;

import java.net.URL;
import java.util.Date;
import java.util.List;


public class StoryBuilder
{
    private String id;
    private URL url;
    private Date dateFound;
    private String title;
    private String body;
    private String parentSource;
    private Date datePublished;
    private NamedEntities entities;
    private List<String> matchedCompanies;
    private int sentiment;
    private List<Metric> metrics;

    public StoryBuilder()
    {
    }

    public StoryBuilder setId(String id)
    {
        this.id = id;
        return this;
    }

    public StoryBuilder setUrl(URL url)
    {
        this.url = url;
        return this;
    }

    public StoryBuilder setDateFound(Date dateFound)
    {
        this.dateFound = dateFound;
        return this;
    }

    public StoryBuilder setTitle(String title)
    {
        this.title = title;
        return this;
    }

    public StoryBuilder setBody(String body)
    {
        this.body = body;
        return this;
    }

    public StoryBuilder setParentSource(String parentSource)
    {
        this.parentSource = parentSource;
        return this;
    }

    public StoryBuilder setDatePublished(Date datePublished)
    {
        this.datePublished = datePublished;
        return this;
    }

    public StoryBuilder setEntities(NamedEntities entities)
    {
        this.entities = entities;
        return this;
    }

    public StoryBuilder setMatchedCompanies(List<String> matchedCompanies)
    {
        this.matchedCompanies = matchedCompanies;
        return this;
    }

    public StoryBuilder setSentiment(int sentiment)
    {
        this.sentiment = sentiment;
        return this;
    }

    public StoryBuilder setMetrics(List<Metric> metrics)
    {
        this.metrics = metrics;
        return this;
    }

    public Story createStory()
    {
        return new Story(id, url, dateFound, title, body, parentSource, datePublished, entities, matchedCompanies, sentiment, metrics);
    }
    
}
