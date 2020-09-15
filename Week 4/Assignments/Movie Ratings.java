/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the movie name");
    String name = scan.nextLine();
    
    System.out.println("Please enter the running time in minutes.");
    int ttime = scan.nextInt();
    int hours = ttime/60;
    int minutes = ttime % 60;
    
    System.out.println("Please enter ratings from the movie review website.");
    int mr1 = scan.nextInt();
    int mr2 = scan.nextInt();
    int mr3 = scan.nextInt();
    double webAvg = (1.0*(mr1 + mr2 + mr3))/3;
    
    System.out.println("Please enter ratings from the focus group.");
    double fg1 = scan.nextDouble();
    double fg2 = scan.nextDouble();
    double focusAvg = (fg1 + fg2)/2;
    
    System.out.println("Please enter the average movie critic rating.");
    double mc = scan.nextDouble();
    
    System.out.println("Title: " + name);
    System.out.println("Running time: " + hours + "h" + minutes);
    System.out.println("Average website rating: " + webAvg);
    System.out.println("Average focus group rating: " + focusAvg);
    System.out.println("Average movie critic rating: " + mc);
    
    double totalAvg = (2 * webAvg + 3 * focusAvg + 5 * mc)/10;
    int roundTotal = (int)((totalAvg+0.5));
    System.out.println("Overall movie rating: " + roundTotal);
  }
}

