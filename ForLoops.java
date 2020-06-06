import java.util.Scanner;

public class ForLoops {
    /**
     * This method takes 4 integers and averages them
     * @param g1 First marking period grade
     * @param g2 Second marking period grade
     * @param g3 Third marking period grade
     * @param g4 Fourth marking period grade
     * @return Average of all marking periods
     */
    public static double averageCalc(int g1, int g2, int g3, int g4) {
        int arr[] = {g1, g2, g3, g4};
        int sum = 0;
        double average = 0;
        for (int i : arr) {
            sum += i;
        }
        average = sum / 4.0;
        return average;
    }

    /**
     * This method prints from 3-1 then 2-1 then 1
     * It takes no input
     */
    public static void print123() {
        for (int i = 3; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //variables / objects
        Scanner scan = new Scanner(System.in);
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;
        //user input
        System.out.println("Input Grade For MP1: ");
        i1 = scan.nextInt();
        System.out.println("Input Grade For MP2: ");
        i2 = scan.nextInt();
        System.out.println("Input Grade For MP3: ");
        i3 = scan.nextInt();
        System.out.println("Input Grade For MP4: ");
        i4 = scan.nextInt();
        //calculation for average
        double ave = averageCalc(i1, i2, i3, i4);
        //printing
        System.out.println("The average grade is: " + ave + "\n");

        //print 321 21 1
        print123();
    }
}