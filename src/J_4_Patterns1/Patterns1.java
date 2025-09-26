package J_4_Patterns1;

public class Patterns1 {

    /*
    Problem statement
        Print the following pattern for the given N number of rows.

        Pattern for N = 4
        4444
        4444
        4444
        4444
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints
        0 <= N <= 50
        Sample Input 1:
        7
        Sample Output 1:
        7777777
        7777777
        7777777
        7777777
        7777777
        7777777
        7777777
        Sample Input 1:
        6
        Sample Output 1:
        666666
        666666
        666666
        666666
        666666
        666666
     */
    public static void squarePattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    /*
    Problem statement
        Print the following pattern for the given N number of rows.

        Pattern for N = 4
        *
        **
        ***
        ****
        Note : There are no spaces between the stars (*).
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints
        0 <= N <= 50
        Sample Input 1:
        5
        Sample Output 1:
        *
        **
        ***
        ****
        *****
        Sample Input 2:
        6
        Sample Output 2:
        *
        **
        ***
        ****
        *****
        ******
     */
    public static void tringleStarPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Problem statement
        Print the following pattern for the given N number of rows.

        Pattern for N = 4
        1
        22
        333
        4444
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints
        0 <= N <= 50
        Sample Input 1:
        5
        Sample Output 1:
        1
        22
        333
        4444
        55555
        Sample Input 2:
        6
        Sample Output 2:
        1
        22
        333
        4444
        55555
        666666
     */
    public static void triangleNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        squarePattern(7);
//        tringleStarPattern(5);
        triangleNumberPattern(5);
    }
}
