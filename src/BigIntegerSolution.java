import java.io.*;
import java.util.*;

public class BigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        BigInteger rez = java.math.BigInteger.valueOf(0);




        for (int i = 0; i < n; i++) {
            java.math.BigInteger bigI = java.math.BigInteger.valueOf(ar[i]);
            rez = rez.add(bigI);
        }
        return rez;

    }
}
