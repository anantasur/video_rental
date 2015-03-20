package com.twu.refactor;

import java.util.ArrayList;

public class Customer {

	private String name;

    private ArrayList<Rental> rentalList = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

    public ArrayList<Rental> getRentalList() { return rentalList; }

	public void addRental(Rental arg) {
		rentalList.add(arg);
	}

	public String getName() {
		return name;
	}

    public String getRentalSubtotal(Rental rental) {
        String statement;
        statement = "\t" + rental.movie.getTitle() + "\t"
                + String.valueOf(rental.getAmountFor()) + "\n";
          return statement;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for(Rental rental : rentalList)
            totalAmount += rental.getAmountFor();
        return totalAmount;
    }

    public int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for(Rental rental : rentalList)
            frequentRenterPoints += rental.getFrequentRenterPoints();
        return frequentRenterPoints;
    }


//
//    public String htmlStatement() {
//        double totalAmount = 0;
//        int frequentRenterPoints = 0;
//        String statement = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>";
//          for(Rental rental:rentalList){
//            double thisAmount = rental.getAmountFor();
//            frequentRenterPoints += rental.getFrequentRenterPoints();
//            statement += getRentalSubtotalHtml(thisAmount, rental);
//            totalAmount += thisAmount;
//        }
//        statement = getHtmlSummary(totalAmount, frequentRenterPoints, statement);
//        return statement;
//    }
//
//    private String getHtmlSummary(double totalAmount, int frequentRenterPoints, String statement) {
//        statement += "<P>You owe <EM>" + String.valueOf(totalAmount) + "</EM><P>";
//        statement += "On this rental you earned <EM>" + String.valueOf(frequentRenterPoints)
//                + "</EM> frequent renter points<P>";
//        return statement;
//    }
//
//    public String getRentalSubtotalHtml(double thisAmount, Rental rental) {
//        String statement;
//        statement = "" + rental.movie.getMovie().getTitle() + ": "
//                + String.valueOf(thisAmount) + "<BR>";
//        return statement;
//    }
}