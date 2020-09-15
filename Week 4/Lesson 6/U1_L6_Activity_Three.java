/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number:");
    double x = scan.nextDouble();
    double y = (double)x - (int)x;
    int z = (int)((double)y * 100);
    int tens = (z / 10) % 10;
    int ones = z % 10;
    System.out.println("Answer: " + tens + " " + ones);
    
  }
}
