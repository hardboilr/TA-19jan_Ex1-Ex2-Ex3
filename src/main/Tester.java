package main;

import control.Calc;
import data.Data;
import java.util.List;

public class Tester {

    public static void main(String[] args) {

        Calc calc = new Calc();

        List<Integer> listIntersection = calc.listIntersection(Data.getLIST_A(), Data.getLIST_B());
        String interSec = "What are the set-intersection of a & b? \n(values both lists share) --> ";
        for (Integer i : listIntersection) {
            interSec += i + ", ";
        }
        System.out.println(interSec.substring(0, interSec.length() - 2));

        List<Integer> listDifference = calc.listDifference(Data.getLIST_B(), Data.getLIST_C());
        String diff = "What are the set-difference of b & c? \n(values that one list has that the other does not) --> ";
        for (Integer i : listDifference) {
            diff += i + ", ";
        }
        System.out.println(diff.substring(0, diff.length() - 2));

        List<Integer> listUnion = calc.listUnion(Data.getLIST_A(), Data.getLIST_C());
        String union = "What are the set-union of a & c? \n(combined, non-repeated values of both) --> ";
        for (Integer i : listUnion) {
            union += i + ", ";
        }
        System.out.println(union.substring(0, union.length() - 2));
    }
}
