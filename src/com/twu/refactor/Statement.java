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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String statement = getHeader();
        for(Rental rental : customer.getRentalList()) {
                    double thisAmount = rental.getAmountFor();
        frequentRenterPoints += rental.getFrequentRenterPoints();
        statement += customer.getRentalSubtotal(thisAmount, rental);
        totalAmount += thisAmount;
                }
        statement += this.getFooterLines(totalAmount, frequentRenterPoints);
        return statement;
    }

}
