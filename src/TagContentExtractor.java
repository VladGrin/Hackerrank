import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<String> list = new ArrayList<>();
        String teg1 = null;
        String teg2 = null;
        String text = "";
        while (testCases > 0) {
            String line = in.nextLine();
            int i = 0;
            while (i < line.length() - 1) {
                if (line.charAt(i) == '<' && line.charAt(i + 1) != '/') {
                    teg1 = "";
                    while (line.charAt(i) != '>') {
                        teg1 += line.charAt(++i);
                    }
                    text = "";
                }
                text += line.charAt(++i);
                if (line.charAt(i + 1) == '<' && line.charAt(i + 2) == '/') {
                    i += 2;
                    teg2 = "";
                    while (line.charAt(i) != '>') {
                        teg2 += line.charAt(++i);
                    }
                    if (teg1.equals(teg2)) {
                        list.add(text);
                        text = "";
                        teg1 = "";
                        teg2 = "";
                    }
                }
            }
            if (!teg1.equals(teg2)) {
                list.add("None");
            }
            testCases--;
        }//<h1>Na</h1>
        for (String str : list) {
            System.out.println(str);
        }
    }
}

//    Scanner in = new Scanner(System.in);
//    int testCases = Integer.parseInt(in.nextLine());
//		while(testCases>0){
//
//                String line = in.nextLine();
//                boolean matchFound = false;
//                Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
//                Matcher m = p.matcher(line);
//
//                while (m.find()) {
//                System.out.println(m.group(2));
//                matchFound = true;
//                }
//                if ( ! matchFound) {
//                System.out.println("None");
//                }
//
//                testCases--;
//                }
//                }
//                }