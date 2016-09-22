package com.jassoft.markets.datamodel.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by jonshaw on 15/08/2016.
 */
public final class UserBuilder {
    private String id;
    private String email;
    private String forename;
    private String surname;
    private String password;
    private boolean activated;
    private String activationId;
    private String token;
    private Date tokenExpiry;
    private Date lastLogin;
    private Collection<String> roles;
    private OAuth2Provider oAuth2Provider;
    private List<String> watchedCompanies = new ArrayList<>();

    private UserBuilder() {
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withForename(String forename) {
        this.forename = forename;
        return this;
    }

    public UserBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withActivated(boolean activated) {
        this.activated = activated;
        return this;
    }

    public UserBuilder withActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }

    public UserBuilder withToken(String token) {
        this.token = token;
        return this;
    }

    public UserBuilder withTokenExpiry(Date tokenExpiry) {
        this.tokenExpiry = tokenExpiry;
        return this;
    }

    public UserBuilder withLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    public UserBuilder withRoles(Collection<String> roles) {
        this.roles = roles;
        return this;
    }

    public UserBuilder withOAuth2Provider(OAuth2Provider oAuth2Provider) {
        this.oAuth2Provider = oAuth2Provider;
        return this;
    }

    public UserBuilder withWatchedCompanies(List<String> watchedCompanies) {
        this.watchedCompanies = watchedCompanies;
        return this;
    }

    public User build() {
        User user = new User(id, email, forename, surname, password, activated, activationId, roles, watchedCompanies, oAuth2Provider);
        return user;
    }
}
