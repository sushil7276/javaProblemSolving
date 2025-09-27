package J_5_Pattern2;

public class Pattern2 {

    /*
    Problem statement
        Print the following pattern for the given N number of rows.
        The dots represent spaces.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints
        0 <= N <= 50
        Sample Input 1:
        3
        Sample Output 1:
              1
            12
          123
        Sample Input 2:
        4
        Sample Output 2:
              1
            12
          123
        1234
     */
    public static void mirrorNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Problem statement
        Print the following pattern for the given N number of rows.

        Pattern for N = 4
        4444
        333
        22
        1
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= N <= 50
        Sample Input 1:
        5
        Sample Output 1:
        55555
        4444
        333
        22
        1
        Sample Input 2:
        6
        Sample Output 2:
        666666
        55555
        4444
        333
        22
        1
     */
    public static void invertedNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int a = n - i + 1;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    /*
    Problem statement
        Print the following pattern
        Hint
        As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
        The dots represent spaces.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= N <= 50
        Sample Input 1 :
        3
        Sample Output 1 :
           *
          ***
         *****
        Sample Input 2 :
        4
        Sample Output 2 :
            *
           ***
          *****
         *******
     */
    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        mirrorNumberPattern(4);
//        invertedNumberPattern(4);
        starPattern(4);
    }
}
