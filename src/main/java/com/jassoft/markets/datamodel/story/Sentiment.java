/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jassoft.markets.datamodel.story;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Jonny
 */
public class Sentiment
{
    private String sentence;
    private int sentiment;

    public Sentiment()
    {

    }
    
    @JsonCreator
    public Sentiment(@JsonProperty("sentence") String sentence, 
                    @JsonProperty("sentiment") int sentiment)
    {
        this.sentence = sentence;
        this.sentiment = sentiment;
    }

    public String getSentence()
    {
        return sentence;
    }

    public int getSentiment()
    {
        return sentiment;
    }

    public void setSentiment(int sentiment) {
        this.sentiment = sentiment;
    }

    @Override
    public boolean equals(Object obj) 
    {
        Sentiment sentimentToCompare = (Sentiment) obj;
        return sentimentToCompare.getSentence().equals(getSentence()) && sentimentToCompare.getSentiment() == getSentiment();
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + (this.sentence != null ? this.sentence.hashCode() : 0);
        hash = 31 * hash + this.sentiment;
        return hash;
    }
}
