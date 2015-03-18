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

    public double getAmountFor(double rentalAmount) {
        switch (getPriceCode()) {
            case REGULAR:
                rentalAmount += 2;
                if (getDaysRented() > 2)
                    rentalAmount += (getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                rentalAmount += getDaysRented() * 3;
                break;
            case KIDS:
                rentalAmount += 1.5;
                if (getDaysRented() > 3)
                    rentalAmount += (getDaysRented() - 3) * 1.5;
                break;

        }
        return rentalAmount;
    }

    public MoviePricingCategory getPriceCode() {
        return movie.getMovie().getPriceCode();
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        if (isMovieNewRelease()
                && getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    private boolean isMovieNewRelease() {
        return getPriceCode() == MoviePricingCategory.NEW_RELEASE;
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