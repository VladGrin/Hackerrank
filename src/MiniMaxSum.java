import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        long[] arr = {1,1,1,1,1};
        long min = arr[0], max = arr[0];
        long x = 0, y = 0;
        for(long a : arr){
            if (min >= a) min = a;
            if (max <= a) max = a;
        }
        int flag=0;
        for (int i = 0 ; i < 5; i++) {
            if(arr[i]==max && flag == 0) {
                flag++;
                continue;
            }
            x += arr[i];
        }
        flag=0;
        for (int i = 0; i < 5; i++) {
            if(arr[i]==min && flag == 0) {
                flag++;
                continue;
            }
            y += arr[i];
        }
        System.out.print(x + " " + y);
    }

    public static class SimpleArraySum {

        /*
         * Complete the simpleArraySum function below.
         */
        static int simpleArraySum(int[] ar) {
            int rez = 0;
            for (int x : ar){
                rez += x;
            }
            return rez;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = Integer.parseInt(scanner.nextLine().trim());

            int[] ar = new int[arCount];

            String[] arItems = scanner.nextLine().split(" ");

            for (int arItr = 0; arItr < arCount; arItr++) {
                int arItem = Integer.parseInt(arItems[arItr].trim());
                ar[arItr] = arItem;
            }

            int result = simpleArraySum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();
        }
    }
}
