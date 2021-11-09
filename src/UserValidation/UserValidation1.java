package UserValidation;

import java.util.Scanner;

public class UserValidation1 {
  public static void main(String[] args) {
    System.out.print("Tast et heltal ind: ");
    System.out.println("Du har tastet: "+getInt(""));


  }
  public static int getInt(String msg){
    Scanner input = new Scanner(System.in);
    System.out.print(msg);
    int heltal;
    if (input.hasNextInt()) {
      heltal = input.nextInt();
    }else{
      heltal=-1;
    }
    return heltal;
  }
}

