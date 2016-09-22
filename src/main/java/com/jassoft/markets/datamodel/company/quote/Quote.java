package com.jassoft.markets.datamodel.company.quote;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Jonny on 01/09/2014.
 */
@Document(collection = "quotes")
public class Quote extends BaseObject
{
    private String company;
    private Date date;
    private double open;
    private double close;
    private double high;
    private double low;
    private BigInteger volume;
    private BigInteger openInterest;
    private double previous;
    private double change;
    private double bid;
    private double ask;
    private BigInteger previousClose;
    private BigInteger nextOpen;

    private boolean intraday;

    public Quote() {
        super(null);
    }

    @JsonCreator
    public Quote(@JsonProperty("id") String id,
                 @JsonProperty("company") String company,
                 @JsonProperty("date") Date date,
                 @JsonProperty("open") double open,
                 @JsonProperty("close") double close,
                 @JsonProperty("high") double high,
                 @JsonProperty("low") double low,
                 @JsonProperty("volume") BigInteger volume,
                 @JsonProperty("openInterest") BigInteger openInterest,
                 @JsonProperty("previous") double previous,
                 @JsonProperty("change") double change,
                 @JsonProperty("bid") double bid,
                 @JsonProperty("ask") double ask,
                 @JsonProperty("previousClose") BigInteger previousClose,
                 @JsonProperty("nextOpen") BigInteger nextOpen,
                 @JsonProperty("intraday") boolean intraday) {
        super(id);
        this.company = company;
        this.date = date;
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
        this.volume = volume;
        this.openInterest = openInterest;
        this.previous = previous;
        this.change = change;
        this.bid = bid;
        this.ask = ask;
        this.previousClose = previousClose;
        this.nextOpen = nextOpen;
        this.intraday = intraday;
    }

    public Quote(Quote quoteToClone)
    {
        super(null);

        this.company = quoteToClone.getCompany();
        this.date = quoteToClone.getDate();
        this.open = quoteToClone.getOpen();
        this.close = quoteToClone.getClose();
        this.high = quoteToClone.getHigh();
        this.low = quoteToClone.getLow();
        this.volume = quoteToClone.getVolume();
        this.openInterest = quoteToClone.getOpenInterest();
        this.previous = quoteToClone.getPrevious();
        this.change = quoteToClone.getChange();
        this.bid = quoteToClone.getBid();
        this.ask = quoteToClone.getAsk();
        this.previousClose = quoteToClone.getPreviousClose();
        this.nextOpen = quoteToClone.getNextOpen();
        this.intraday = quoteToClone.isIntraday();
    }

    public Quote(Quote quoteToClone, Date withDate)
    {
        this(quoteToClone);

        this.date = withDate;
    }

    public Quote(String company, Date date, double open, double close, double high, double low, BigInteger volume, BigInteger openInterest, double bid, double ask, boolean intraday)
    {
        super(null);

        this.company = company;
        this.date = date;
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
        this.volume = volume;
        this.openInterest = openInterest;
        this.bid = bid;
        this.ask = ask;
        this.intraday = intraday;
    }

    @Override
    public void setId(String id)
    {
        super.setId(id);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getDate() {
        return date;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public BigInteger getVolume() {
        return volume;
    }

    public BigInteger getOpenInterest() {
        return openInterest;
    }

    public double getPrevious() {
        return previous;
    }

    public double getChange() {
        return change;
    }

    public double getBid() {
        return bid;
    }

    public double getAsk() {
        return ask;
    }

    public BigInteger getPreviousClose() {
        return previousClose;
    }

    public BigInteger getNextOpen() {
        return nextOpen;
    }

    public boolean isIntraday() {
        return intraday;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Quote) {
            Quote quote = (Quote) obj;
            return (quote.getCompany() == null ? company == null : quote.getCompany().equals(company) &&
                    quote.getDate() == null ? date == null : quote.getDate().equals(date) &&
                    quote.getOpen() == open &&
                    quote.getClose() == close &&
                    quote.getHigh() == high &&
                    quote.getLow() == low &&
                    quote.getVolume() == null ? volume == null : quote.getVolume().equals(volume) &&
                    quote.getOpenInterest() == null ? openInterest == null : quote.getOpenInterest().equals(openInterest) &&
                    quote.getPrevious() == previous &&
                    quote.getChange() == change &&
                    quote.getBid() == bid &&
                    quote.getAsk() == ask &&
                    quote.isIntraday() == intraday &&
                    quote.getPreviousClose() == null ? previousClose == null : quote.getPreviousClose().equals(previousClose) &&
                    quote.getNextOpen() == null ? nextOpen == null : quote.getNextOpen().equals(nextOpen));
        }
        return false;
    }
}
