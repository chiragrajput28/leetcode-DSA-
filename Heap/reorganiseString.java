/**
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.

Example 1:

Input: s = "aab"
Output: "aba"
Example 2:

Input: s = "aaab"
Output: ""

 */


import java.util.*;

class ReorganizeString {
    public static void main(String[] args) {
        String s = "aaab";
        String ans = reorganizeString(s);
        System.out.println(ans);
    }
    public static String reorganizeString(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char ch: s.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1,e2) -> e2.getValue() - e1.getValue());
        maxHeap.addAll(hashMap.entrySet());
        Map.Entry<Character, Integer> prev = null;
        StringBuilder res = new StringBuilder();
        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            //int currFreq = entry.getValue();
            char currChar = entry.getKey();
            res.append(currChar);
            if(prev != null && prev.getValue() > 0) {
                maxHeap.add(prev);
            }
            prev = entry;
            prev.setValue(prev.getValue() -1);
        }
        return res.length() == s.length() ? res.toString() : "";
        //return res.toString();
    }
}