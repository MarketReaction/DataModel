package com.jassoft.markets.datamodel.learningmodel;

import com.jassoft.markets.datamodel.Direction;

import java.util.Date;

/**
 * Created by jonshaw on 09/12/2015.
 */
public class LearningModelRecordBuilder {
    private double resultingQuoteChange;
    private String company;
    private Direction previousQuoteDirection;
    private Direction previousSentimentDirection;
    private double lastSentimentDifferenceFromAverage;
    private double lastSentiment;
    private Date quoteChangeDate;
    private String exchange;

    private LearningModelRecordBuilder() {
    }

    public static LearningModelRecordBuilder aLearningModelRecord() {
        return new LearningModelRecordBuilder();
    }

    public LearningModelRecordBuilder withResultingQuoteChange(double resultingQuoteChange) {
        this.resultingQuoteChange = resultingQuoteChange;
        return this;
    }

    public LearningModelRecordBuilder withCompany(String company) {
        this.company = company;
        return this;
    }

    public LearningModelRecordBuilder withPreviousQuoteDirection(Direction previousQuoteDirection) {
        this.previousQuoteDirection = previousQuoteDirection;
        return this;
    }

    public LearningModelRecordBuilder withPreviousSentimentDirection(Direction previousSentimentDirection) {
        this.previousSentimentDirection = previousSentimentDirection;
        return this;
    }

    public LearningModelRecordBuilder withLastSentimentDifferenceFromAverage(double lastSentimentDifferenceFromAverage) {
        this.lastSentimentDifferenceFromAverage = lastSentimentDifferenceFromAverage;
        return this;
    }

    public LearningModelRecordBuilder withLastSentiment(double lastSentiment) {
        this.lastSentiment = lastSentiment;
        return this;
    }

    public LearningModelRecordBuilder withQuoteChangeDate(Date quoteChangeDate) {
        this.quoteChangeDate = quoteChangeDate;
        return this;
    }

    public LearningModelRecordBuilder withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public LearningModelRecordBuilder but() {
        return aLearningModelRecord().withResultingQuoteChange(resultingQuoteChange).withCompany(company).withPreviousQuoteDirection(previousQuoteDirection).withPreviousSentimentDirection(previousSentimentDirection).withLastSentimentDifferenceFromAverage(lastSentimentDifferenceFromAverage).withLastSentiment(lastSentiment).withQuoteChangeDate(quoteChangeDate).withExchange(exchange);
    }

    public LearningModelRecord build() {
        LearningModelRecord learningModelRecord = new LearningModelRecord(exchange, company, previousQuoteDirection, previousSentimentDirection, lastSentimentDifferenceFromAverage, lastSentiment, quoteChangeDate);
        learningModelRecord.setResultingQuoteChange(resultingQuoteChange);
        return learningModelRecord;
    }
}
