package uk.co.jassoft.markets.datamodel.sources.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by jonshaw on 13/06/2016.
 */
@Document(collection = "sourceErrors")
public class SourceError extends BaseObject {

    private String source;
    private String url;
    private Integer errorCode;
    private String error;
    private Date date;

    public SourceError() {
        super(null);
    }

    @JsonCreator
    public SourceError(@JsonProperty("id") String id,
                       @JsonProperty("source") String source,
                       @JsonProperty("date") Date date,
                       @JsonProperty("url") String url,
                       @JsonProperty("errorCode") Integer errorCode,
                       @JsonProperty("error") String error) {
        super(id);
        this.source = source;
        this.date = date;
        this.url = url;
        this.errorCode = errorCode;
        this.error = error;
    }


    public SourceError(String source, Date date, String url, Integer errorCode, String error) {
        super(null);
        this.source = source;
        this.date = date;
        this.url = url;
        this.errorCode = errorCode;
        this.error = error;
    }

    public String getSource() {
        return source;
    }

    public String getUrl() {
        return url;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getError() {
        return error;
    }

    public Date getDate() {
        return date;
    }
}
