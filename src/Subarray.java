import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum, rez = 0;
        for (int i = 0; i < size; i++) {
            sum = 0;
            for (int j = i; j < size; j++) {
                sum = arr[j] + sum;
                if (sum < 0) {
                    rez++;
                }
            }
        }
        System.out.println(rez);
    }
}
