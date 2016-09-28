package uk.co.jassoft.markets.datamodel.story;

import java.util.ArrayList;

/**
 * Created by jonshaw on 05/01/2016.
 */
public class NamedEntitiesBuilder {

    private ArrayList<NamedEntity> organisations = new ArrayList<>();
    private ArrayList<NamedEntity> people = new ArrayList<>();
    private ArrayList<NamedEntity> misc = new ArrayList<>();
    private ArrayList<NamedEntity> locations = new ArrayList<>();

    private NamedEntitiesBuilder() {
    }

    public static NamedEntitiesBuilder aNamedEntities() {
        return new NamedEntitiesBuilder();
    }

    public NamedEntitiesBuilder withOrganisation(NamedEntity organisation) {
        this.organisations.add(organisation);
        return this;
    }

    public NamedEntitiesBuilder withPerson(NamedEntity person) {
        this.people.add(person);
        return this;
    }

    public NamedEntitiesBuilder withMisc(NamedEntity misc) {
        this.misc.add(misc);
        return this;
    }

    public NamedEntitiesBuilder withLocation(NamedEntity location) {
        this.locations.add(location);
        return this;
    }

    public NamedEntities build() {
        return new NamedEntities(organisations, people, misc, locations);
    }
}
