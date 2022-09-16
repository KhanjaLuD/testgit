package Solution;

import java.util.Scanner;

public class B15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        if (n >= 1 && n <= 15){
            for (int i = 1; i <= n ; i++) {
                sum *= i;
            }
        }
        System.out.println(sum);
    }
}
