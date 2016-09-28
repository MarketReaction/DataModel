package uk.co.jassoft.markets.datamodel.story.date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jonshaw on 22/01/15.
 */
@Document(collection = "missingDateFormats")
public class MissingDateFormat extends BaseObject
{
    private String metatag;

    public MissingDateFormat() {
        super(null);
    }

    public MissingDateFormat(String metatag)
    {
        super(null);
        this.metatag = metatag;
    }

    @JsonCreator
    public MissingDateFormat(@JsonProperty("id") String id,
                             @JsonProperty("metatag") String metatag)
    {
        super(id);
        this.metatag = metatag;
    }

    public String getMetatag() {
        return metatag;
    }
}
