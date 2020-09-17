/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One{
  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string:");
    String input = scan.nextLine();
    int length = input.length();
    System.out.println(input.substring(0,1) + input.substring(length-1, length));
  
  }
}