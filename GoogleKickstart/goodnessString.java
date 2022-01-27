package GoogleKickstart;

import java.util.Scanner;

public class goodnessString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int j = 1; j <= testCases; j++) {
            int n =  sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) != s.charAt(n-i-1)) {
                    count++;
                }
            }
            System.out.println("Case #" + j + ": " + Math.abs(count-k));
        }
        sc.close();
    }
}
