package Solution;

import java.util.Scanner;

public class B15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long count = 1;
        for (int i = 0; i <= n; i++) {
            count ++;
            n /= 10;
        }

        System.out.println(count);
    }
}
