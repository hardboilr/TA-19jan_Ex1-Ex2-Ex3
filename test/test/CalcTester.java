package test;

import control.Calc;
import data.Data;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTester {

    private final ArrayList<Integer> AB_Intersection;
    private final ArrayList<Integer> BC_Difference;
    private final ArrayList<Integer> AC_Union;

    public CalcTester() {

        AB_Intersection = new ArrayList() {
            {
                add(1);
                add(2);
                add(3);
                add(5);
                add(7);
            }
        };

        BC_Difference = new ArrayList() {
            {
                add(7);
                add(8);
                add(11);
                add(17);
                add(21);
                add(34);
            }
        };
        
        AC_Union = new ArrayList() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
                add(13);
                add(21);
                add(34);
            }
        };

    }

    @Test
    public void testIntersection() {
        Calc calc = new Calc();
        assertEquals(AB_Intersection, calc.listIntersection(Data.getLIST_A(), Data.getLIST_B()));
    }
    
    @Test
    public void testDifference() {
        Calc calc = new Calc();
        assertEquals(BC_Difference, calc.listDifference(Data.getLIST_B(), Data.getLIST_C()));
    }
    
    @Test
    public void testUnion() {
        Calc calc = new Calc();
        assertEquals(AC_Union, calc.listUnion(Data.getLIST_A(), Data.getLIST_C()));
    }
}
