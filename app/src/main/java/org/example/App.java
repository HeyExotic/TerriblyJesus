package org.example;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.println("Welcome to the Ounce Conversion Progam!");

    System.out.println("How many ounces do you have?");
    String input = scanner.nextLine().trim();

    System.out.println("\nThank you! Converting Ounces to Pounds");
    int ounces = Integer.parseInt(input);
    System.out.println(Converter.toPounds(ounces));
    System.out.println(Converter.toPoundsAndOunces(ounces));

    System.out.println("\nThank you for using the OCP!");
    scanner.close();
  }
}
