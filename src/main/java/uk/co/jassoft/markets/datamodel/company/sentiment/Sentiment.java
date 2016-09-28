/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.company.sentiment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jonny
 */
@Document(collection = "sentimentsGrouped")
@Deprecated
public class Sentiment extends BaseObject
{
    private Date periodStart;
    private PeriodType periodType;
    private String company;
    private int sentiment = 0;
    private List<String> stories = new ArrayList<>();

//    Additional Info For Display
    private String companyName;

    public Sentiment()
    {
        super(null);
    }

    @JsonCreator
    public Sentiment(@JsonProperty("id")String id,
                    @JsonProperty("company") String company, 
                    @JsonProperty("periodStart") Date periodStart, 
                    @JsonProperty("periodType") PeriodType periodType, 
                    @JsonProperty("sentiment") int sentiment, 
                    @JsonProperty("stories") List<String> stories)
    {
        super(id);
        
        this.company = company;
        this.periodStart = periodStart;
        this.periodType = periodType;
        this.sentiment = sentiment;
        this.stories = stories;
    }

    public Sentiment(String company, Date periodStart, PeriodType periodType, int sentiment, String story)
    {
        super(null);
        
        this.company = company;
        this.periodStart = periodStart;
        this.periodType = periodType;
        this.sentiment = sentiment;
        this.stories.add(story);
    }

    public Sentiment(String company, Date periodStart, PeriodType periodType)
    {
        super(null);
        
        this.company = company;
        this.periodStart = periodStart;
        this.periodType = periodType;
    }

    public Sentiment(Sentiment sentiment) {
        super(null);

        this.periodStart = sentiment.getPeriodStart();
        this.periodType = sentiment.getPeriodType();
        this.company = sentiment.getCompany();
        this.sentiment = sentiment.getSentiment();
        this.stories = sentiment.getStories();
        this.companyName = sentiment.getCompanyName();
    }

    public Sentiment(Sentiment sentiment, Date withDate) {
        this(sentiment);

        this.periodStart = withDate;
    }

    public Date getPeriodStart()
    {
        return periodStart;
    }

    public PeriodType getPeriodType()
    {
        return periodType;
    }

    public int getSentiment()
    {
        return sentiment;
    }

    public String getCompany()
    {
        return company;
    }
    
    public List<String> getStories()
    {
        return stories;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
