/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jonny
 */
@Document(collection = "exchanges")
public class Exchange extends BaseObject
{
    private String code;
    private String name;
    private boolean enabled;
    private boolean intraday;
    private String timeZone;
    private String currency;
    private String country;;

    public Exchange()
    {
        super(null);
    }

    @JsonCreator
    public Exchange(@JsonProperty("id") String id,
            @JsonProperty("code") String code,
            @JsonProperty("name") String name,
            @JsonProperty("enabled") boolean enabled,
            @JsonProperty("intraday") boolean intraday,
            @JsonProperty("timeZone") String timeZone,
            @JsonProperty("currency") String currency,
            @JsonProperty("country") String country)
    {
        super(id);
        
        this.code = code;
        this.name = name;
        this.enabled = enabled;
        this.intraday = intraday;
        this.timeZone = timeZone;
        this.currency = currency;
        this.country = country;
    }

    public Exchange(String code, String name, boolean intraday, String timeZone, String currency, String country)
    {
        super(null);
        this.code = code;
        this.name = name;
        this.enabled = false;
        this.intraday = intraday;
        this.timeZone = timeZone;
        this.currency = currency;
        this.country = country;
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isIntraday() {
        return intraday;
    }

    public void setId(String id)
    {
        super.setId(id);
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exchange exchange = (Exchange) o;

        if (intraday != exchange.intraday) return false;
        if (code != null ? !code.equals(exchange.code) : exchange.code != null) return false;
        if (timeZone != null ? !timeZone.equals(exchange.timeZone) : exchange.timeZone != null) return false;
        if (currency != null ? !currency.equals(exchange.currency) : exchange.currency != null) return false;
        if (country != null ? !country.equals(exchange.country) : exchange.country != null) return false;
        return name != null ? name.equals(exchange.name) : exchange.name == null;

    }
}
