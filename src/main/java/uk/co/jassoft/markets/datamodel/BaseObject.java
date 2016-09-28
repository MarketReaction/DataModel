/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.jassoft.markets.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Jonny
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseObject
{
    @Id
    private String id;

    protected BaseObject(String id)
    {
        this.id = id;
    }

    @Id
    public String getId()
    {
        return id;
    }
        
    @Id
    protected void setId(String id)
    {
        this.id = id;
    }
}
