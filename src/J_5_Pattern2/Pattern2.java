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

    /*
    Problem statement
        Print the following pattern for the given number of rows.

        The dots represent spaces.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= N <= 50
        Sample Input 1:
        5
        Sample Output 1:
                   1
                  232
                 34543
                4567654
               567898765
        Sample Input 2:
        4
        Sample Output 2:
                   1
                  232
                 34543
                4567654
     */
    public static void trangleOfNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j < i * 2; j++) {
                System.out.print(j);
            }
            for (int k = i * 2 - 2; k >= i; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    /*
    Problem statement
        Print the following pattern for the given number of rows.
        Note: N is always odd.

        The dots represent spaces.

        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        1 <= N <= 49
        Sample Input 1:
        5
        Sample Output 1:
          *
         ***
        *****
         ***
          *
        Sample Input 2:
        3
        Sample Output 2:
          *
         ***
          *
     */
    public static void diamondStarts(int n) {
        for (int i = 1; i <= n; i++) {
            int space = Math.abs((n / 2) - i + 1);
            int start = n - 2 * space;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= start; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondStarts2(int n) {
        int row = (n / 2) + 1;
        for (int i = 1; i <= row; i++) {
            for (int s = 1; s <= row - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= row - 1; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }
            int star = (2 * (row - i)) - 1;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        mirrorNumberPattern(4);
//        invertedNumberPattern(4);
//        starPattern(4);
//        trangleOfNumbers(5);
//        diamondStarts(3);
        diamondStarts2(5);
    }
}
