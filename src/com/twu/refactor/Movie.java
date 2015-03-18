package com.twu.refactor;

public class Movie {

    private String title;

    public MoviePricingCategory getPriceCode() {
        return priceCode;
    }

    private MoviePricingCategory priceCode;

	public Movie(String title, MoviePricingCategory priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

    public void setPriceCode(MoviePricingCategory arg) {
    	priceCode = arg;
	}

	public String getTitle () {
		return title;
	}

    public Movie getMovie() {
        return this;
    }

    public boolean isMovieNewRelease(Rental rental) {
        return rental.getPriceCode() == MoviePricingCategory.NEW_RELEASE;
    }
}

