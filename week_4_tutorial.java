
/**
 * Write a description of class week_4_tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week_4_tutorial
{
    public static void main(String[] args)
    {
        int age; // deleraction statement
        age=18; // expression statement
        System.out.println("welcome to hamro bazar");
        if(age >18){
           System.out.println(age); //it will not print it wwill intrupt the flow stat
        }
        else{
           System.out.println("Your age is less then 18");
        }
        System.out.println("Thank you ! happy coustomers");
        
        int choice=1; //1,2,3,4 choices for like in games menu 
        switch(choice){
            //its old style 
           case 1:System.out.println("Drink:sprite");
           break;
           case 2:System.out.println("drink:Coke");
           break;
           case 3:System.out.println("Drink:fanta");
           break;
           default:System.out.print("not a vaild choice");
        }
        switch(choice){
            //its new style where we do not need break
           case 1 -> System.out.println("Drink:sprite");
           case 2 -> System.out.println("drink:Coke");
           case 3 ->System.out.println("Drink:fanta");
           default -> System.out.print("not a vaild choice");
        }
        
        
        
        
    }
}