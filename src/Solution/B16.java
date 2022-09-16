package Solution;

import java.util.Scanner;

public class B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        while (n != 0){
             count++;
              n /=  10;
         }
        if (count == 0){
            count++;
        }
        System.out.println(count);
    }
}
