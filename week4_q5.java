import java.util.Scanner;
/**
 * Write a description of class week4_q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_q5
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
         System.out.println("enter a number bellow");
        int number=scan.nextInt();
        if(number%3==0){
           if(number%5==0){
               System.out.println("The number is devisable by 3 and 5");
            }
        }
        else{
           System.out.println("it not devisable by 3 and 5");
        }
        
        
    }
}