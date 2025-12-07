
/**
 * Write a description of class Week5_tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_tutorial
{
    public static void main(String[] args){
     for (int i=2; i<=10; i+=2){  //even to print even number
        System.out.println(i);
        }
     for(int i=1; i<=10; i+=2){  //even to print odd number
        System.out.println(i);
     }
     int sum=0;
     for (int i=1; i<=10; i+=1){  //even to print additon of number till 10
          sum+=i; 
        }
     System.out.println(sum);
     int factorial=1;
     for (int i=1; i<=10; i+=1){  //even to print factorial of number till 10
          factorial=factorial*i; 
           System.out.println(factorial);
        }
     int i=1;
     while(i<=5)
        {    //while loop
         System.out.println(i);
         i++;
        }
     do //do while loop
     {
        System.out.println(i) ;
        i++;
        }while(i<=5);
     // if we use break in any loop it will stop to print its break statment
     for(int z=2;i<=5;i++)
     {
         if(z==2){
             break;
            }
         System.out.println(z);
     }
     // if we use continue it will continue, controls jumps to the first line after the loop.skips
     for(int x=2;i<=5;i++)
     {
         if(x==2){
             continue;
            }
          System.out.println(x);
     }
     }
}
