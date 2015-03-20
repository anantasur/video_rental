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
        return movie.GetCostForMovie(daysRented);
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1;
        if (movie.isMovieNewRelease() && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

}