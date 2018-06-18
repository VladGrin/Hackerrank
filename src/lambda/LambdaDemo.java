package lambda;

public class LambdaDemo {

    static int x = 122151221;

    public static boolean checker(MyNumber myNumber, int num) {
        return myNumber.getValue(num);
    }
    MyNumber isOdd() {
        return (a) -> {
            if (a % 2 == 1)
                return true;
            return false;
        };
    }

    MyNumber isPrime() {
        return (a) -> {
            for (int i = 2; i < a; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }
    MyNumber isPalindrome() {
        return (a) -> {
            String str = Integer.toString(a);
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                    return false;
            }
            return true;
        };
    }

    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        MyNumber op = lambdaDemo.isOdd();
        System.out.println(LambdaDemo.checker(op, x));
        MyNumber op1 = lambdaDemo.isPrime();
        System.out.println(lambdaDemo.checker(op1,x));
        MyNumber op2 = lambdaDemo.isPalindrome();
        System.out.println(lambdaDemo.checker(op2,x));
    }

}
