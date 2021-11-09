package Excersize10Opgaver;

import java.util.Scanner;

public class Opgave1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("give the value x: ");
    double x = s.nextDouble();
    System.out.print("give the value y: ");
    double y = s.nextDouble();
    double area = x*y;
    System.out.print("Value of area is: ");
    System.out.println(((int) area)+" or "+area);

  }

}

