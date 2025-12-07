
/**
 * Write a description of class week5_q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_q6
{
   public static void main(String[] args){
       for (int i = 5; i >= 1; i--) 
       {//i goes from 5 to 1  
            for (int j = 1; j <= i; j++) //for 1 to i
             {
                System.out.print(j);
            }
            System.out.println();
        }
   }
}