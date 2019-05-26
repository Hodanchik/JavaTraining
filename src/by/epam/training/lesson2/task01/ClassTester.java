package by.epam.training.lesson2.task01;

public class ClassTester {

    public static void testString() {
        System.out.println("\n***** Test String *****");

        String a = "Java", b = "Forever", c;

        System.out.println("\n***** Arithmetical Operators *****");
// addition
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);
        //c = a - b; subtraction
        //c = a * b;  multiplication
        //c = a / b;division
        //c = a % b;modulus
// c = -a; unary minus
// c = +a; unary plus
//++a prefix increment
// a++ postfix increment
// --a prefix decrement
//a-- postfix decrement
        System.out.println("\n***** Bitwise Operators *****");
        //c = a & b; bitwise AND
        //  c = a | b; bitwise OR
        //c = a ^ b; bitwise XOR
        //c = ~a; bitwise unary compliment
        // c = a << 1; left shift
        // c = a >> 1; right shift
        //c = a >> 1; right shift
        // c = a >>> 1; zero fill right shift
        // c = a >>> 1; zero fill right shift
        System.out.println("\n***** Assignment Operators *****");
        // c += a);
        // c -= a;
        //c *= a;
        //c /= a;
        //c %= a;
        // c |= a;
        //c &= a;
        //c ^= a;
        // c >>= 1;
        // c <<= 1;
        //c >>>= 1;
        System.out.println("\n***** Relational Operators *****");
//a > b greater than
// a >= b greater than or equal to
// a < b less than
//a <= b less than or equal to
// equal to
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%s != %s --> %b\n", a, b, a != b);

    }

    public static void testStudent() {
        Student a = new Student("Bob", 5);
        Student b = new Student("Mary", 4);
        Student c;


        System.out.println("\n***** Test Student *****");
        System.out.println("\n***** Arithmetical Operators *****");
//c = a + b; addition
        //c = a - b; subtraction
        //c = a * b;  multiplication
        //c = a / b;division
        //c = a % b;modulus
// c = -a; unary minus
// c = +a; unary plus
//++a prefix increment
// a++ postfix increment
// --a prefix decrement
//a-- postfix decrement
        System.out.println("\n***** Bitwise Operators *****");
        // c = a & b; bitwise AND
        // c = a | b; bitwise OR
        //c = a ^ b; bitwise XOR
        //c = ~a; bitwise unary compliment
        // c = a << 1; left shift
        // c = a >> 1; right shift
        //c = a >> 1; right shift
        // c = a >>> 1; zero fill right shift
        // c = a >>> 1; zero fill right shift
        System.out.println("\n***** Assignment Operators *****");
        // c += a);
        // c -= a;
        //c *= a;
        //c /= a;
        //c %= a;
        // c |= a;
        //c &= a;
        //c ^= a;
        // c >>= 1;
        // c <<= 1;
        //c >>>= 1;
        System.out.println("\n***** Relational Operators *****");
//a > b greater than
// a >= b greater than or equal to
// a < b less than
//a <= b less than or equal to
// equal to
        System.out.printf(" Student a == Student b --> %b\n", a == b);
// not equal to
        System.out.printf("Student a != Student b --> %b\n", a != b);
        // operation Assignment
        a = b;

    }
}

