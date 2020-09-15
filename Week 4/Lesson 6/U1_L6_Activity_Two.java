/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number:");
    double x = scan.nextDouble();
    
    int roundX = (int)(x+0.5);
    System.out.println("Answer: " + roundX);
    
  }
}
