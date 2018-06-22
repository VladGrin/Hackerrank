import java.util.Scanner;

public class ExeptionHandling1 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    long power(int n, int p) throws Exception {
        long rez = 1;
        if (n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        if (n == 0 || p == 0)
            throw new Exception("n and p should not be zero.");
        for (int i = 0; i < p; i++) {
            rez *= n;
        }

        return rez;
    }
}

