import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String temp = "";
        smallest = largest = temp = s.substring(0, k);
        System.out.println(smallest + " " + largest + " " + temp);
        for(int i = 1; i <= s.length()-k; i++){
            temp = s.substring(i, i+k);System.out.println("i = " + i);
            System.out.println("temp = " + temp);

            if (temp.compareTo(smallest) < 0) {
                System.out.println("temp.compareTo(smallest) " + temp.compareTo(smallest));
                smallest = temp;
                System.out.println("smallest = " + smallest);
            }
            if (temp.compareTo(largest) > 0){
                System.out.println("temp.compareTo(largest) " + temp.compareTo(largest));
                largest = temp;
                System.out.println("largest = " + largest);
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
        String s = "welcometojava"; int k = 3;
        System.out.println(getSmallestAndLargest(s, k));
    }
}
