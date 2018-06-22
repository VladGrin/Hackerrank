import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col;
        int row = scanner.nextInt();
        List<List<Integer>> listRow = new ArrayList<>();
        List<Integer> listCol = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            col = scanner.nextInt();
            listCol = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                listCol.add(scanner.nextInt());
            }
            listRow.add(listCol);
        }
        row = scanner.nextInt();
        int x, y;
        for (int i = 0; i < row; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            try{
                System.out.println(listRow.get(x).get(y));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}

