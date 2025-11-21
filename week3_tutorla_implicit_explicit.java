
/**
 * Write a description of class week3_tutorla_implicit_explicit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week3_tutorla_implicit_explicit
{
    public static void main(String[] args){
      //explicit Typecasting
      double dbr=10.90;
      int itr=(int)dbr;
      System.out.println(itr);
      
      //implicit typecasting
      int age=18;
      double db=age;
      System.out.println(db);
      
      //Exceptions
      
      //short st=10;
      //short str=11;
      
      //short sum= st+str;(wrong)
      
      //short st=10;
      //short str=11;
      
      //short sum= (short)st+str;(right)
      
      //maximum minnimum bits bytes
      System.out.println(Byte.MAX_VALUE); 
      System.out.println(Byte.MIN_VALUE);
      System.out.println(Byte.SIZE);
      System.out.println(Byte.BYTES);
      
      //Escape sequence
      
      System.out.println("Hello\nWorld");// for new lines
      System.out.println("Hamro\tNepal");// for tabs
      System.out.println("She said\"hi\" ");//double quotation
      
      // Unicode escape sequence
      
      System.out.println("love emoji"+"\u2764");
      
      
      
    }
}