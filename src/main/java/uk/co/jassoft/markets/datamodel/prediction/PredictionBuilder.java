package uk.co.jassoft.markets.datamodel.prediction;

import uk.co.jassoft.markets.datamodel.Direction;

import java.util.Date;

/**
 * Created by jonshaw on 09/12/2015.
 */
public class PredictionBuilder {
    private Boolean correct;
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

    private PredictionBuilder() {
    }

    public static PredictionBuilder aPrediction() {
        return new PredictionBuilder();
    }

    public PredictionBuilder withCorrect(Boolean correct) {
        this.correct = correct;
        return this;
    }

    public PredictionBuilder withCompany(String company) {
        this.company = company;
        return this;
    }

    public PredictionBuilder withPredictionDate(Date predictionDate) {
        this.predictionDate = predictionDate;
        return this;
    }

    public PredictionBuilder withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    public PredictionBuilder withValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public PredictionBuilder withCertainty(Double certainty) {
        this.certainty = certainty;
        return this;
    }

    public PredictionBuilder withPredictedChange(Double predictedChange) {
        this.predictedChange = predictedChange;
        return this;
    }

    public PredictionBuilder withPredictedChangePercent(Double predictedChangePercent) {
        this.predictedChangePercent = predictedChangePercent;
        return this;
    }

    public PredictionBuilder withLastBid(double lastBid) {
        this.lastBid = lastBid;
        return this;
    }

    public PredictionBuilder withLastAsk(double lastAsk) {
        this.lastAsk = lastAsk;
        return this;
    }

    public PredictionBuilder withPotentialEarningPerShare(double potentialEarningPerShare) {
        this.potentialEarningPerShare = potentialEarningPerShare;
        return this;
    }



    public PredictionBuilder but() {
        return aPrediction()
                .withCorrect(correct)
                .withCompany(company)
                .withPredictionDate(predictionDate)
                .withDirection(direction)
                .withValidityPeriod(validityPeriod)
                .withCertainty(certainty)
                .withPredictedChange(predictedChange)
                .withPredictedChangePercent(predictedChangePercent)
                .withLastBid(lastBid)
                .withLastAsk(lastAsk)
                .withPotentialEarningPerShare(potentialEarningPerShare);
    }

    public Prediction build() {
        Prediction prediction = new Prediction(company, predictionDate, direction, validityPeriod, certainty, predictedChange, predictedChangePercent, lastBid, lastAsk, potentialEarningPerShare);
        prediction.setCorrect(correct);
        return prediction;
    }
}
