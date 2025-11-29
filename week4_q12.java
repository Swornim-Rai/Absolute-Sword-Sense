import java.util.Scanner;

public class week4_q12
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Nova Flim hall pls enter the detail bellow for your ticket:");
        System.out.println("enter your age bellow");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("enter your prefered language for the movie that might be 'English' or 'Hindi'");
        String lan=scan.nextLine();
        System.out.println("if you are a student pls enter your Id that in range of 10000-99999");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("enter the month of today (1-12)");
        int month=scan.nextInt();
        if(age<18){
           if(lan.equalsIgnoreCase("English")){
              if(id>=10000 && id<=99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (150+100-(250*0.35)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (150+100-(250*0.2)));
                    }
                }
              else if(id<10000 || id>99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (150+100-(250*0.15)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (150+100));
                    }
                }
                else{
                   System.out.println("enter the id right");
                }
            } 
           else if(lan.equalsIgnoreCase("Hindi")){
              if(id>=10000 && id<=99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (150+50-(200*0.35)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (150+50-(200*0.2)));
                    }
                }
              else if(id<10000 || id>99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (150+50-(200*0.15)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (150+50));
                    }
                }
                else{
                   System.out.println("enter the id right");
                }
            }
            else{
                   System.out.println("enter the  Language right pls");
                }
        }
        else if(age>18 && age<=64){
           if(lan.equalsIgnoreCase("English")){
              if(id>= 10000 && id<= 99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (250+100-(350*0.35)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (250+100-(350*0.2)));
                    }
                }
              else if(id<10000 || id>99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (250+100-(350*0.15)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (250+100));
                    }
                }
                else{
                   System.out.println("enter the id right");
                }
            } 
           else if(lan.equalsIgnoreCase("Hindi")){
              if(id>= 10000 && id<= 99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (250+50-(300*0.35)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (250+50-(300*0.2)));
                    }
                }
              else if(id<10000 || id>99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (250+50-(300*0.15)));
                    }
                 else{
                     System.out.println("your ticket price is:"+ (250+50));
                    }
                }
                else{
                   System.out.println("enter the id right");
                }
            }
            else{
                   System.out.println("enter the  Language right pls");
                }
        }
        else if(age>=65){
           if(lan.equalsIgnoreCase("English")){
              if(id>= 10000 && id<= 99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (200+100-(300*0.35)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (200+100-(300*0.2)));
                    }
                }
              else if(id<10000 || id>99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (200+100-(300*0.15)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (200+100));
                    }
                }
                else{
                   System.out.println("enter the id right");
                }
            } 
           else if(lan.equalsIgnoreCase("Hindi")){
              if(id>= 10000 && id<= 99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (200+50-(250*0.35)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (200+50-(250*0.2)));
                    }
                }
              else if(id<10000 || id>99999){
                 if(month>=9 && month<=11){
                      System.out.println("your ticket price is:" + (200+50-(250*0.15)));
                    }
                 else{
                     System.out.println("your ticket price is:" + (200+50));
                    }
                }
                else{
                   System.out.println("enter the id right");
                }
            }
           else{
                   System.out.println("enter the  Language right pls");
                }
        }
        else{
           System.out.print("pls enter the detail proprolly");
        }
    }
}