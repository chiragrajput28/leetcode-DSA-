package GFG;

import java.util.ArrayList;

public class maximumAND {
   public static void main(String[] args) {
    int A[] = {3,5};
    int n = A.length;
    System.out.println(maxAND(A, n));
   } 
   public static int maxAND(int arr[], int n) {
       int ans = 0;
       //String s = "";
       String res = "";
       ArrayList<String> binary = new ArrayList<>();
       int largest = 0;
       for(int i = 0; i < n; i++) {
        if(largest < arr[i]) largest = arr[i];
       }
       largest = Integer.toBinaryString(largest).length();
       System.out.println(largest + " largest");
       for (int i = 0; i < n; i++) {
        binary.add(String.format("%31s", Integer.toBinaryString(arr[i])).replace(' ', '0'));
       }
       boolean used = false;
       for (int i = largest; i > 0; i--) {
           //System.out.println("hi");
           boolean flag = true; 
           for (int j = 0; j < n; j++) {
               //System.out.println(j);
                System.out.print(binary.get(j).charAt(31-i) + " ");
                char s = binary.get(j).charAt(31-i);
                if (s == '0' && flag == true && used == false) {
                    flag = true;
                    used = true;
                    System.out.print(" if ");
                }
                else if (s == '1' && flag == true) {
                    flag = true;
                    System.out.print(" else if ");
                }
                else {
                    flag = false;
                    System.out.print(" else ");
                    used = false;
                }
           }
           System.out.println(flag);
           if (flag == true) {
            res += 1;
            }
            else res += 0;
           System.out.println();
       }
       System.out.println(res);
       ans = Integer.parseInt(res,2);
       return ans;
   }
}
