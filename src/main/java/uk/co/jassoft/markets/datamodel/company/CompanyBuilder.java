package uk.co.jassoft.markets.datamodel.company;

import uk.co.jassoft.markets.datamodel.story.NamedEntities;

/**
 * Created by jonshaw on 18/05/2016.
 */
public final class CompanyBuilder {
    private String id;
    private String tickerSymbol;
    private String name;
    private String exchange;
    private String companyInformation;
    private NamedEntities entities;

    private CompanyBuilder() {
    }

    public static CompanyBuilder aCompany() {
        return new CompanyBuilder();
    }

    public CompanyBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public CompanyBuilder withTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
        return this;
    }

    public CompanyBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CompanyBuilder withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public CompanyBuilder withCompanyInformation(String companyInformation) {
        this.companyInformation = companyInformation;
        return this;
    }

    public CompanyBuilder withEntities(NamedEntities entities) {
        this.entities = entities;
        return this;
    }

    public Company build() {
        Company company = new Company(id, tickerSymbol, name, exchange, companyInformation, entities);
        return company;
    }
}
