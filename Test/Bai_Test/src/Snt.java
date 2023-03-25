import java.util.Scanner;

public class Snt {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen");
        int n = scanner.nextInt();
        System.out.printf("cac so nguyen to nho hon n la:\n", n);
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
