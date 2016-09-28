package uk.co.jassoft.markets.datamodel.learningmodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import uk.co.jassoft.markets.datamodel.Direction;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by jonshaw on 03/09/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "learningModel")
public class LearningModelRecord extends BaseObject {

    private String exchange;
    private String company;

    private Direction previousQuoteDirection;

    private Direction previousSentimentDirection;
    private Double lastSentimentDifferenceFromAverage;
    private Double lastSentiment;

    private Date quoteChangeDate;
    private Double resultingQuoteChange;

    public LearningModelRecord() {
        super(null);
    }

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public LearningModelRecord(@JsonProperty("id") String id,
                               @JsonProperty("exchange") String exchange,
                               @JsonProperty("company") String company,
                               @JsonProperty("previousQuoteDirection") Direction previousQuoteDirection,
                               @JsonProperty("previousSentimentDirection") Direction previousSentimentDirection,
                               @JsonProperty("lastSentimentDifferenceFromAverage") Double lastSentimentDifferenceFromAverage,
                               @JsonProperty("lastSentiment") Double lastSentiment,
                               @JsonProperty("quoteChangeDate") Date quoteChangeDate,
                               @JsonProperty("resultingQuoteChange") Double resultingQuoteChange) {
        super(id);
        this.exchange = exchange;
        this.company = company;
        this.previousQuoteDirection = previousQuoteDirection;
        this.previousSentimentDirection = previousSentimentDirection;
        this.lastSentimentDifferenceFromAverage = lastSentimentDifferenceFromAverage;
        this.lastSentiment = lastSentiment;
        this.quoteChangeDate = quoteChangeDate;
        this.resultingQuoteChange = resultingQuoteChange;
    }

    public LearningModelRecord(String exchange, String company, Direction previousQuoteDirection, Direction previousSentimentDirection, Double lastSentimentDifferenceFromAverage, Double lastSentiment, Date quoteChangeDate) {
        super(null);
        this.exchange = exchange;
        this.company = company;
        this.previousQuoteDirection = previousQuoteDirection;
        this.previousSentimentDirection = previousSentimentDirection;
        this.lastSentimentDifferenceFromAverage = lastSentimentDifferenceFromAverage;
        this.lastSentiment = lastSentiment;
        this.quoteChangeDate = quoteChangeDate;
    }

    public void setResultingQuoteChange(Double resultingQuoteChange) {
        this.resultingQuoteChange = resultingQuoteChange;
    }

    public String getExchange() {
        return exchange;
    }

    public String getCompany() {
        return company;
    }

    public Direction getPreviousQuoteDirection() {
        return previousQuoteDirection;
    }

    public Direction getPreviousSentimentDirection() {
        return previousSentimentDirection;
    }

    public Double getLastSentimentDifferenceFromAverage() {
        return lastSentimentDifferenceFromAverage;
    }

    public Double getResultingQuoteChange() {
        return resultingQuoteChange;
    }

    public Date getQuoteChangeDate() {
        return quoteChangeDate;
    }

    public Double getLastSentiment() {
        return lastSentiment;
    }
}
