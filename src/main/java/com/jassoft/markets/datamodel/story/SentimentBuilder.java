package com.jassoft.markets.datamodel.story;

/**
 * Created by jonshaw on 18/03/2016.
 */
public class SentimentBuilder {
    private int sentiment;
    private String sentence;

    private SentimentBuilder() {
    }

    public static SentimentBuilder aSentiment() {
        return new SentimentBuilder();
    }

    public SentimentBuilder withSentiment(int sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    public SentimentBuilder withSentence(String sentence) {
        this.sentence = sentence;
        return this;
    }

    public SentimentBuilder but() {
        return aSentiment().withSentiment(sentiment).withSentence(sentence);
    }

    public Sentiment build() {
        Sentiment builtSentiment = new Sentiment(sentence, sentiment);
        return builtSentiment;
    }
}
