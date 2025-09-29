package J_5_Pattern2;

public class Pattern2Assignment {
    /*
    Problem statement
        Write a program to print N number of rows for Half Diamond pattern using stars and numbers

        Note : There are no spaces between the characters in a single line.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= N <= 50
        Sample Input 1 :
        3
        Sample Output 1 :
        *
        *1*
        *121*
        *12321*
        *121*
        *1*
        *
        Sample Input 2 :
         5
        Sample Output 2 :
        *
        *1*
        *121*
        *12321*
        *1234321*
        *123454321*
        *1234321*
        *12321*
        *121*
        *1*
        *
     */
    public static void halfDiamondPattern(int n) {
        int row = n * 2 - 1;

        System.out.println("*");
        for (int i = 1; i <= row; i++) {
            int col = i > n ? (n * 2) - i : i;
            System.out.print("*");
            for (int j = 1; j <= col; j++) {
                System.out.print(j);
            }
            for (int j = col - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println("*");
    }

    /*
    Problem statement
        Write a program to print parallelogram pattern for the given N number of rows.
        The dots represent spaces.
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= N <= 50
        Sample Input 1 :
        3
        Sample Output 1 :
        ***
         ***
          ***
        Sample Input 2 :
        5
        Sample Output 2 :
        *****
         *****
          *****
           *****
            *****
     */
    public static void parallelogramPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Problem statement
        Write a program to print triangle of user defined integers sum.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= N <= 50
        Sample Input 1 :
        3
        Sample Output 1 :
        1=1
        1+2=3
        1+2+3=6
        Sample Input 2 :
         5
        Sample Output 2 :
        1=1
        1+2=3
        1+2+3=6
        1+2+3+4=10
        1+2+3+4+5=15
     */
    public static void sumPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(j + "=");
                } else {
                    System.out.print(j + "+");
                }
                sum += j;
            }
            System.out.print(sum);
            System.out.println();
        }
    }

    /*
    Problem statement
        Write a program to print the pattern for the given N number of rows.

        For N = 4
        1357
        3571
        5713
        7135
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= N <= 50
        Sample Input 1 :
        3
        Sample Output 1 :
        135
        351
        513
        Sample Input 2 :
         5
        Sample Output 2 :
        13579
        35791
        57913
        79135
        91357
     */
    public static void oddSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j < n; j++) {
                System.out.print(j * 2 + 1);
            }
            for (int k = 0; k < i - 1; k++) {
                System.out.print(k * 2 + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        halfDiamondPattern(5);
//        parallelogramPattern(5);
//        sumPattern(5);
        oddSquare(5);
    }
}
