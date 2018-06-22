import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class BigIntegerSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        System.out.println(x.add(y));
        System.out.println(x.multiply(y));
    }
}
