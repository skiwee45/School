import java.util.Scanner;

class FBdemo {
    public static void main(String args[]) {
        //create object
        freezboil f = new freezboil();
        Scanner scan = new Scanner(System.in);

        //getting user input
        System.out.print("Enter the temperature:  ");
        double temp = scan.nextDouble();
        f.temp(temp);

        //user FB class and output
        if (f.ethylB())
        System.out.println("Ethyl Will Boil");
        if (f.ethylF())
        System.out.println("Ethyl Will Freeze");
        if (f.oxygenB())
        System.out.println("Oxygen Will Boil");
        if (f.oxygenF())
        System.out.println("Oxygen Will Freeze");
        if (f.waterB())
        System.out.println("Water Will Boil");
        if (f.waterF())
        System.out.println("Water Will Freeze");
    }
}