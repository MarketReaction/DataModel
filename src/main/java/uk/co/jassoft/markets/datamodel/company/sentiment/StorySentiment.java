package uk.co.jassoft.markets.datamodel.company.sentiment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jonshaw on 11/08/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "storySentiment")
public class StorySentiment extends BaseObject {

    private String company;
    private Date storyDate;
    private String story;
    private List<EntitySentiment> entitySentiment;

    public StorySentiment() {
        super(null);
    }

    @JsonCreator
    public StorySentiment(@JsonProperty("id") String id,
                          @JsonProperty("company") String company,
                          @JsonProperty("storyDate") Date storyDate,
                          @JsonProperty("story") String story,
                          @JsonProperty("entitySentiment") List<EntitySentiment> entitySentiment) {
        super(id);

        this.company = company;
        this.storyDate = storyDate;
        this.story = story;
        this.entitySentiment = entitySentiment;
    }

    public StorySentiment(String company,
                          Date storyDate,
                          String story,
                          List<EntitySentiment> entitySentiment) {
        super(null);

        this.company = company;
        this.storyDate = storyDate;
        this.story = story;
        this.entitySentiment = entitySentiment;
    }

    public StorySentiment(String company, Date storyDate, String story) {
        super(null);

        this.company = company;
        this.storyDate = storyDate;
        this.story = story;
        this.entitySentiment = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof StorySentiment) {
            StorySentiment storySentiment = (StorySentiment) obj;
            return this.story == storySentiment.story;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.story.hashCode();
    }

    public Date getStoryDate() {
        return storyDate;
    }

    public String getStory() {
        return story;
    }

    public List<EntitySentiment> getEntitySentiment() {
        return entitySentiment;
    }

    public String getCompany() {
        return company;
    }
}
