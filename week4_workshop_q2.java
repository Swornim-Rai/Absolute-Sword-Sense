import java.util.Scanner;
/**
 * Write a description of class week4_workshop_q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_workshop_q2
{
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a number bellwo");
      int number=scan.nextInt();
      if (number % 2==0){
           System.out.println("it is a even number");
      }
      else{
         
            System.out.println("it is odd number");
      }
    }
}