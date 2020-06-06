import java.util.Scanner;

class Dictionary {

    public static void main (String args[]){
        //OBJ
        Scanner s = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        //display + user input
        System.out.println("How many words?");
        int n = s.nextInt();
        String words[] = new String[n];

        for (int i = 0; i < n; i++){
            System.out.println("Word " + (i + 1) + ": ");
            words[i] = scan.nextLine();
        }

        //sorting
        for (int i = 0; i < n - 1; i++){
            for (int o = 0; o < n - 1; o++){
                if (words[o].compareToIgnoreCase(words[o+1]) > 0){ //moves closer to "a" words forward
                    String temp = words[o];
                    words[o] = words[o+1];
                    words[o+1] = temp;
                }
            }
        }

        //display
        System.out.println("The sorted words are: ");
        for (int i = 0; i < n; i ++){
            System.out.print(words[i]);
            if (i < n - 1)
                System.out.print(", ");
             }
        }

    }













