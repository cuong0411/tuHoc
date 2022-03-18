import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {

        //lots of work
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int value = input.nextInt();
        // while (value != 9) {
        //     System.out.println("Enter 9 pls: ");
        //     value = input.nextInt();
        // }
        // System.out.println("Got 9!");

        Scanner input = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Enter 9 pls: ");
            value = input.nextInt();
        } while (value != 9);
        System.out.println("Got 9!");

        input.close();
    }
}
