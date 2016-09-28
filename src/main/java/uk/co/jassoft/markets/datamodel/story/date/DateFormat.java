package uk.co.jassoft.markets.datamodel.story.date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jonshaw on 22/01/15.
 */
@Document(collection = "dateFormats")
public class DateFormat extends BaseObject
{
    private String format;

    public DateFormat() {
        super(null);
    }

    public DateFormat(String format)
    {
        super(null);
        this.format = format;
    }

    @JsonCreator
    public DateFormat(@JsonProperty("id") String id,
                     @JsonProperty("format") String format)
    {
        super(id);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
