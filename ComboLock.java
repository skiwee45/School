import java.util.Random;
import java.util.Scanner;

class ComboLock {
    public static void main(String args[]){
        //variables
        int input1, input2;
        String output;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //display and if statements
        System.out.println("Combo Lock\n==========");
        System.out.print("Enter the first lock combination value: ");
        input1 = scan.nextInt();
        if (input1 >= 50 && input1 <= 74){ //checks first value
            System.out.print("Enter the second lock combination value: ");
            input2 = scan.nextInt();
            if (input2 >= 1 && input2 <= 24){ //checks second value
                output = input1 + "-" + input2 + "-" + (rand.nextInt(25) + 75); //creates and prints third value
                System.out.println("Your lock combination is: " + output);
            }
            else
                System.out.print("Value " + input2 + " is not from the range of 1-24");
        }
        else
                System.out.print("Value " + input1 + " is not from the range of 50-74");
    }
}