package rikkei.academy;
import java.util.Arrays;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner addX = new Scanner(System.in);
        int[] arrayN = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Phần tử trong mảng là:" + Arrays.toString(arrayN));
        System.out.println("\nNhập vào số cần thêm: ");
        int number = addX.nextInt();
        System.out.println("Nhập vào vị trí cần thêm: ");
        int index = addX.nextInt();
        if (index < 0 || index > arrayN.length - 1) {
            System.out.println("Không thể thêm được phần tử!");
        } else {
            for (int i = arrayN.length - 1; i >= index; i--) {
                arrayN[i] = arrayN[i - 1];
            }
            arrayN[index - 1] = number;
            System.out.println("New:" + Arrays.toString(arrayN));
        }
    }
}
