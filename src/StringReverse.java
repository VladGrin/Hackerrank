import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer stringBuffer = new StringBuffer(A);
        String B = stringBuffer.reverse().toString();
        if(A.compareTo(B) == 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
