package com.jassoft.markets.datamodel.exclusion;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jonshaw on 06/01/15.
 */

@Document(collection = "exclusions")
public class Exclusion extends BaseObject
{
    private String name;
    private boolean autoAdded;

    public Exclusion() {
        super(null);
    }

    public Exclusion(String name)
    {
        this(name, false);
    }

    public Exclusion(String name, boolean autoAdded)
    {
        super(null);
        this.name = name;
        this.autoAdded = autoAdded;
    }

    @JsonCreator
    public Exclusion(@JsonProperty("id") String id,
                     @JsonProperty("name") String name,
                     @JsonProperty("autoAdded") boolean autoAdded)
    {
        super(id);
        this.name = name;
        this.autoAdded = autoAdded;
    }

    public String getName() {
        return name;
    }

    public boolean getAutoAdded() {
        return autoAdded;
    }
}
