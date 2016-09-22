package com.jassoft.markets.datamodel.company.sentiment;

import java.util.Date;

public class SentimentByDate {
    private String companyId;
    private Date date;
    private Integer sentiment;

    public SentimentByDate(String companyId, Date date, Integer sentiment) {
        this.companyId = companyId;
        this.date = date;
        this.sentiment = sentiment;
    }

    public SentimentByDate(Date date, Integer sentiment) {
        this.date = date;
        this.sentiment = sentiment;
    }

    public String getCompanyId() {
        return companyId;
    }

    public Date getDate() {
            return date;
        }

    public Integer getSentiment() {
            return sentiment;
    }
    }