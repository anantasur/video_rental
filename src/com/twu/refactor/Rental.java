package com.twu.refactor;

public class Rental {

    public Movie movie;
    private int daysRented;
    
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getAmountFor() {
        return getPriceCode().getCost(getDaysRented());
    }

    public MoviePricingCategory getPriceCode() {
        return movie.getMovie().getPriceCode();
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        if (movie.isMovieNewRelease(this)
                && getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    public String getRentalSubtotalHtml(double thisAmount) {
        String statement;
        statement = "" + movie.getMovie().getTitle() + ": "
                + String.valueOf(thisAmount) + "<BR>";
        return statement;
    }

    public String getRentalSubtotal(double thisAmount) {
        String statement;
        statement = "\t" + movie.getMovie().getTitle() + "\t"
                + String.valueOf(thisAmount) + "\n";
        return statement;
    }
}