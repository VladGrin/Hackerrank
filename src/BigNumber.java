import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        int n = 5;
        long[] arr = new long[5];
        BigInteger result = aVeryBigSum(n, arr);
        System.out.println(String.valueOf(result));
    }
    static BigInteger aVeryBigSum(int n, long[] ar) {
        BigInteger rez = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            BigInteger bigI = BigInteger.valueOf(ar[i]);
            rez = rez.add(bigI);
        }
        return rez;
    }
}

