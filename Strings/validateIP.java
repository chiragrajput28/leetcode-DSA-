/*
Write a program to Validate an IPv4 Address. According to Wikipedia, 
IPv4 addresses are canonically represented in dot-decimal notation, 
which consists of four decimal numbers, each ranging from 0 to 255, 
separated by dots, e.g., 172.16.254.1 . 
The generalized form of an IPv4 address is (0-255).(0-255).(0-255).(0-255). 
Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Your task is  to complete the function isValid which returns 1 if the ip address is valid else returns 0. 
The function takes a string s as its only argument .

Example 1:

Input:
ip = 222.111.111.111
Output: 1
Example 2:

Input:
ip = 5555..555
Output: 0
Explanation: 5555..555 is not a valid
ip address, as the middle two portions
are missing.
*/

public class validateIP {
    public static void main(String[] args) {
        //String s = "6.111.1 11. 111";
        String s = "0.0.0.0.";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        int size = s.length();
        if (size > 15 || size < 7) return false;
        if (s.charAt(size-1) == '.') return false;
        String[] arr = s.split("[.]");
        for (String x:arr) System.out.println(x);
        if(arr.length != 4) return false;
        boolean ans = false;
        for(String a : arr) {
            //System.out.println("hi");
            a = a.trim();
            //System.out.println(a);
            boolean checked = check(a);
            //System.out.println(checked);
            if (checked && Integer.parseInt(a) >= 0 && Integer.parseInt(a) <= 255) {
                ans = true;
            }
            else {
                return false;
            }
        }
        return ans;
    }
    
    public static boolean check(String a) {
        if (a.matches("^[a-zA-Z]*$") || a.contains(" ")) return false;
        int num = Integer.parseInt(a);
        String strNum = Integer.toString(num);
        if (a.length() !=  strNum.length()) return false; 
        else return true;
    }
}
