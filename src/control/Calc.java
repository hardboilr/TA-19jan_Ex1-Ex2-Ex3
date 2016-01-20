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
    
    public List<Integer> listUnion(ArrayList<Integer> a, ArrayList<Integer> b) {
        List<Integer> intersectionList = listIntersection(new ArrayList(a), new ArrayList(b));
        List<Integer> differenceList = listDifference(a, b);
        differenceList.addAll(intersectionList);
        Collections.sort(differenceList);
        return differenceList;
    }

}
