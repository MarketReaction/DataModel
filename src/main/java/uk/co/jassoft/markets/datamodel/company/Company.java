/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import uk.co.jassoft.markets.datamodel.story.NamedEntities;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jonny
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "companies")
public class Company extends BaseObject
{
    private String tickerSymbol;
    private String name;
    private String exchange;

    private String companyInformation;
    private NamedEntities entities;

    public Company()
    {
        super(null);
    }
    
    @JsonCreator
    public Company(@JsonProperty("id") String id,
                    @JsonProperty("tickerSymbol") String tickerSymbol,
                    @JsonProperty("name") String name,
                    @JsonProperty("exchange") String exchange,
                    @JsonProperty("companyInformation") String companyInformation,
                    @JsonProperty("entities") NamedEntities entities)
    {
        super(id);
        
        this.tickerSymbol = tickerSymbol;
        this.name = name;
        this.exchange = exchange;
        this.companyInformation = companyInformation;
        this.entities = entities;
    }

    public Company(String tickerSymbol, String name, String exchange)
    {
        super(null);
        
        this.tickerSymbol = tickerSymbol;
        this.name = name;
        this.exchange = exchange;
    }

    public String getName()
    {
        return name;
    }

    public String getTickerSymbol()
    {
        return tickerSymbol;
    }

    public String getExchange()
    {
        return exchange;
    }

    public String getCompanyInformation()
    {
        return companyInformation;
    }

    public NamedEntities getEntities()
    {
        return entities;
    }

}
