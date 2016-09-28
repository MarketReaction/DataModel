package uk.co.jassoft.markets.datamodel.company;

/**
 * Created by jonshaw on 25/01/2016.
 */
public class CompanyCount {
    private final String company;
    private final int count;

    public CompanyCount(String company, int count) {
        this.company = company;
        this.count = count;
    }

    public String getCompany() {
        return company;
    }

    public int getCount() {
        return count;
    }

}