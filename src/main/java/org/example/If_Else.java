package org.example;

import java.util.Scanner;

/**
 Given an integer, n, perform the following conditional actions:
     If n is odd, print Weird
     If n is even and in the inclusive range of 2 to 5, print Not Weird
     If n is even and in the inclusive range of 6 to 20, print Weird
     If n is even and greater than 20, print Not Weird
     Complete the stub code provided in your editor to print whether n is weird.

 Input Format: A single line containing a positive integer, n.
 Constraints: "1=< n =< 1000".
 Output Format: Print "Weird" if the number is weird; otherwise, print "Not Weird".

 */
public class If_Else {
    static void weirdOrNot(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        if(N > 0 && N <= 1000){
            if(N % 2 != 0 || 6 <= N && N <= 20){
                System.out.println("Weird");
            }else System.out.println("Not Weird");
        }else System.out.println("The number outside the range!!!");
    }
}
