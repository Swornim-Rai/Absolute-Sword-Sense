
/**
 * Write a description of class week5_nested_loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_nested_loop
{
    public static void main(String[] args){
        //the outher loop detirmine the rows of the output/loop
        //the inner loop determin the rows of the output/loop
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=2; j++)
            {
              System.out.println("i :" + i  + " j:"+ j );
            }
            System.out.println(); //to break the line 
        }
        for (int i=1;i<=10;i++)//to make the parttan 
        {
            for (int j=i;j<=10; j++)
            {
              System.out.print("*");  
            }
            System.out.println(); //to break the line 
        }
        
    }
}