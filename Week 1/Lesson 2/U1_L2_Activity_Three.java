/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L2_Activity_Three {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String name;
    String adj;
    
    System.out.println("Hi there. What is your name?");
    name = scan.nextLine();
    System.out.println("What adjective describes you?");
    adj = scan.nextLine();
    System.out.println("My name is " + name + ". I am " + adj + ".");
    
  }
}
