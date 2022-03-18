import java.util.Scanner;

public class nhapxuat {
    public static void main(String[] agrs) {
        String myName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        myName = scanner.nextLine();
        scanner.close();
        System.out.println("Helu " + myName);
    }
}
