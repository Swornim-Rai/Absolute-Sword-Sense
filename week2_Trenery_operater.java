import java.util.Scanner;
/**
 * Write a description of class week2_Trenery_operater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week2_Trenery_operater
{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("pls enter your age then we can verfy that you can drive:");
       int age=scan.nextInt();
       String canDrive = (age >= 18)? "driving is allowed" : "driving is not alloweed";
       System.out.println(canDrive);
   }
}