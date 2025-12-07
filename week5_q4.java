
/**
 * Write a description of class week5_q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_q4
{
    public static void main(String[] args){
        //program for the folloing pattran
        //1
        //12
        //123
        //1234
        //12345
       for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i; j++)
            {
              System.out.print(j);  
            }
            System.out.println(); 
        }
    }
}