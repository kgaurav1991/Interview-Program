package basicprogram.com;

import java.util.Arrays;

public class Missing_Digits {
    public static void main(String[] args) {
        int num = 1459;
        boolean digitsPresent[] = new boolean[10];
        int temp = num;

        while(temp > 0){
            int digit = temp % 10;
            digitsPresent[digit] = true;
            temp /= 10;
        }
        // Find and print missing digits
        System.out.println("Missing digits in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (!digitsPresent[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
