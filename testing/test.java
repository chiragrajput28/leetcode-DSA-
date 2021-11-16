package testing;

import java.util.HashMap;

//import java.util.*;

public class test {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 2);
        if (map.get(2) == null){
            System.out.println("null");
        }
        else System.out.println("not null");
    }
}