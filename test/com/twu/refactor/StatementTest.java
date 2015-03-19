package com.twu.refactor;

import junit.framework.TestCase;
import org.junit.Test;


public class StatementTest extends TestCase {
    @Test
    public void testGetFooterLinesGivesFooterWithSummary(){
        Customer c = new Customer("Dinsdale Pirhana");
        Statement s = new Statement(c);
        String expected = "Amount owed is 13.5\n" +
                "You earned 2 frequent renter points";
        assertTrue(expected.equals(s.getFooterLines(13.5,2)));
    }
    @Test
    public void testGetHeaderLinesGivesHeaderWithSummary(){
        Customer c = new Customer("Dinsdale Pirhana");
        Statement s = new Statement(c);
        String expected = "Rental Record for Dinsdale Pirhana\n";
        assertTrue(expected.equals(s.getHeader()));
    }

    @Test
    public void testStatementGivesTheStatementForWholeCustomer(){
        Customer c = new Customer("Dinsdale Pirhana");
        Statement s = new Statement(c);
        String expected = "Rental Record for Dinsdale Pirhana\n";
        assertTrue(expected.equals(s.getHeader()));
    }

}