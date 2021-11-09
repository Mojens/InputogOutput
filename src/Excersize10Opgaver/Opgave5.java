package Excersize10Opgaver;

import java.util.Scanner;

public class Opgave5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("tast værdi a: ");
    int a = scanner.nextInt();
    System.out.print("tast værdi b: ");
    int b = scanner.nextInt();
    System.out.println("er a mindre end 50?: "+(a<50)+" er a mindre end b?: "+(a<b));
  }
}

