package com.ln191.unit_testing_exercise;

/**
 * Created by x on 25-02-2017.
 */
public class MonthDaysCounter {


    int[] yearMonths =
            {
                    0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };
    int maxInt = (int)Math.pow(2,31)-1; //java int max 2^31

    public int[] getYearMonths() {
        return yearMonths;
    }

    public int getNumDaysinMonth(int month, int year) {
        if (month > 0 && month < 13 && year >= 0 && year <= maxInt) {
            if (LeapYear(year) && month == 2) {

                return yearMonths[month] + 1;

            } else {
                return yearMonths[month];
            }
        }
        return 0;
        //throw new IllegalArgumentException("invalid input, Month: "+month+" , Year: "+year+".");
    }

    public boolean LeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return true;
            }

        } else {
            return false;
        }
    }
}
