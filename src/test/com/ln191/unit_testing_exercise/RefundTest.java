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
public class RefundTest {
    Refund refund = new Refund();
    String visitType;
    boolean deductible;
    @Test
    public void reimburseDTrue() {
        deductible = true;
        visitType = "D";
        assertEquals(50, refund.Reimburse(visitType,deductible));

    }
    @Test
    public void reimburseHTrue() {
        deductible = true;
        visitType = "H";
        assertEquals(80, refund.Reimburse(visitType,deductible));

    }
    @Test
    public void reimburseDFalse() {
        deductible = false;
        visitType = "D";
        assertEquals(0, refund.Reimburse(visitType,deductible));

    }
    @Test
    public void reimburseHFalse() {
        deductible = false;
        visitType = "H";
        assertEquals(0, refund.Reimburse(visitType,deductible));

    }
    @Test
    public void reimburseStringInvalid() {
        deductible = true;
        visitType = "A";
        assertEquals(0, refund.Reimburse(visitType,deductible));

    }
    @Test
    public void reimburseStringInvalidFalse() {
        deductible = false;
        visitType = "A";
        assertEquals(0, refund.Reimburse(visitType,deductible));

    }

}