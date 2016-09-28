/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.jassoft.markets.datamodel.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.jassoft.markets.datamodel.BaseObject;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

/**
 *
 * @author Jonny
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "users")
public class User extends BaseObject
{
    @NotNull
    @Size(min = 6, message = "{validation.user.email.length}")
    private String email;
    
    @NotNull
    @Size(min = 2)
    private String forename;
    
    @NotNull
    @Size(min = 2)
    private String surname;

    @Size(min = 6)
    private String password;
    
    private boolean activated;
    private String activationId;
    private final Collection<String> roles;
    private String token;
    private Date tokenExpiry;
    private Date lastLogin;
    private OAuth2Provider oAuth2Provider;

    private List<String> watchedCompanies = new ArrayList<>();

    public User()
    {
        super(null);
        this.email = null;
        this.forename = null;
        this.surname = null;
        this.password = null;
        this.activated = false;
        this.oAuth2Provider = null;

        roles = new ArrayList<>();
    }

    public User(@JsonProperty("id") String id,
                @JsonProperty("email") String email,
                @JsonProperty("forename") String forename,
                @JsonProperty("surname") String surname,
                @JsonProperty("password") String password,
                @JsonProperty("activated") boolean activated,
                @JsonProperty("activationId") String activationId,
                @JsonProperty("roles") Collection<String> roles,
                @JsonProperty("watchedCompanies") List<String> watchedCompanies,
                @JsonProperty("oAuth2Provider") OAuth2Provider oAuth2Provider)
    {
        super(id);

        this.email = email;
        this.forename = forename;
        this.surname = surname;
        this.password = password;
        this.activated = activated;
        this.activationId = activationId;
        this.roles = (roles != null) ? roles : new ArrayList<String>();
        this.watchedCompanies = watchedCompanies;
        this.oAuth2Provider = oAuth2Provider;
    }

    public String getEmail()
    {
        return email;
    }

    public String getForename()
    {
        return forename;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getPassword()
    {
        return password;
    }

    public boolean isActivated()
    {
        return activated;
    }

    public String getActivationId()
    {
        return activationId;
    }

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setForename(String forename)
    {
        this.forename = forename;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setActivated(boolean activated)
    {
        this.activated = activated;
    }

    public Collection<String> getRoles()
    {
        return roles;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTokenExpiry(Date tokenExpiry) {
        this.tokenExpiry = tokenExpiry;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getTokenExpiry() {
        return tokenExpiry;
    }

    public String getToken() {
        return token;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public List<String> getWatchedCompanies() {
        return watchedCompanies;
    }

    public OAuth2Provider getoAuth2Provider() {
        return oAuth2Provider;
    }

    public User clean()
    {
        password = null;
        activationId = null;

        return this;
    }
}
