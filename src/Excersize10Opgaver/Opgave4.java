package Excersize10Opgaver;

import java.util.Scanner;

public class Opgave4 {
  public static void main(String[] args) {
            /*
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("Enter third number");
        int c = s.nextInt();
        System.out.println("All are equal : "+(a==b&&b==c&&c==a));
        System.out.println("Any two are equal : "+(a==b||b==c||c==a));
         */
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = scanner.nextInt();
    System.out.print("Enter second number: ");
    int b = scanner.nextInt();
    System.out.print("Enter third number: ");
    int c = scanner.nextInt();
    System.out.println("all are equal: "+(a==b&&b==c&&c==a)); // == betyder boolean ligmed hinanden
    // && betyder og
    System.out.println("2 of them are equal: "+(a==b||b==c||c==a)); // | Betyder eller og det skriver option + i


  }
}

