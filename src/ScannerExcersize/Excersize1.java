package ScannerExcersize;

import java.util.Scanner;

public class Excersize1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Her opretter vi objektet scanner

    System.out.print("Enter your first name: "); //Her spørger vi brugeren om at taste information ind
    String firstName = input.nextLine(); //Her giver vi Brugeren mulighed for at taste noget ind

    System.out.print("Enter your Surname: ");
    String surName = input.nextLine();

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Enter your weight: ");
    double weight = input.nextDouble();

    System.out.println(" ");
    System.out.println("The result is: ");
    System.out.println("your first name is: " + firstName);
    System.out.println("your surname is: " + surName);
    System.out.println("your age is: " + age);
    System.out.println("your weight is: " + weight + "kg");

  }
}

