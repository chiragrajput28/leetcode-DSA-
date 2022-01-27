
import java.util.*;

/**
 * Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. 
Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those 
repeat numbers, k. For example, there won't be input like 3a or 2[4].

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
Example 4:

Input: s = "abc3[cd]xyz"
Output: "abccdcdcdxyz"
 */

public class decodeString {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decode(s));
    }
    public static String decode (String s) {
        String res = "";
        Stack <Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ']')
                stack.push(s.charAt(i));
            if (stack.peek() == ']') {  
                //System.out.println(i);
                String subAns = "";
                String temp = "";
                stack.pop();            // for removing ']'    
                //subAns = res;
                while (stack.peek() != '[') {        
                    // whenever we got a closing brackets, pop out all the elements utill we get an opening bracket    
                    subAns = stack.pop() + subAns;
                }
                stack.pop();            // for removing '['
                System.out.println(subAns + " subans");
                //res = subAns;
                //System.out.println(stack.peek());
                int count = stack.pop() - '0';
                //System.out.println(count);
                
                for (int j = 0; j < count; j++) {
                    temp += subAns;
                }
                System.out.println(temp + " temp");
                res += temp;
                System.out.println(res + " res");
            }
        }
        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
