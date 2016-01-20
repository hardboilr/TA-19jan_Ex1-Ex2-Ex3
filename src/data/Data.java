package data;

import java.util.ArrayList;

public class Data {

    private static final ArrayList<Integer> LIST_A = new ArrayList() {
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
        }
    };

    private static final ArrayList<Integer> LIST_B = new ArrayList() {
        {
            add(1);
            add(2);
            add(3);
            add(5);
            add(7);
            add(11);
            add(13);
            add(17);
        }
    };

    private static final ArrayList<Integer> LIST_C = new ArrayList() {
        {
            add(1);
            add(1);
            add(2);
            add(3);
            add(5);
            add(8);
            add(13);
            add(21);
            add(34);
        }
    };

    /**
     * Very important to return COPIES of original data.
     *
     * We pass data through to the Calc-methods and would otherwise modify
     * the original data.
     *
     * @return
     */
    public static ArrayList<Integer> getLIST_A() {
        return new ArrayList(LIST_A);
    }

    public static ArrayList<Integer> getLIST_B() {
        return new ArrayList(LIST_B);
    }

    public static ArrayList<Integer> getLIST_C() {
        return new ArrayList(LIST_C);
    }
}
