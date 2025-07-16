package src;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 0, count = 0; count < a; i++) {
            int num = 2 * i + 1;
            System.out.print(num);
            count++;
            if (count < a) System.out.print(", ");
        }
    }
}
