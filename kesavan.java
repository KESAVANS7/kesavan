
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int child = sc.nextInt();
        int uniquepairs = 1;
        for (int i = 0; i < 2 * child; i++) {
            int pair = 2 * child - i;
            if (child != pair) {
                System.out.println(uniquepairs++);
            }
        }

    }
}
