package J_3_ConditionalsAndLoops;

public class ConditionalsAndLoopsAssignment {

    /*
    Problem statement
        Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), depending upon which the total salary is calculated as:

            Total_salary = Basic + HRA + DA + Allow – PF
        where :
        HRA   = 20% of basic
        DA    = 50% of basic
        Allow = 1700 if grade = ‘A’
        Allow = 1500 if grade = ‘B’
        Allow = 1300 if grade = ‘C' or any other character
        PF    = 11% of basic.
        Round off the total salary and then print the integral part only.

        Note for C++ users :
        To round off the value, please include<cmath> library at the start of the program and round off the values in this way.
        int ans = round(yourFinalValue);
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints
        0<=salary<=10000
        Sample Input 1 :
        10000 A
        Sample Output 1 :
        17600
        Sample Input 2 :
        4567 B
        Sample Output 2 :
        8762
        Explanation of Input 2:
        We have been given the basic salary as Rs. 4567. We need to calculate the hra, da and pf.
        Now when we calculate each of the, it turns out to be:
        hra =  20% of Rs. 4567 = Rs. 913.4
        da = 50% od Rs. 4567 = Rs. 2283.5
        pf = 11% of Rs. 4567 = Rs. 502.37

        Since, the grade is 'B', we take allowance as Rs. 1500.
        On substituting these values to the formula of totalSalary, we get Rs. 8761.53 and now rounding it off will result in Rs. 8762 and hence the Answer.
     */
    public static void totalSalary(int basic, char grade) {
        double HRA = (basic / 100D) * 20;
        double DA = (basic / 100D) * 50;
        double PF = (basic / 100D) * 11;
        double Allow;
        if (grade == 'A') {
            Allow = 1700;
        } else if (grade == 'B') {
            Allow = 1500;
        } else {
            Allow = 1300;
        }

        double TotalSalary = basic + HRA + DA + Allow - PF;
        long roundOFSalary = Math.round(TotalSalary);
        System.out.println(roundOFSalary);
    }

    /*
    Problem statement
        Write a program that generates a multiplication table for a given integer.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        The input integer n is non-negative and less than or equal to 10,000.

        Note:
        The program should take an integer as input and print the first 10 multiples of the input integer. Each multiple should be printed on a new line. The program should not print anything else. The program should handle the case where the input integer is 0. In this case, the program should print ten lines of 0. The program does not need to handle invalid input. It can assume that the input will always be a valid integer within the specified constraints.
        Sample Input 1 :
        2
        Sample Output 1 :
        2
        4
        6
        8
        10
        12
        14
        16
        18
        20
        Sample Input 2 :
        5
        Sample Output 2 :
        5
        10
        15
        20
        25
        30
        35
        40
        45
        50
     */
    public static void MultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    /*
    Problem statement
        Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.

        Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

        Constraints
        0<= 'n' <=10000

        Example :
        Input: 'n' = 132456
        Output: 12 9

        Explanation:
        The sum of even digits = 2 + 4 + 6 = 12
        The sum of odd digits = 1 + 3 + 5 = 9
        Constraints
        0<= 'n' <=10000

        Example :
        Input: 'n' = 132456
        Output: 12 9

        Explanation:
        The sum of even digits = 2 + 4 + 6 = 12
        The sum of odd digits = 1 + 3 + 5 = 9
        Input format :
         The first line contains an integer 'n'.
        Output format :
        In a single line, print two space-separated integers, first the sum of even digits and then the sum of odd digits.
        Sample Input 1:
        132456
        Sample Output 1:
        12 9

        Explanation of sample input 1 :
        The sum of even digits = 2 + 4 + 6 = 12
        The sum of odd digits = 1 + 3 + 5 = 9

        Sample Input 2:
        552245
        Sample Output 2:
        8 15
     */
    public static void sumOfEvenAndOdd(int num) {
        int odd = 0;
        int even = 0;
        while (num != 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                even += rem;
            } else {
                odd += rem;
            }
            num = num / 10;
        }

        System.out.println(even + " " + odd);
    }

    /*
    Problem statement
        Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= n <= 10,000
        Sample Input 1 :
        8
        Sample Output 1 :
        2 4
        Explanation of Sample Output 1 :
        The factors for the number excluding 1 and itself are 2 and 4, so the output is 2 4.
        Sample Input 2 :
        11
        Sample Output 2 :
        -1
        Explanation of Sample Output 2 :
        11 is a prime number having factors 1 and 11 so that output will be -1.
     */
    public static void factors(int num) {
        boolean isFactors = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                isFactors = true;
            }
        }
        if (!isFactors) {
            System.out.println(-1);
        }
    }

    /*
    Problem statement
        Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

        Note : For this question, you can assume that 0 raised to the power of 0 is 1

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints:
        0 <= x <= 8
        0 <= n <= 9
        Sample Input 1 :
         3 4
        Sample Output 1 :
        81
        Sample Input 2 :
         2 5
        Sample Output 2 :
        32
     */
    public static void findPowerOfNumber(int n, int x) {
        if (x == 0) {
            System.out.println(1);
            return;
        }
        int power = 1;
        for (int i = 1; i <= x; i++) {
            power *= n;
        }
        System.out.println(power);
    }

    public static void main(String[] args) {
//        totalSalary(4567, 'B');
//        MultiplicationTable(2);
//        sumOfEvenAndOdd(132456);
//        factors(11);
        findPowerOfNumber(2, 5);

    }
}
