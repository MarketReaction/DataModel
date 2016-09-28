package uk.co.jassoft.markets.datamodel.sources.errors;

import java.util.Date;

/**
 * Created by jonshaw on 14/07/2016.
 */
public final class SourceErrorBuilder {
    private String id;
    private String source;
    private String url;
    private Integer errorCode;
    private String error;
    private Date date;

    private SourceErrorBuilder() {
    }

    public static SourceErrorBuilder aSourceError() {
        return new SourceErrorBuilder();
    }

    public SourceErrorBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public SourceErrorBuilder withSource(String source) {
        this.source = source;
        return this;
    }

    public SourceErrorBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public SourceErrorBuilder withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public SourceErrorBuilder withError(String error) {
        this.error = error;
        return this;
    }

    public SourceErrorBuilder withDate(Date date) {
        this.date = date;
        return this;
    }

    public SourceError build() {
        SourceError sourceError = new SourceError(id, source, date, url, errorCode, error);
        return sourceError;
    }
}
