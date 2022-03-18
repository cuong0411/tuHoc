import java.util.Scanner;
import java.util.Arrays;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int count;
        System.out.print("Enter number elements of array: ");
        count = scanner.nextInt();
        scanner.nextLine();

        int[] arrayIntegers = readIntegers(count);
        System.out.println("The min element in array is: " + findMin(arrayIntegers));
        System.out.println(Arrays.toString(arrayIntegers));


    }
    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            System.out.print("Element " + i + "= ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    public static int findMin(int[] array) {
        //int min = Integer.MAX_VALUE;
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
