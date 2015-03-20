package com.twu.refactor;

public class Statement {

    private Customer customer;

    public Statement(Customer customer) {
        this.customer = customer;
    }

    public String getFooterLines(double totalAmount, int frequentRenterPoints) {
        String statement = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        statement += "You earned " + String.valueOf(frequentRenterPoints)
                + " frequent renter points";
        return statement;
    }

    public String getHeader() {
        return "Rental Record for " + customer.getName() + "\n";
    }

    public String getStatement() {
        String statement = getHeader();
        for(Rental rental : customer.getRentalList())
            statement += customer.getRentalSubtotal(rental);
        statement += getFooterLines(customer.getTotalAmount(), customer.getTotalFrequentRenterPoints());
        return statement;
    }

}
