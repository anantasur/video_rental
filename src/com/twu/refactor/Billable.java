package com.twu.refactor;

import java.util.ArrayList;

public interface Billable {
    ArrayList<Rental> getRentalList();

    String getName();

    double getTotalAmount();

    int getTotalFrequentRenterPoints();
}
