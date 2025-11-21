
/**
 * Write a description of class week3_tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week3_tutorial
{
    int agr; //instance variable
    static int rtr; // static variable
    public static void main(String[] args){
       int age; //local variable
       System.out.println();
       // <className> <variable> = new <className>()
       week3_tutorial t1=new week3_tutorial();
       // to print out the out side variable use System.out.println(<variable>.<instance variable>);
       System.out.println(t1.agr);
     }
}