import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap do dai cua mang");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0;i< arr.length;i++){
            System.out.println("nhap phan tu");
            arr[i] = sc.nextInt();
        }
    }

}
