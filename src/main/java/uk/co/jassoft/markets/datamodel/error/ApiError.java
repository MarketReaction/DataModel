/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.error;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Jonny
 */
public class ApiError
{
    private final int code;
    private final String message;

    public ApiError(@JsonProperty("code") int code, 
                    @JsonProperty("message") String message)
    {
        this.code = code;
        this.message = message;
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }
}
