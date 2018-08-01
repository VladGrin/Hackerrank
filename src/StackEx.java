import java.util.Scanner;

public class StackEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            String temp = input;
            while(!temp.equals(temp.replaceAll("\\(\\)|\\{\\}|\\[\\]",""))){
                temp = temp.replaceAll("\\(\\)|\\{\\}|\\[\\]","");
            }
            if (temp.length() == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
