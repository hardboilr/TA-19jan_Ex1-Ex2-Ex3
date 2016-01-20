package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calc {

    public List<Integer> listIntersection(List<Integer> a, List<Integer> b) {
        a.retainAll(b);
        return a;
    }

    public List<Integer> listDifference(ArrayList<Integer> a, ArrayList<Integer> b) {
        List<Integer> aTemp = new ArrayList(a);
        a.removeAll(b);
        b.removeAll(aTemp);
        a.addAll(b);
        Collections.sort(a);
        return a;
    }

    /**
     * We use our existing two methods to create a union-list.
     *
     * Remember that: "listIntersection"-method takes everything a & b have in
     * common. "listDifference"-method takes everything a & b do not have in
     * common. Then the combination of these two will result a union.
     *
     * @param a
     * @param b
     * @return
     */
    public List<Integer> listUnion(ArrayList<Integer> a, ArrayList<Integer> b) {
        //again, we create a copy of a & b to ensure that both methods will get the same data as input
        List<Integer> intersectionList = listIntersection(new ArrayList(a), new ArrayList(b));

        List<Integer> differenceList = listDifference(a, b);
        differenceList.addAll(intersectionList);
        Collections.sort(differenceList);
        return differenceList;
    }

}
