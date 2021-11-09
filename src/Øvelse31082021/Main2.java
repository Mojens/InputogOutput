package Øvelse31082021;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Her opretter vi objektet scanner
    System.out.print("Enter First name: "); //Her spørger vi brugeren om at taste information ind
    String text = scanner.nextLine(); //Her giver vi Brugeren mulighed for at taste noget ind

    System.out.print("Enter last name: ");
    String text1 = scanner.nextLine();

    System.out.print("Enter your class: ");
    String text2 = scanner.nextLine();

    System.out.print("Enter phone number: ");
    String text3 = scanner.nextLine();

    System.out.print("Enter your E-mail: ");
    String text4 = scanner.nextLine();

    System.out.print("Enter your birthday: ");
    String text5 = scanner.nextLine();

    System.out.print("Enter your postcode: ");
    String text6 = scanner.nextLine();

    System.out.print("Enter your Grade average: ");
    Double text7 = scanner.nextDouble();

    System.out.print("Enter pi with decimals: ");
    Double text8 = scanner.nextDouble();

    System.out.print("Do you have driving license?: ");
    boolean text9 = scanner.nextBoolean();

    System.out.print("Are u a danish citizen?: ");
    boolean text10 = scanner.nextBoolean();

    System.out.print("Enter the first letter of your first name: ");
    char text11 = scanner.next().charAt(0);

    System.out.print("Enter the first letter of your last name: ");
    char text12 = scanner.next().charAt(0);

    System.out.println(" ");

    System.out.println("your details: "); //Her forneden printer vi svarene som brugerene har tastet ind foroven.
    System.out.println("First name: " + text);
    System.out.println("last name: " + text1);
    System.out.println("your class is: " + text2);
    System.out.println("your phone number is: " + text3);
    System.out.println("your E-mail is: " + text4);
    System.out.println("Your birthday is: " + text5);
    System.out.println("your Postcode is: " + text6);
    System.out.println("Your grade average is: " + text7);
    System.out.println("Pi with decimals is: " + text8);
    System.out.println("Do you have driving license?: " + text9);
    System.out.println("Are u a danish citizen?: " + text10);
    System.out.println("First letter of first name: " + text11);
    System.out.println("First letter of last name: " + text12);

    System.out.println(" ");//Her forneden laver vi tekst til svarene.
    System.out.println("Dette betyder at: ");
    if (text7 > 5) {//Hvis det indtastede gennemsnit er højere end 5 så siger den det der står forneden.
      System.out.println("Din gennemsnit er højere end normalt");
    }
    else {//hvis gennemsnittet er alle tal under 5 så vil den sige det for neden.
      System.out.println("Din gennemsnit er lavere end normalt");
    }
    if (text10) {//Når der bare står if(text10) så betyder det hvis text 10 = true så skal den gøre
      System.out.println("Du er dansker!");
    }
    else { //Her er det så hvis den er alt andet en true skal den så gøre. I boolean er det bare false
      System.out.println("Du er ikke dansker!");
    }


  }

}



