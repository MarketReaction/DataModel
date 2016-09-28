package uk.co.jassoft.markets.datamodel.prediction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import uk.co.jassoft.markets.datamodel.BaseObject;
import uk.co.jassoft.markets.datamodel.Direction;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by jonshaw on 08/12/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "predictions")
public class Prediction extends BaseObject {

    private String company;
    private Date predictionDate;
    private Direction direction;
    private Long validityPeriod;
    private Double certainty;
    private Double predictedChange;
    private Double predictedChangePercent;

    private double lastBid;
    private double lastAsk;
    private double potentialEarningPerShare;

    private Boolean correct;
    private Double actualChange;
    private Double actualEarningPerShare;

    public Prediction() {
        super(null);
    }

    public Prediction(String company, Date predictionDate, Direction direction, Long validityPeriod, Double certainty, Double predictedChange, Double predictedChangePercent, double lastBid, double lastAsk, double potentialEarningPerShare) {
        super(null);
        this.company = company;
        this.predictionDate = predictionDate;
        this.direction = direction;
        this.validityPeriod = validityPeriod;
        this.certainty = certainty;
        this.predictedChange = predictedChange;
        this.predictedChangePercent = predictedChangePercent;
        this.lastBid = lastBid;
        this.lastAsk = lastAsk;
        this.potentialEarningPerShare = potentialEarningPerShare;
    }

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public Prediction(String id, String company, Date predictionDate, Direction direction, Long validityPeriod, Double certainty, Double predictedChange, Double predictedChangePercent, double lastBid, double lastAsk, double potentialEarningPerShare, Boolean correct, Double actualChange, Double actualEarningPerShare) {
        super(id);
        this.company = company;
        this.predictionDate = predictionDate;
        this.direction = direction;
        this.validityPeriod = validityPeriod;
        this.certainty = certainty;
        this.predictedChange = predictedChange;
        this.predictedChangePercent = predictedChangePercent;
        this.lastBid = lastBid;
        this.lastAsk = lastAsk;
        this.potentialEarningPerShare = potentialEarningPerShare;
        this.correct = correct;
        this.actualChange = actualChange;
        this.actualEarningPerShare = actualEarningPerShare;
    }

    public Date getPredictionDate() {
        return predictionDate;
    }

    public Direction getDirection() {
        return direction;
    }

    public Long getValidityPeriod() {
        return validityPeriod;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Double getCertainty() {
        return certainty;
    }

    public void setCertainty(Double certainty) {
        this.certainty = certainty;
    }

    public String getCompany() {
        return company;
    }

    public Double getPredictedChange() {
        return predictedChange;
    }

    public Double getPredictedChangePercent() {
        return predictedChangePercent;
    }

    public double getLastBid() {
        return lastBid;
    }

    public double getLastAsk() {
        return lastAsk;
    }

    public double getPotentialEarningPerShare() {
        return potentialEarningPerShare;
    }

    public Double getActualChange() {
        return actualChange;
    }

    public void setActualChange(Double actualChange) {
        this.actualChange = actualChange;
    }

    public Double getActualEarningPerShare() {
        return actualEarningPerShare;
    }

    public void setActualEarningPerShare(Double actualEarningPerShare) {
        this.actualEarningPerShare = actualEarningPerShare;
    }
}
