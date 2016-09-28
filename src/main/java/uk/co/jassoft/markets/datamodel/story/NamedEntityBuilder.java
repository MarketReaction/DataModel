package uk.co.jassoft.markets.datamodel.story;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by jonshaw on 21/03/2016.
 */
public class NamedEntityBuilder {
    private boolean matched;
    private String name;
    private int count;
    private Collection<Sentiment> sentiments = new ArrayList<>();

    private NamedEntityBuilder() {
    }

    public static NamedEntityBuilder aNamedEntity() {
        return new NamedEntityBuilder();
    }

    public NamedEntityBuilder withMatched(boolean matched) {
        this.matched = matched;
        return this;
    }

    public NamedEntityBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public NamedEntityBuilder withCount(int count) {
        this.count = count;
        return this;
    }

    public NamedEntityBuilder withSentiments(Collection<Sentiment> sentiments) {
        this.sentiments = sentiments;
        return this;
    }

    public NamedEntityBuilder but() {
        return aNamedEntity().withMatched(matched).withName(name).withCount(count).withSentiments(sentiments);
    }

    public NamedEntity build() {
        NamedEntity namedEntity = new NamedEntity(name, count, matched, sentiments);
        return namedEntity;
    }
}
