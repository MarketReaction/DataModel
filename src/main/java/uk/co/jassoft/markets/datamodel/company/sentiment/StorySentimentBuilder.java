package uk.co.jassoft.markets.datamodel.company.sentiment;

import java.util.Date;
import java.util.List;

/**
 * Created by jonshaw on 16/03/2016.
 */
public class StorySentimentBuilder {
    private String company;
    private Date storyDate;
    private String story;
    private List<EntitySentiment> entitySentiment;

    private StorySentimentBuilder() {
    }

    public static StorySentimentBuilder aStorySentiment() {
        return new StorySentimentBuilder();
    }

    public StorySentimentBuilder withCompany(String company) {
        this.company = company;
        return this;
    }

    public StorySentimentBuilder withStoryDate(Date storyDate) {
        this.storyDate = storyDate;
        return this;
    }

    public StorySentimentBuilder withStory(String story) {
        this.story = story;
        return this;
    }

    public StorySentimentBuilder withEntitySentiment(List<EntitySentiment> entitySentiment) {
        this.entitySentiment = entitySentiment;
        return this;
    }

    public StorySentimentBuilder but() {
        return aStorySentiment().withStoryDate(storyDate).withStory(story).withEntitySentiment(entitySentiment);
    }

    public StorySentiment build() {
        StorySentiment storySentiment = new StorySentiment(company, storyDate, story, entitySentiment);
        return storySentiment;
    }
}
