import java.util.Scanner;
/**
 * Write a description of class week4_q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_q9
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your GpA");
        float gpa=scan.nextFloat();
        System.out.println("enter your Attandance %");
        float attandance=scan.nextFloat();
        System.out.println("enter your Attitude score");
        int Attitude=scan.nextInt();
        if(gpa>=3.2){
           if(attandance>=80){
              if(Attitude<5){
                 System.out.println("the student is eligible for a scholarship");
                }
               else{
                 System.out.println("the student is not  eligible for a scholarship due to attitde being more than 5");
                }
            }
            else{
              System.out.println("the student is not eligible for a scholarship becasue of low Attandance");
            }
        }
        else{
          System.out.println("the student is not eligible for a scholarship");
        }
        
        
    }
}