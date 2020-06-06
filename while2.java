import java.util.Scanner;
public class while2 {
//1. Write a method that will display all positive numbers divisible
//by 10 and less than n.
//ex: 100 --> 10, 20, 30, 40, ..., 80, 90
static int i = 0;
public static void problem1(int n)
{
    while (i < n) {
        System.out.print(i + " ");
        i += 10;
    }
}
//2. Return the smallest value from numbers input by the user.
//ex: 4, -2, -4, 9, 99, done --> The minimum value is -4
// public static int problem2()
// {
// Scanner scan = new Scanner(System.in);
// System.out.print("Enter inputs (Enter \"done\" after last number): ");
// int smallest = scan.nextInt();
// while (scan.hasNextInt())
// {
// int input = scan.nextInt();
// }

// }
//3. Prints multiples of 3 from 300 down to 3.
//Output: 300 297 294 291...6 3
public static void problem3()
{
    int n = 0;
    int i = 300;
    while (i > n) {
        System.out.print(i + " ");
        i -= 3;
    }
}
//4. Verifies that the number entered by the user is between 1 to 100 inclusively.
//if its not, it prompts the user to enter a value again until it is valid
//once valid, print a message that tells the user it is valid.
public static void problem4()
{
    System.out.println("Enter a number between 1 and 100 inclusive.");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while (n < 1 || n > 100) {
        System.out.println("Invalid!");
        System.out.println("Enter a number between 1 and 100 inclusive.");
        n = scan.nextInt();
    }
    System.out.println("Answer valid");
}
//5. Using a number passed from the user,
//count backwards from that number to zero.
//ex: number = 9 --> 9 8 7 6...2 1
public static void problem5(int x)
{
}
//6. Create another method modifying #5 so that it counts forward
//from that number for 10 more numbers and return the result as a String.
//ex: 5 --> 5 6 7 8 9 10 11 12 13 14 15

// public static String problem6(int x)
// {
// }
//7. Modify #5 and create another method so it gives the user the option
//of running the program more than once. (nested while loops)
//**Read the textbook about nested while loops
//8. Write a method that reads a string from the user and a letter.
//Print out how many times that letter occurs in the string.
//West Windsor High School South, s --> 4 times
// public static int problem8(String phrase, String letter)
// {
// }
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("1. ");
System.out.print("Enter a value: ");
int x = scan.nextInt();
problem1(x);
// System.out.println();
// System.out.println("The minimum value is " + problem2());
System.out.println();
System.out.println("3. ");
problem3();
System.out.println();
System.out.println("4. ");
problem4();
// System.out.println();
// problem5(x);
// System.out.println();
// System.out.println(problem6(x));
// System.out.println();
// System.out.println(problem7(x));
// System.out.println();
// System.out.println(problem8("West Windsor High School South", "s") + " times");
}
}