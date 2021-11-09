package UserValidation;

import java.util.Scanner;

  public class UserValidation2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double PI;
      System.out.print("Tast de 3 første tal af pi: ");

      if (scanner.hasNextDouble()) {
        PI = scanner.nextDouble();
      } else {
        PI=-1;
        System.out.println("Det skal være et tal med decimaler!");
      }
      System.out.print("dit svar er: "+PI);
    }

  }


