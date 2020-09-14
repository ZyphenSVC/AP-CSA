/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    double pi = 3.14;
    int r;
    double circum;
    double area;
    
    System.out.println("Enter a radius");
    r = scan.nextInt();
    circum = 2 * pi * r;
    area = pi * r * r;
    
    System.out.println("Circumference: " + circum + "\nArea: " + area);
    
  }
}
