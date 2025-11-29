import java.util.Scanner;
/**
 * Write a description of class week4_q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_q7
{
     public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the total price");
        float Price=scan.nextFloat();
        System.out.println("enter a Character between A and D");
        char character=scan.next().charAt(0);
        switch(character){
         case 'A'->System.out.println("you get 60% off and your total is:"+ (Price-(Price*0.6)));
         case 'B'->System.out.println("you get 40% off and your total is:"+ (Price-(Price*0.4)));
         case 'C'->System.out.println("you get 20% off and your total is:"+ (Price-(Price*0.2)));
         case 'D'->System.out.println("you get 10% off and your total is:"+ (Price-(Price*0.1)));
         default ->System.out.println("it is not and option");
        }
         
    }
}