import java.util.Scanner;

public class week2_Workshop{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("enter first number:");
       int firstname= scan.nextInt();
       System.out.println("my first number is"+ firstname);
       System.out.println("your second number:");
       double secondnumber= scan.nextDouble();
       scan.nextLine();
       System.out.println("pls say your name:");
       String name = scan.nextLine(); 
       System.out.println("your first number:"+firstname);
       System.out.println("your second number:"+secondnumber);
       System.out.println("your name:"+name);
       
       
    } 
}