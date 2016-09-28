/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.crawler;

import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Jonny
 */
@Document(collection = "links")
public class Link extends BaseObject
{
    private String link;

    public Link()
    {
        super(null);
    }

    public Link(String link)
    {
        super(null);
        this.link = link;
    }

    public Link(@JsonProperty("id") String id,
                    @JsonProperty("link") String link)
    {
        super(id);
        
        this.link = link;
    }

    public String getLink()
    {
        return link;
    }
}
