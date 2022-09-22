package org.example;

import java.util.Scanner;

public class Static_initializer_block {

    private static int B = 0;
    private static int H = 0;
    static boolean flag = true;
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if(B <= 0 || H <= 0) {
            try {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}
