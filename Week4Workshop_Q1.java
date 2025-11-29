import java.util.Scanner;
/**
 * Write a description of class Week4Workshop_Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week4Workshop_Q1
{
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       System.out.println("enter your marks bellow");
       int marks=scan.nextInt();
       if (marks>=40){
            System.out.println("you have passed");
        }
       else{
            System.out.println("you have failed"); 
        }
   
    } 
}