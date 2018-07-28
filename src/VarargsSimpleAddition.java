
import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class VarargsSimpleAddition {
    public static void main(String[] args) {
//        try {
        Add ob = new Add();
        System.out.println(ob.add(10, 20));
        System.out.println(ob.add(10, 20, 30));
        System.out.println(ob.add(10, 20, 30, 40, 50));
        System.out.println(ob.add(10, 20, 30, 40, 50, 60));
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int n1 = Integer.parseInt(br.readLine());
//            int n2 = Integer.parseInt(br.readLine());
//            int n3 = Integer.parseInt(br.readLine());
//            int n4 = Integer.parseInt(br.readLine());
//            int n5 = Integer.parseInt(br.readLine());
//            int n6 = Integer.parseInt(br.readLine());
//            Add ob = new Add();
//            ob.add(n1, n2);
//            ob.add(n1, n2, n3);
//            ob.add(n1, n2, n3, n4, n5);
//            ob.add(n1, n2, n3, n4, n5, n6);
//            Method[] methods = Add.class.getDeclaredMethods();
//            Set<String> set = new HashSet<>();
//            boolean overload = false;
//            for (int i = 0; i < methods.length; i++) {
//                if (set.contains(methods[i].getName())) {
//                    overload = true;
//                    break;
//                }
//                set.add(methods[i].getName());
//            }
//            if (overload) {
//                throw new Exception("Overloading not allowed");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}

class Add {
    public int add(int... array) {
        int rez = array[0];
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            rez += array[i];
            System.out.print("+");
            System.out.print(array[i]);
        }
        System.out.print("=" + rez + "\n");
        return rez;
    }
}
