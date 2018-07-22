import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramsEx {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.toLowerCase().charAt(i);
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                Integer count = map1.get(c);
                map1.put(c, ++count);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.toLowerCase().charAt(i);
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                Integer count = map2.get(c);
                map2.put(c, ++count);
            }
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");


    }
}