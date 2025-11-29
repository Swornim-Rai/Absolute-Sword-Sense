import java.util.Scanner;
/**
 * Write a description of class week4_q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_q6
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the total price");
        float Price=scan.nextFloat();
        System.out.println("enter a Character between A and D");
        char character=scan.next().charAt(0);
        if(character=='A'){
            System.out.println("you get 60% off and your total is:"+ (Price-(Price*0.6)));
        }
        else if(character=='B'){
            System.out.println("you get 40% off and your total is:"+ (Price-(Price*0.4)));
        }
         else if(character=='C'){
            System.out.println("you get 20% off and your total is:"+ (Price-(Price*0.2)));
        }
         else if(character=='D'){
            System.out.println("you get 10% off and your total is:"+ (Price-(Price*0.1)));
        }
        else{
          System.out.println("it not in the option");
        }
        
        
        
    }
}