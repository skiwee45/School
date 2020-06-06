import java.util.Scanner;

public class WhileTrial {
    /**
     * Counts backwards from int n to 0 and directly prints
     * @param n is the number the user inputs to count backwards from
     */
    public static void countBackwards(int n) {
        int toPrint = n;
        String result = "";
        while (toPrint >= 0) {
            result += toPrint + " ";
            toPrint--;
        }
        System.out.println(result);
    }

    /**
     * Counts forwards from int n to n + 50 and directly prints
     * @param n is the number the user inputs to count forwards from
     */
    public static void countForwardFifty(int n) {
        int toPrint = n;
        String result = "";
        while (toPrint <= n + 50) {
            result += toPrint + " ";
            toPrint++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        //variables and scanner object
        Scanner scan = new Scanner(System.in);
        int n;

        //get user input
        System.out.println("Enter any number to count forward 50 and backwards till 0 from\nEnter 0 to quit");
        n = scan.nextInt();
        while (n != 0) {
            //executes and prints
            System.out.print("Forwards 50: ");
            countForwardFifty(n);
            System.out.print("Backwards till 0: ");
            countBackwards(n);
            //asks again for user input
            System.out.println("\n\nEnter any number to count forward 50 and backwards till 0 from\nEnter 0 to quit");
            n = scan.nextInt();
        }
        System.out.println("Have a great day!");
    }
}