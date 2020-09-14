/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two {
    public static void main(String[] args) {
      
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter a three digit number:");
       int x = scan.nextInt();
       int y = (x / 10) % 10;
       System.out.println("\nHere are the digits");
       System.out.println(x % 10);
       System.out.println(y);
       System.out.println(x / 100);
      
    }
}