import java.util.Scanner;
/**
 * Write a description of class week5_q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_q7
{
   public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     System.out.println("if you want to use the calcculator pls enter y or if not then n");
     char choice=scan.next().charAt(0);
     while(choice=='y'){
     System.out.print("pls enter two number bellow:");
     int numb1=scan.nextInt();
     int numb2=scan.nextInt();
     System.out.print("pls enter any arthematic operator like, + , - , * ,/ ");
     char cha=scan.next().charAt(0);
     switch(cha){
        case '+' -> System.out.print("the addtion of the two number is: " + numb1+numb2 );
        case '-' -> System.out.print("the substraction of the two number is: " + (numb1-numb2) ) ;
        case '*' -> System.out.print("the mulitpaction of the two number is: " + (numb1*numb2) ) ;
        case '/' -> System.out.print("the substraction of the two number is: " + (numb1-numb2) ) ;
        default -> System.out.print("pls enter a correct operator");
        }
     System.out.println("if you want to end the calculation pls enter n or if you want to conutiue enter y");
     char change=scan.next().charAt(0);
     if (change == 'y'){
         choice='y';
        }
     else if(change == 'n'){
         choice='n';
        }
     else{
         System.out.println("pls enter y or n ");
        }
    } 
    }
  }