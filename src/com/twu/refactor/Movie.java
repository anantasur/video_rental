package com.twu.refactor;

public class Movie {

    private String title;

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

    public boolean isMovieNewRelease() {
        return priceCode == MoviePricingCategory.NEW_RELEASE;
    }

    public double GetCostForMovie(int days) {
        return priceCode.getCost(days);
    }
}

