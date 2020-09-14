/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L3_Activity_Two {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String name;
    int age;
    
    System.out.println("Hi there. What is your name?");
    name = scan.nextLine();
    System.out.println("Hi " + name + ". How old are you?");
    age = scan.nextInt();
    System.out.println(name + " is " + age + " years old.");
    
  }
}
