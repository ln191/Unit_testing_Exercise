package com.ln191.unit_testing_exercise;

/**
 * Created by x on 25-02-2017.
 */
public class Refund {

    public int Reimburse(String visitType, boolean deductible) {

        return deductible ? Percentage(visitType) : 0;
    }

    private int Percentage(String type) {
        if (type == "D")
            return 50;
        else if (type == "H")
            return 80;
        else
            return 0;
    }


}
