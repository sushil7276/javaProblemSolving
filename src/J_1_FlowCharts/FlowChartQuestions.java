package J_1_FlowCharts;

public class FlowChartQuestions {

    /*
    Problem statement
    You are given three numbers. You need to calculate and print their average value. Draw a flowchart for this process.

    Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void average(int one, int two, int three) {
        double avg = (double) (one + two + three) / 3;
//        System.out.println(avg);
        System.out.printf("%.2f", avg);
        System.out.println();
    }

    /*
    Problem statement
        You are given a single number. You need to print one of the following outputs according to the number's nature.

        Print 1, if the number is positive

        Print -1, if it's negative

        Print 0, if it's equal to 0

        Draw a flowchart for this process.

        Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("the number is positive: 1");
        } else if (num < 0) {
            System.out.println("the number is negative: -1");
        } else {
            System.out.println("it's equal to 0");
        }
    }

    /*
    Problem statement
        You are given 3 numbers. Each number represents the length of a line. You need to figure out whether these lines can form a valid triangle.

        If a valid triangle can be formed, print "Yes", otherwise print "No".

        Draw a flowchart for this process

        A triangle is a valid triangle, If and only If, the sum of any two sides of a triangle is greater than the third side. For Example, let A, B and C are three sides of a triangle. Then, A + B > C, B + C > A and C + A > B

        Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void FormTrangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /*
    Problem statement
        You are given a single non-negative integer, N. You need to calculate and print N factorial (N!)

        N factorial is defined as the product of all integers from 1 to N (both inclusive)

        Draw a flowchart for this process

        Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void findProduct(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    /*
    Problem statement
        You are given a single positive integer, N. You need to print all even integers that occur between 1 and N (both inclusive).

        Draw a flowchart for this process

        Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
     */
    public static void printEvenNumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        average(63, 87, 92);
//        checkNumber(19);
//        FormTrangle(12, 5, 9);
//        findProduct(5);
        printEvenNumber(10);

    }
}
