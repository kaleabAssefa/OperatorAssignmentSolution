public class Main {
    public static void main(String[] args) {
        int a =20;
        int b=10;
        int n= 5;
        int x= 3;
        int c=12;
        boolean t = true;
        boolean y = false;
        int num=12;
        calculate(a,b);
        incrementDecrement(n);
        compoundOperations(x);
        compareNumbers(a,b);
        logicalOperations(t,y);
        bitwiseOperations(a,b);
        checkEvenOdd(num);
        checkCondition(a,b,c);
    }
    static void calculate(int a, int b) {

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
    }
    static void incrementDecrement(int n) {

        System.out.println("Original n: " + n);

        System.out.println("Pre-increment ++n: " + (++n));
        System.out.println("Post-increment n++: " + (n++));
        System.out.println("Value after n++: " + n);

        System.out.println("Pre-decrement --n: " + (--n));
        System.out.println("Post-decrement n--: " + (n--));
        System.out.println("Value after n--: " + n);
    }
    static void compoundOperations(int x) {

        System.out.println("Original value: " + x);

        x += 5;
        System.out.println("After x += 5: " + x);

        x -= 3;
        System.out.println("After x -= 3: " + x);

        x *= 2;
        System.out.println("After x *= 2: " + x);

        x /= 4;
        System.out.println("After x /= 4: " + x);

        x %= 3;
        System.out.println("After x %= 3: " + x);
    }
    static void compareNumbers(int a, int b) {

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
    static void logicalOperations(boolean t, boolean y) {

        System.out.println("x && y: " + (t && y));
        System.out.println("x || y: " + (t || y));
        System.out.println("!x: " + (!t));
        System.out.println("!y: " + (!y));
    }

    static void bitwiseOperations(int a, int b) {

        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));

        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
    }
    static void checkEvenOdd(int num) {

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result);
    }
    static void checkCondition(int a, int b, int c) {

        boolean result = (a + b > c) && (b != 0);

        System.out.println("Result: " + result);
    }
}