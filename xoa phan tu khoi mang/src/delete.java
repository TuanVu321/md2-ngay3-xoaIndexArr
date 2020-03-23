import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhap so muon xoa");
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
            }
        }
        if (index >= 0) {
            for (; index < arr.length - 1; index++) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
            }
            arr[arr.length - 1] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
