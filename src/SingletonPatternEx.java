import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
        import java.lang.reflect.*;

public class SingletonPatternEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = scanner.nextLine();
        System.out.println(singleton);
    }
}
class Singleton {
    static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public String str;

    public static Singleton getSingleInstance() {
        return singleton;
    }

    @Override
    public String toString() {
        return "Hello I am a singleton! Let me say " + str + " to you";
    }
}