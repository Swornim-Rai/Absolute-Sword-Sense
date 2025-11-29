import java.util.Scanner;
/**
 * Write a description of class week1_q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week1_q4
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number bellow");
        int number=scan.nextInt();
        if (number%3==0 && number%5==0){
             System.out.println("it is devisable by 3 and 5");
        }
        else{
           System.out.println("it not devisable by 3 and 5");
        }
        
    }
}