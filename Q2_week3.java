import java.util.Scanner;
/**
 * Write a description of class Q2_week3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2_week3
{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your numeric grade (0-100): ");
      int grade=scan.nextInt();
      String result=(grade>=40)? "pass" : "fail";
      System.out.print("You have :"+result);
    }
}