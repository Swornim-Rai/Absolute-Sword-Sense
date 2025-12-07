import java.util.Scanner;
/**
 * Write a description of class week5_q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_q8
{
    public static void main(String[] args){  
        Scanner scan=new Scanner(System.in);
        System.out.print("enter any number to get its table: ");
        int t=scan.nextInt();
        for(int i=1;i<=10;i++){
          System.out.println( t + "x" + i + "=" + t*i );
        } 
    }
}