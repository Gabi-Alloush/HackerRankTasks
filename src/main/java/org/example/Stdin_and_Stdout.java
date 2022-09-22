package org.example;

import java.util.Scanner;

public class Stdin_and_Stdout {
    private Scanner scan = new Scanner(System.in);

    public int intScan(){
        System.out.print("Enter your integer: ");

        return scan.nextInt();
    }

    public double doubleScan(){
        System.out.print("Enter your double: ");

        return scan.nextDouble();
    }

    public String stringScan(){
        System.out.print("Enter your string: ");

        return scan.next();
    }
}
