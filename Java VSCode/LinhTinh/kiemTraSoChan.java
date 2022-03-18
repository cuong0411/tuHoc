import java.util.Scanner;

public class kiemTraSoChan {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so: ");
        num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.println(num + " la so chan");
        } else {
            System.out.println(num + " la so le");
        }
    }
}
