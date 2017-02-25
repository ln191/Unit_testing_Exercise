package com.ln191.unit_testing_exercise;

import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by x on 25-02-2017.
 */
public class MonthDaysCounterEquivalencePartition {
    MonthDaysCounter counter = new MonthDaysCounter();
    int month, year, expResult;
    int[] monthDays;

    @TestFactory
    public Collection<DynamicTest> dynamicTest() {
        //List<Integer> months = new ArrayList<>(Arrays.asList(-10, 2, 6, 166));
        //List<Integer> years = new ArrayList<>(Arrays.asList(4, 100, 400, 2017));
        int[] months = {-10,2, 6, 12,166};
        int[] years = {-4, 4, 100, 400, 2017};
        monthDays = counter.getYearMonths();
        Collection<DynamicTest> dynamicTests = new ArrayList<>();

        for (int i = 0; i < months.length; i++) {
            month = months[i];
            year = years[i];
            if (month > 0 && month < 13 && year >= 0)
                if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)))
                    expResult = monthDays[month] + 1;
                else expResult = monthDays[month];
            else expResult = 0;

            Executable exec = () -> assertEquals(expResult, counter.getNumDaysinMonth(month, year));
            String testName = "DynamicTestgetInterest" + i;
            DynamicTest dynamicTest = DynamicTest.dynamicTest(testName, exec);
            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }

}