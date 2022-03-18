import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);

        System.out.println("Sort array: ");
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);

        //System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", contents " + array[i]);
        }
    }
    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

    public static int[] sortIntegers(int[] array) {

        // int[] sortedArray = new int[array.length];
        // for(int i = 0; i < array.length; i++) {
        //     sortedArray[i] = array[i];
        // }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i <sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
