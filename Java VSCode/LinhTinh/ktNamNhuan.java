import java.util.Scanner;

public class ktNamNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap nam: ");
        nam = input.nextInt();
        input.close();

        boolean isTrue = false;

        if ((nam % 4 == 0) && (nam % 100 != 0)) {
            isTrue = true;
        }
        if (nam % 400 == 0) {
            isTrue = true;
        }

        if (isTrue) {
            System.out.println(nam + " la nam nhuan");
        } else {
            System.out.println(nam + " khong phai la nam nhuan");
        }
    }
}
