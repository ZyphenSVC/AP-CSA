/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter two integers:");
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    double avg = (double)(x + y) / 2;
    System.out.println("\nThe average is: " + avg);
    
  }
}
