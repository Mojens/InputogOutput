package Lektier31082021;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //Creating a scanner object
    System.out.println("Enter a line of text: "); //here i say enter line of text
    String line = input.nextLine(); //Here i wait for them to enter a line
    System.out.println("You have entered: "+line); // tell them what they have entered

  }
}

