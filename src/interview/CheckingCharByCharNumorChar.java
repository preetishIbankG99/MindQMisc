package interview;

import java.util.Scanner;

public class CheckingCharByCharNumorChar {

	public static void main(String[] args) {
		 //String str = "java4s";
		 Scanner scan=new Scanner(System.in);
		 System.out.println(":::::Enter A String:::::");
		 String str=scan.nextLine();
         //Check whether the given character is a number of not ?

         for(int i=0; i<str.length();i++)
         {

             Boolean flag = Character.isDigit(str.charAt(i));

             if(flag){
                System.out.println("'"+str.charAt(i)+"' is a number");
             }
             else{
                System.out.println("'"+str.charAt(i)+"' is not a number");
             }

         }

        

          Boolean flag2 = str.substring(0, 1).matches("[0-9]");

             if(flag2){
                System.out.println("First Character is a number..!");
             }
             else{
                System.out.println("First character is not a number..!");
             }

	}

}
