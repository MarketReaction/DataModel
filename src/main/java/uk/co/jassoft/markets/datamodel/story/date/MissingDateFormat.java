package uk.co.jassoft.markets.datamodel.story.date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by jonshaw on 22/01/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "missingDateFormats")
public class MissingDateFormat extends BaseObject
{
    private String metatag;
    private Date date_found;

    public MissingDateFormat() {
        super(null);
    }

    public MissingDateFormat(String metatag, Date date_found)
    {
        super(null);
        this.metatag = metatag;
        this.date_found = date_found;
    }

    @JsonCreator
    public MissingDateFormat(@JsonProperty("id") String id,
                             @JsonProperty("metatag") String metatag,
                             @JsonProperty("date_found") Date date_found)
    {
        super(id);
        this.metatag = metatag;
        this.date_found = date_found;
    }

    public String getMetatag() {
        return metatag;
    }

    public Date getDate_found() {
        return date_found;
    }
}
