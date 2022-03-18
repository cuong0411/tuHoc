import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6};
        reverse(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {32, 3, 5, 9, 0};
        reserveVer2(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void reverse(int[] array) {
        int index = array.length - 1;
        int[] array2 = Arrays.copyOf(array, array.length);
        for(int i = 0; i < array.length; i++) {
                array[i] = array2[index];
                index--;
                if (index < 0)
                    break;
            
        }
    }

    public static void reserveVer2(int[] array) {
        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;
        for(int i = 0; i < halfIndex; i ++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
