/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jassoft.markets.datamodel.story;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Jonny
 */
public class NamedEntities
{
    private Collection<NamedEntity> organisations = new ArrayList<>();
    private Collection<NamedEntity> people = new ArrayList<>();
    private Collection<NamedEntity> misc = new ArrayList<>();
    private Collection<NamedEntity> locations = new ArrayList<>();
        
    @JsonCreator
    public NamedEntities(@JsonProperty("organisations") ArrayList<NamedEntity> organisations,
                @JsonProperty("people") ArrayList<NamedEntity> people,
                @JsonProperty("misc") ArrayList<NamedEntity> misc,
                @JsonProperty("locations") ArrayList<NamedEntity> locations)
    {
        this.organisations = organisations;
        this.people = people;
        this.misc = misc;
        this.locations = locations;
    }

    public NamedEntities()
    {
    }

    public Collection<NamedEntity> getLocations()
    {
        return locations;
    }

    public Collection<NamedEntity> getMisc()
    {
        return misc;
    }

    public Collection<NamedEntity> getOrganisations()
    {
        return organisations;
    }

    public Collection<NamedEntity> getPeople()
    {
        return people;
    }

    public static void addAndIncrementEntity(Collection<NamedEntity> collection, final String name, final String sentence)
    {
        final String strippedName = name.replaceAll("[^a-zA-Z0-9:\\s\\-]", "").trim();
        
        Sentiment sentenceSentiment = new Sentiment(sentence, 0);

        for(NamedEntity entity : collection)
        {
            if(entity.getName().equalsIgnoreCase(strippedName))
            {
                entity.increment();
                
                if(!entity.getSentiments().contains(sentenceSentiment))
                    entity.getSentiments().add(sentenceSentiment);
                
                return;
            }                
        }

        NamedEntity entity = new NamedEntity(strippedName);
        entity.getSentiments().add(sentenceSentiment);
        
        collection.add(entity);
    }

    public static void setEntitySentiment(Collection<NamedEntity> collection, final String name, final String sentence, final int sentiment)
    {
        final String strippedName = name.replaceAll("[^a-zA-Z0-9\\s\\-]", "");

        collection.stream().filter(namedEntity -> namedEntity.getName().equalsIgnoreCase(strippedName)).forEach(namedEntity -> {

                namedEntity.getSentiments().stream().filter(s -> s.getSentence().equals(sentence)).forEach(s -> s.setSentiment(sentiment));
        });

    }




}
