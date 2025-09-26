package J_3_ConditionalsAndLoops;

public class ConditionalsAndLoops {

    /*
    Problem statement
        Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.

        1, if the character is an uppercase alphabet (A - Z).
        0, if the character is a lowercase alphabet (a - z).
        -1, if the character is not an alphabet.

        Example:
        Input: The character is 'a'.

        Output: 0
        Explanation: The input character is lowercase, so our answer is 0.
        Detailed explanation ( Input/output format, Notes, Images )

        Sample Input 1 :
        v
        Sample Output 1 :
        0
        Explanation of Sample Input 1:
        The input character is lowercase, so our answer is 0.

        Sample Input 2 :
        V
        Sample Output 2 :
        1
        Explanation of Sample Input 2:
        The input character is uppercase, so our answer is 1.

        Sample Input 3 :
        #
        Sample Output 3 :
        -1
        Explanation of Sample Input 3:
        The input character is not an alphabet, so our answer is -1.

        Constraints :
        The input can be any single character.

        Hint:
        Can you check in which range of characters ‘CH’ lie to check its type?
     */
    public static void FindCharacterCase(char s) {
        if (s >= 'A' && s <= 'Z') {
            System.out.println("the character is an uppercase alphabet: 1");
        } else if (s >= 'a' && s <= 'z') {
            System.out.println("the character is a lowercase alphabet: 0");
        } else {
            System.out.println("the character is not an alphabet: -1");
        }
    }

    /*
    Problem statement
        Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

        Hint : Use type casting
        Detailed explanation ( Input/output format, Notes, Images )
        Constraints :
        0 <= S <= 90
        S <= E <=  900
        0 <= W <= 80
        Sample Input 1:
        0
        100
        20
        Sample Output 1:
        0   -17
        20  -6
        40  4
        60  15
        80  26
        100 37
        Sample Input 2:
        20
        119
        13
        Sample Output 2:
        20  -6
        33  0
        46  7
        59  15
        72  22
        85  29
        98  36
        111 43
        Explanation For Input 2:
        Start calculating the Celsius values for each Fahrenheit Value which starts from 20. So starting from 20, we need to compute its corresponding Celsius value which computes to -6. We print this information as <Fahrenheit Value> <a single space> <Celsius Value> on each line. Now add 13 to Fahrenheit Value at each step until you reach 119 in this case. You may or may not exactly land on the end value depending on the steps you are taking.
     */
    public static void fahrenheitToCelsius(int start, int end, int size) {
        for (int i = start; i <= end; i += size) {
            int celsius = ((i - 32) * 5 / 9);
            System.out.println(i + " " + celsius);
        }

    }

    public static void main(String[] args) {

//        FindCharacterCase('V');
//        fahrenheitToCelsius(0, 100, 20);
    }
}
