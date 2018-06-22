import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y;
        try{
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(x/y);
        }catch (InputMismatchException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
