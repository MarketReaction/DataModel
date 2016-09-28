package uk.co.jassoft.markets.datamodel.system;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mongodb.BasicDBObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by jonshaw on 25/11/2015.
 */
@Document(collection = "system.profile")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemProfile {

    private final String op;
    private final String ns;
    private final Long responseLength;
    private final Long millis;
    private final Date ts;
    private final BasicDBObject query;
    private final Integer nscanned;
    private final Integer nscannedObjects;
    private final Boolean moved;
    private final Integer nmoved;
    private final Integer nMatched;
    private final Integer nModified;
    private final Integer keyUpdates;
    private final Integer numYield;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public SystemProfile(String op, String ns, Long responseLength, Long millis, Date ts, BasicDBObject query, Integer nscanned, Integer nscannedObjects, Boolean moved, Integer nmoved, Integer nMatched, Integer nModified, Integer keyUpdates, Integer numYield) {
        this.op = op;
        this.ns = ns;
        this.responseLength = responseLength;
        this.millis = millis;
        this.ts = ts;
        this.query = query;
        this.nscanned = nscanned;
        this.nscannedObjects = nscannedObjects;
        this.moved = moved;
        this.nmoved = nmoved;
        this.nMatched = nMatched;
        this.nModified = nModified;
        this.keyUpdates = keyUpdates;
        this.numYield = numYield;
    }

    public String getOp() {
        return op;
    }

    public String getNs() {
        return ns;
    }

    public Long getResponseLength() {
        return responseLength;
    }

    public Long getMillis() {
        return millis;
    }

    public Date getTs() {
        return ts;
    }

    public BasicDBObject getQuery() {
        return query;
    }

    public Integer getNscanned() {
        return nscanned;
    }

    public Integer getNscannedObjects() {
        return nscannedObjects;
    }

    public Boolean getMoved() {
        return moved;
    }

    public Integer getNmoved() {
        return nmoved;
    }

    public Integer getnMatched() {
        return nMatched;
    }

    public Integer getnModified() {
        return nModified;
    }

    public Integer getKeyUpdates() {
        return keyUpdates;
    }

    public Integer getNumYield() {
        return numYield;
    }
}