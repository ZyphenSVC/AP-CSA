/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L2_Activity_Two {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String one;
    String two;
    String three;
    
    System.out.println("Please enter three names:");
    one = scan.nextLine();
    two = scan.nextLine();
    three = scan.nextLine();
    System.out.println(three + " " + two + " " + one);
    
  }
}
