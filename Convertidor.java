import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//1 USD=19.92 - 1 USD 155 ARG 1 USD=3.708 COL
public class Convertidor {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int selection;   
       double amount=0;
       do {
           System.out.println("SELECT THE CURRENCY TO EXCHANGE");
           System.out.println("1-USD TO MXN");
           System.out.println("2-USD TO COL");
           System.out.println("3-USD TO ARG");
           System.out.println("0-OUT");
           selection=sc.nextInt();
           switch (selection){
               case  1: System.out.println("USD TO MXN");
                   System.out.println("ENTER THE AMOUNT");
                   amount=sc.nextDouble();
                   mex(amount);
               case  2: System.out.println("USD TO COL");
                   System.out.println("ENTER THE AMOUNT");
                   amount=sc.nextDouble();
                   col(amount);
               case  3: System.out.println("USD TO ARG");
                   System.out.println("ENTER THE AMOUNT");
                   amount=sc.nextDouble();
                   arg(amount);
           }
       }while(selection !=0);
    }
    public static void mex(double amount){
        System.out.println(amount*19.92);
    }
    public static void col(double amount){
        System.out.println(amount*3.708);
    }
    public static void arg(double amount){
        System.out.println(amount*155);
    }


}
