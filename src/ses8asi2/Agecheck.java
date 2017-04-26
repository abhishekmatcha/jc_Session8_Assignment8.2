package ses8asi2;

import java.util.Scanner;

public class Agecheck
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();  
        
          try
          {
              if(age < 0)
              {
                  throw new Exception();   
              }
          }
          catch(Exception ex)
          {
              System.out.println(ex);     
          }
    }
}