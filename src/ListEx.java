import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListEx {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            switch (s) {
                case "Insert":
                    insert();
                    break;
                case "Delete":
                    delete();
                    break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }

    private static void insert() {
        String[] arr = scanner.nextLine().split(" ");
        list.add(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
    }
    private static void delete() {
        int x = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if ( i == x ){
                list.remove(i);
            }
        }
    }
}
