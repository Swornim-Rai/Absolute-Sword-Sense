import java.util.Scanner;
/**
 * Write a description of class week5_q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_q9
{
    public static void main(String[] args){ 
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a postive number");
      int num=scan.nextInt();
      int reversed=0;
      while(num > 0){
         int digit = num % 10;        // extract last digit
         reversed = reversed * 10 + digit; // build reversed number
         num = num/ 10;           // remove last digit
        } 
      System.out.println("Output should be " + reversed + ".");  
    }
}