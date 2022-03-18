import java.util.Scanner;


public class congHaiSo {
    public static void main(String[] args) {

        int num1, num2, sum;
        float thuong;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so thu nhat: ");
        num1 = scanner.nextInt();

        System.out.println("Nhap so thu hai: ");
        num2 = scanner.nextInt();

        scanner.close();
        sum = num1 + num2;
        thuong = (float) num1 / num2;

        System.out.println("Tong hai so vua nhap la: " + sum);
        System.out.println("Thuong hai so vua nhap la: " + thuong);
        System.out.format("Ket qua cua thuong hai so la %.2f", thuong);

    }
}