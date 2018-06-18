package regex;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^(Mr?s|[MDE]r)\\.[a-zA-Z]+$"); // Use \\ instead of using \

    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}