/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ln191.unit_testing_exercise;

/**
 *
 * @author l
 */
public class exercise
{

    static int[] leapYearMonths =
    {
        31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    static int[] nonleapYearMonths =
    {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static int getNumDaysinMonth(int month, int year)
    {
        if (LeapYear(year))
        {
            return leapYearMonths[month];
        }
        else
        {
            return nonleapYearMonths[month];
        }
    }

    public static boolean LeapYear(int year)
    {
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
            else
            {
                return true;
            }

        }
        else
        {
            return false;
        }
    }
}
