package src;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0, count = 0; count < limit; i++) {
            int num = 2 * i + 1;
            System.out.print(num);
            count++;
            if (count < limit) System.out.print(", ");
        }
    }
}
