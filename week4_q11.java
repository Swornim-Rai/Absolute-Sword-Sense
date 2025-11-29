import java.util.Scanner;
/**
 * Write a description of class week4_q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week4_q11
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your year earning and it will tax your money :)");
        int money=scan.nextInt();
        if(money<=500000 && money>0){
           System.out.print("you will get 1% tax on your money:"+(money*0.01));
        }
        else if(money>500001 && money<=700000){
            System.out.print("you will get 10% tax on your money:"+ (5000+(money*0.1)));
        }
        else if(money>700001 && money<=1000000){
            System.out.print("you will get 20% tax on your money:"+ (15000+(money*0.2)));
        }
        else if(money>1000001 && money<=2000000){
            System.out.print("you will get 30% tax on your money:"+ (35000+(money*0.3)));
        }
        else if(money>2000001 && money<=5000000){
            System.out.print("you will get 36% tax on your money:"+ (335000+(money*0.36)));
        }
        else if(money>5000000){
            System.out.print("you will get 39% tax on your money:"+ (1135000+(money*0.39)));
        }
        else{
            System.out.println("pls enter your actual earning");
        }
    }
}