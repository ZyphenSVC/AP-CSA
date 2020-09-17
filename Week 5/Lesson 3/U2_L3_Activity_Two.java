/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two{
  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string:");
    String input = scan.nextLine();
    int length = input.length();
    System.out.println(input.substring(1, length-1));
  
  }
}