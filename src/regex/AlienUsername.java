package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienUsername {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            Pattern p = Pattern.compile("^[_.]\\d+[a-zA-Z]*[_]?$");
            Matcher m = p.matcher(pattern);
            if (m.find())
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}
