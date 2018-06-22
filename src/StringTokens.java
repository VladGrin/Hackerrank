import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        s = s.trim();
        String[] arr = s.split("[^a-zA-Z]+");
        if(s == ""){
            System.out.println(0);
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(arr.length);
        }
        for (String str : arr){
            System.out.println(str);
        }
    }
}
