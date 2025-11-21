import java.util.Scanner;

/**
 * Write a description of class week2_q6 here.          
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week2_q6
{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the water level bellow");
      double water=scan.nextDouble();
      String waterlevel=(water>=1000)? "WARNING THE WATER LEVEL HAS REACHED 1000L or more":"status:Stable";
      System.out.println(waterlevel);       
    }
}