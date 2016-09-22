package com.jassoft.markets.datamodel.company.quote;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by jonshaw on 12/02/2016.
 */
public class QuoteTest {

    @Test
    public void testEquals_evaluatesTrueWhenObjectsMatch() throws Exception {

        Date date = new Date();

        final Quote quote1 = new Quote("1234567890", "TestCompany", date, 100, 150, 200, 50, new BigInteger("100000"), new BigInteger("50000"), 0, 0, 152, 149, null, null, false);

        final Quote quote2 = new Quote("TestCompany", date, 100, 150, 200, 50, new BigInteger("100000"), new BigInteger("50000"), 152, 149, false);

        assertTrue(quote2.equals(quote1));
    }
}