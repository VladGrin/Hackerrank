import java.math.BigDecimal;
import java.util.*;


class BigDecimalEx {
    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        BigDecimal[] decimals = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            decimals[i] = new BigDecimal(s[i]);
        }
        BigDecimal temp;
        String tempString;
        int max = 0;
        for (int i = 0; i < decimals.length-1; i++) {
            max = i;
            for (int j = i + 1; j < decimals.length; j++) {
                if (decimals[max].compareTo(decimals[j]) < 0) {
                    max = j;
                }
            }
            temp = decimals[i];
            decimals[i] = decimals[max];
            decimals[max] = temp;
            tempString = s[i];
            s[i] = s[max];
            s[max] = tempString;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}