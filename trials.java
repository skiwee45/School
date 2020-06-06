import javax.swing.JOptionPane;

class trials{
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 5; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -12; i <= 12; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 9; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        int subtract = 5050;
        for (int i = 1; i <= 50; i++) {
            subtract -= i;
        }
        System.out.println(subtract);
        sum = 0;
        for (int i = 1; i <= 100; i += 5) {
            sum += i;
        }
        System.out.println(sum);
        subtract = 10000;
        for (int i = 5; i <= 65; i += 3) {
            subtract -= i;
        }
        System.out.print(subtract);
    }
}