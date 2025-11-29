import java.util.Scanner;
/**
 * Write a description of class week4_q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_q8
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your Gpa");
        float gpa=scan.nextFloat();
        if(gpa<0.0 || gpa>4.0){
           System.out.println("Error invailed GPA");
        }
        else if(gpa >= 3.85 && gpa<4.0) {
           System.out.println("Your Grade is A");
        }
        else if(gpa >= 3.50 && gpa<3.85) {
           System.out.println("Your Grade is A-");
        }
        else if(gpa >= 3.17 && gpa<3.50) {
           System.out.println("Your Grade is B+");
        }
        else if(gpa >= 2.83 && gpa<3.17) {
           System.out.println("Your Grade is B");
        }
        else if(gpa >= 2.50 && gpa<2.83) {
           System.out.println("Your Grade is B-");
        }
        else if(gpa >= 1.83 && gpa<2.50) {
           System.out.println("Your Grade is C");
        }
        else if(gpa >= 1.50 && gpa<1.83) {
           System.out.println("Your Grade is C-");
        }
        else if(gpa >=1.0 && gpa<1.50) {
           System.out.println("Your Grade is D");
        }
        else{
          System.out.println("FAil");
        }
        
        
        
    }
}