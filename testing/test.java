package testing;

import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<Integer>());
        res.get(0).add(0,1);

        // res.add(new ArrayList<Integer>(2));
        // res.add(new ArrayList<Integer>(3));
        System.out.println(res);
    }
}