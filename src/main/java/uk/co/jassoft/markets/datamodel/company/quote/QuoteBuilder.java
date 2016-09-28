package uk.co.jassoft.markets.datamodel.company.quote;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by jonshaw on 23/05/2016.
 */
public final class QuoteBuilder {
    private String company;
    private String id;
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

    private QuoteBuilder() {
    }

    public static QuoteBuilder aQuote() {
        return new QuoteBuilder();
    }

    public QuoteBuilder withCompany(String company) {
        this.company = company;
        return this;
    }

    public QuoteBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public QuoteBuilder withDate(Date date) {
        this.date = date;
        return this;
    }

    public QuoteBuilder withOpen(double open) {
        this.open = open;
        return this;
    }

    public QuoteBuilder withClose(double close) {
        this.close = close;
        return this;
    }

    public QuoteBuilder withHigh(double high) {
        this.high = high;
        return this;
    }

    public QuoteBuilder withLow(double low) {
        this.low = low;
        return this;
    }

    public QuoteBuilder withVolume(BigInteger volume) {
        this.volume = volume;
        return this;
    }

    public QuoteBuilder withOpenInterest(BigInteger openInterest) {
        this.openInterest = openInterest;
        return this;
    }

    public QuoteBuilder withPrevious(double previous) {
        this.previous = previous;
        return this;
    }

    public QuoteBuilder withChange(double change) {
        this.change = change;
        return this;
    }

    public QuoteBuilder withBid(double bid) {
        this.bid = bid;
        return this;
    }

    public QuoteBuilder withAsk(double ask) {
        this.ask = ask;
        return this;
    }

    public QuoteBuilder withPreviousClose(BigInteger previousClose) {
        this.previousClose = previousClose;
        return this;
    }

    public QuoteBuilder withNextOpen(BigInteger nextOpen) {
        this.nextOpen = nextOpen;
        return this;
    }

    public QuoteBuilder withIntraday(boolean intraday) {
        this.intraday = intraday;
        return this;
    }

    public Quote build() {
        Quote quote = new Quote(id, company, date, open, close, high, low, volume, openInterest, previous, change, bid, ask, previousClose, nextOpen, intraday);
        return quote;
    }
}
