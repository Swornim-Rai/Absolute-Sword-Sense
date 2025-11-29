import java.util.Scanner;
/**
 * Write a description of class week4_q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_q3
{
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a number bellow");
      int number=scan.nextInt();
      if(number>0){
           System.out.println("it is a positive number");
        }
      else if(number==0){
           System.out.println(" the number is zero");
        }
      else{
           System.out.println("it is a negitive number");
        
        }
      
      
    
    }
}