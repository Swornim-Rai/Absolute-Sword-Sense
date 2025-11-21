
/**
 * Write a description of class Week_Two_T here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week_Two_T
{
    public static void main(String[] args){
        int A=100;
        int B=200;
        int sum=A+B;
        int sub=A-B;
        int Div=A/B;
        int Mul=A*B;
        System.out.println("sum:" + sum);
        System.out.println("sub:" + sub);
        System.out.println("Div:" + Div);
        System.out.println("Mul:" + Mul);
         /* comment ofcorsre 
          * 
          */  
         int num1=22;
         int num2=23;
         System.out.println(num1 == num2);
         System.out.println(num1 != num2);
         System.out.println(num1 > num2);
         System.out.println(num1 < num2);
         System.out.println(num1 >= num2);
         System.out.println(num1 <= num2);
         
         int h=1;
         // ++h --> pre-increment
         // h++ --> post- incremtent operater
         System.out.println(h); //h=1
         System.out.println(++h); // ++h=2, h2
         System.out.println(h);
         
         System.out.println(h++); //h=3,h++=2
         System.out.println(h); //h=3
         
         int j=h++;
         int k= ++h;
         System.out.println(k);
         
         
    }
}