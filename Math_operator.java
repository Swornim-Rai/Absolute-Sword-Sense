
/**
 * Write a description of class Math_operator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Math_operator
{
     public static void main(String[] args){
    System.out.println("Arithmetic operator");
       int a=100;
       int b=50;
       System.out.println("first value:"+a);
       System.out.println("second value:"+b);
       System.out.println("addtion:"+(a+b));
       System.out.println("Substraction:"+(a-b));
       System.out.println("Division:"+(a/b));
       System.out.println("Multiplaction:"+(a*b));
       System.out.println("Modules:"+(a%b));
       System.out.println(); 
    System.out.println("Unary operator");
       int num=10;
        System.out.println("Original num = " + num);
        System.out.println("num++ (post-increment) = "+(num++));
        System.out.println("After post-increment, num = " + num);
        System.out.println("++num (pre-increment)= " +(++num)); 
        System.out.println("num-- (post-decrement)= " +(num--));
        System.out.println("After post-decrement, num = "+num);
        System.out.println("--num (pre-decrement) = "+ --num);
        System.out.println(); 
    System.out.println("Unary operator"); 
        int re=0;  
        System.out.println("Initial result="+re);
        re=30;
        re+=5;
        System.out.println("After+=5,result="+re);
        re-=10;
        System.out.println("After-=10,result="+re); 
        re*=2;
        System.out.println("After*=10,result="+re); 
        re/=2;
        System.out.println("After/=10,result="+re); 
        re%=2;
        System.out.println("After%=10,result="+re); 
        System.out.println(); 
    System.out.println("Relational operator"); 
       int z=10;
       int x=15;
       System.out.println("z=10");
       System.out.println("x=15");
       System.out.println("z==x:"+(z==x));
       System.out.println("z!=x:"+(z!=x));
       System.out.println("z>x"+(z>x));
       System.out.println("z<x"+(z>x));
       System.out.println("z>=x"+(z>=x));
       System.out.println("z<=x"+(z<=x));
       System.out.println();
    System.out.println("Logical operator"); 
        boolean p = true;
        boolean q = false;
        System.out.println("p=" + p);  
        System.out.println("q=" + q);   
        System.out.println("p && q:" + (p && q));
        System.out.println("q && p:" + (q && p));
        System.out.println("q || p:" + (q || p));
        System.out.println("p || q:" + (p || q));
        System.out.println();
    System.out.println("Ternary operator"); 
         int d=10;
         int g=20;
         System.out.println("d=10");
         System.out.println("g=20");
         System.out.println("if statment,for age verafaction for citizenship");
         String Ver=(d>18)? "yes" : "no";
         System.out.println("can d has citizenship: "+Ver);
         String Vr=(g>18)? "yes" : "no";
         System.out.println("can g has citizenship: "+Vr);
         
         
         
         
        
        
        
    
       
        
        
    }
}