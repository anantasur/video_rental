package com.twu.refactor;

import junit.framework.TestCase;
import org.junit.Test;

public class MoviePricingCategoryTest extends TestCase {
    @Test
    public void testKidsCategoryGivesTheCostOfACategoryFor2days(){
        double actualCost = MoviePricingCategory.KIDS.getCost(2);
        assertEquals(1.5, actualCost, 0.01);
    }
    @Test
    public void testKidsCategoryGivesTheCostOfACategoryFor4days(){
        double actualCost = MoviePricingCategory.KIDS.getCost(4);
        assertEquals(3.0, actualCost, 0.01);
    }
    @Test
    public void testRegularCategoryGivesTheCostOfACategoryFor2days(){
        double actualCost = MoviePricingCategory.REGULAR.getCost(1);
        assertEquals(2.0, actualCost, 0.01);
    }
    @Test
    public void testRegularCategoryGivesTheCostOfACategoryFor4days(){
        double actualCost = MoviePricingCategory.REGULAR.getCost(4);
        assertEquals(5.0, actualCost, 0.01);
    }
    @Test
    public void testNewReleaseCategoryGivesTheCostOfACategoryFor1days(){
        double actualCost = MoviePricingCategory.NEW_RELEASE.getCost(1);
        assertEquals(3.0, actualCost, 0.01);
    }
    @Test
    public void testNewReleaseCategoryGivesTheCostOfACategoryFor4days(){
        double actualCost = MoviePricingCategory.NEW_RELEASE.getCost(4);
        assertEquals(12.0, actualCost, 0.01);
    }
}