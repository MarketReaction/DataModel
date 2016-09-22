package com.jassoft.markets.datamodel.company;

/**
 * Created by jonshaw on 24/05/2016.
 */
public class ExchangeBuilder {
    private boolean enabled;
    private String id;
    private String code;
    private String name;
    private boolean intraday;
    private String timeZone;
    private String currency;
    private String country;

    private ExchangeBuilder() {
    }

    public static ExchangeBuilder anExchange() {
        return new ExchangeBuilder();
    }

    public ExchangeBuilder withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ExchangeBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public ExchangeBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public ExchangeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ExchangeBuilder withIntraday(boolean intraday) {
        this.intraday = intraday;
        return this;
    }

    public ExchangeBuilder withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public ExchangeBuilder withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public ExchangeBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public ExchangeBuilder but() {
        return anExchange().withEnabled(enabled).withId(id).withCode(code).withName(name).withIntraday(intraday).withTimeZone(timeZone).withCurrency(currency).withCountry(country);
    }

    public Exchange build() {
        Exchange exchange = new Exchange(code, name, intraday, timeZone, currency, country);
        exchange.setEnabled(enabled);
        exchange.setId(id);
        return exchange;
    }
}
