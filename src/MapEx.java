import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            map.put(name, phone);
            scanner.nextLine();
        }
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (map.containsKey(s)) //if exists
                System.out.println(s + "=" + map.get(s));
            else
                System.out.println("Not found");
        }
    }
}
