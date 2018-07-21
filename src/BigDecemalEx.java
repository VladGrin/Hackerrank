import java.math.BigDecimal;

import java.util.*;

public class BigDecemalEx {

    public static void main(String[] args) {
        //Input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] s = new String[n + 2];
//        for (int i = 0; i < n; i++) {
//            s[i] = sc.next();
//        }
//        sc.close();
        int[] myIntArray = {10, 20, 30, 15};
        Arrays.stream(myIntArray).sorted().forEach(x -> System.out.println(x));


        //Output
//        for (int i = 0; i < n; i++) {
//            System.out.println(s[i]);
//        }
    }

}