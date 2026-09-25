//Arithmetic operator
public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println(a + b);  // Addition
        System.out.println(a - b);  // Subtraction
        System.out.println(a * b);  // Multiplication
        System.out.println(a / b);  // Division
        System.out.println(a % b);  // Remainder

    }
}
//Relational operator
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

    }
}
//Logical operator
public class Main {
    public static void main(String[] args) {

        int age = 20;

        System.out.println(age >= 18 && age <= 60);
        System.out.println(age < 18 || age > 60);
        System.out.println(!(age >= 18));

    }
}
//Assignment operator
public class Main {
    public static void main(String[] args) {

        int a = 10;

        a += 5;   // a = a + 5
        System.out.println(a);

        a -= 3;   // a = a - 3
        System.out.println(a);

        a *= 2;   // a = a * 2
        System.out.println(a);

        a /= 2;   // a = a / 2
        System.out.println(a);

    }
}
//Increment Decrement
public class Main {
    public static void main(String[] args) {

        int a = 10;

        a++;
        System.out.println(a);  // 11

        a--;
        System.out.println(a);  // 10

    }
}
//unary operator
public class Main {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(+a);  // Positive
        System.out.println(-a);  // Negative

        a++;
        System.out.println(a);  // 11

        a--;
        System.out.println(a);  // 10

        System.out.println(!true);  // false
    }
}
//pre - post increment
public class Main {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(a++);
        System.out.println(a);

    }
}
public class Main {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(++a);
        System.out.println(a);

    }
}
//Ternary operator
//normal if -else
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
//Ternary version
int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);

//Bitwise operator
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

    }
}
//Shift operator
public class Main {
    public static void main(String[] args) {

        int a = 8;

        System.out.println(a << 1);
        System.out.println(a >> 1);

    }
}
//Instance of operator
public class Main {
    public static void main(String[] args) {

        String name = "Java";

        System.out.println(name instanceof String);

    }
}












































