import java.util.*;

public class DequeueEx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        int first;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            hashSet.add(input);

            if (deque.size() == m) {
                if (hashSet.size() > max) {
                    max = hashSet.size();
                }
                first = deque.remove();
                if (!deque.contains(first)) {
                    hashSet.remove(first);
                }
            }
        }

        System.out.println(max);
    }
}