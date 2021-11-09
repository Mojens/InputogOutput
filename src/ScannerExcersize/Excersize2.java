package ScannerExcersize;

import java.util.Scanner;

public class Excersize2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Her opretter vi objekt scanner

    System.out.print("How many boxes do you have?: "); // her stiller vi spørgsmålet
    int boxes = scanner.nextInt(); //her giver vi mulighed for brugeren til at svarer som en int fordi det har vi sagt i starten

    System.out.print("whats the price for box?: ");
    double priceBoxes = scanner.nextDouble();

    System.out.print("How much do you wanna give?: ");
    double amountMoney = scanner.nextDouble();

    System.out.print("your total is: ");
    double totalPrice = boxes*priceBoxes;
    double restPrice = amountMoney - totalPrice;

    System.out.println(totalPrice+"kr. "+"and you'll get : "+restPrice+"kr.");




  }
}

