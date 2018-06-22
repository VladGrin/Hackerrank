import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger rez = new BigInteger(n);
        boolean a = rez.isProbablePrime(100);
        if (a)
            System.out.println("prime");
        else
            System.out.println("not prime");

        scanner.close();
    }
}
