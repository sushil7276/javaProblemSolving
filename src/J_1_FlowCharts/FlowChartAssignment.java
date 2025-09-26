package J_1_FlowCharts;

public class FlowChartAssignment {

    /*
    Problem statement
        You are given the lengths of 3 sides of a valid triangle. You need to print any one of the following outputs depending on the triangle's nature.

        Print 1, if the triangle is equilateral
        Print 0, if it's isosceles
        Print -1, if it's scalene
        Draw a flowchart for this process.

        Note: Following are the definitions: -

        Equilateral: A triangle with all sides of equal length.
        Isosceles: A triangle with two sides of equal length and two angles of equal measure.
        Scalene: A triangle with no sides of equal length1

        Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void checkTriangle(int a, int b, int c) {
        if (a + b > c || a + c > b || b + c > a) {
            if (a == b && a == c && b == c) {
                System.out.println("triangle is equilateral: 1");
            } else if (a == b || a == c || b == c) {
                System.out.println("it's isosceles: 0");
            } else {
                System.out.println("it's scalene: -1");
            }
        } else {
            System.out.println("trangle not valid");
        }
    }

    /*
    Problem statement
        You are given a single positive integer, N. You need to calculate and print the sum of all even numbers till N(inclusive)

        Draw a flowchart for this process

        Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void sumOfEven(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }

    /*
    Problem statement
        You are given two numbers. You need to calculate and print their greatest common divisor (GCD).

        Draw a flowchart for this process.

        Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void findGCD(int a, int b) {
        int min = Integer.min(a, b);

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    /*
    Problem statement
        You are given a single positive integer, N. You need to find and print whether N is Prime or not.

        Draw a flowchart for this process

        Note: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.

        Constraints :
        2 <= n <= 10^6
        Constraints :
        2 <= n <= 10^6
     */
    public static void checkPrimeNumber(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

    }

    /*
    Problem statement
        You are given a single non-negative integer, N. You need to print all numbers that:

        (i) occur in the range 0 to N (both inclusive)
        (ii) are a part of the fibonacci sequence
        Draw a flowchart for this process

        Note 1: The first two terms of the fibonacci sequence are 0 and 1.
        Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void allFibonacciNumber(int num) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= num; i++) {
            int sum = a + b;
            System.out.print(b + " ");
            a = b;
            b = sum;
        }
        System.out.println();
    }

    /*
    Problem statement
        You are given a single non-negative integer, N. You need to find out whether N is a part of the fibonacci sequence.

        Print "Yes" if it is and "No" if it's not.

        Draw a flowchart for this process

        Note 1: The first two terms of the fibonacci sequence are 0 and 1.
        Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void memberOfFibonacci(int num) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= num; i++) {
            int sum = a + b;
            if (num == a || num == b) {
                System.out.println("Yes");
                return;
            }
            a = b;
            b = sum;
        }
        System.out.println("No");
    }

    public static void main(String[] args) {

//        checkTriangle(12, 12, 12);
//        sumOfEven(12);
//        findGCD(20, 15);
//        checkPrimeNumber(9);
//        allFibonacciNumber(7);
//        memberOfFibonacci(8);
    }
}
