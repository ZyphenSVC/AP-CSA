/* Unit 1 - Lesson 5 - Coding Activity Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One {
    public static void main(String[] args) {
      
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter a two digit number:");
       int x = scan.nextInt();
       System.out.println("\nHere are the digits");
       System.out.println(x / 10);
       System.out.println(x % 10);
      
    }
}