package com.ln191.unit_testing_exercise;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by x on 25-02-2017.
 */
public class MonthDaysCounterBoundaryValueAnalysis {
    MonthDaysCounter counter = new MonthDaysCounter();
    int month, year;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    //vaild bounds
    @Test
    public void getNumDaysinMonthLeftBound(){
        month = 1;
        year = 0;
        int result = counter.getNumDaysinMonth(month,year);
        int[] monthDays = counter.getYearMonths();
        int expResult = monthDays[month];
        assertEquals(expResult,result,0.0);
    }
    @Test
    public void getNumDaysinMonthRigthBound(){
        month = 12;
        year = (int)Math.pow(2,31)-1; //java int max 2^31
        int result = counter.getNumDaysinMonth(month,year);
        int[] monthDays = counter.getYearMonths();
        int expResult = monthDays[month];
        assertEquals(expResult,result,0.0);
    }
    //invalid bounds
    @Test
    public void getNumDaysinMonthNegativRightBound(){
        month = 0;
        year = -1;
        int result = counter.getNumDaysinMonth(month,year);
        int expResult = 0;
        assertEquals(expResult,result,0.0);

    }
    @Test
    public void getNumDaysinMonthRigthBoundInvalid(){
        month = 13;
        year = (int)Math.pow(2,31);;
        int result = counter.getNumDaysinMonth(month,year);
        int expResult = 0;
        assertEquals(expResult,result,0.0);
    }
}