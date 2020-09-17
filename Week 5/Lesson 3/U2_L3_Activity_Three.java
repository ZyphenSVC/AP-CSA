/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three{
  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first word:");
    String input1 = (scan.nextLine()).toLowerCase();
    System.out.println("Enter second word:");
    String input2 = (scan.nextLine()).toLowerCase();
    System.out.println(input1.compareTo(input2));
  
  }
}