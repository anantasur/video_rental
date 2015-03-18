package com.twu.refactor;

public enum MoviePricingCategory {
    KIDS(1.5, 1.5, 3),
    REGULAR(2.0, 1.5, 2),
    NEW_RELEASE(0, 3, 0);

    private double upFrontCost;
    private double perDayCost;
    private int upFrontValidity;

    MoviePricingCategory(double upFrontCost, double perDayCost, int upFrontValidity) {
        this.upFrontCost = upFrontCost;
        this.perDayCost = perDayCost;
        this.upFrontValidity = upFrontValidity;
    }

    public double getCost(int numberOfDays) {
        double rentalAmount = upFrontCost;
        if (numberOfDays > upFrontValidity)
            rentalAmount += (numberOfDays - upFrontValidity) * perDayCost;
        return rentalAmount;
    }
}
