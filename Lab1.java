// Exercise 1

/*

public class Lab1{
   public static void main(String[] args)
   { 
      System.out.println("Hello World \n it's been nice knowing you. \n goodbye World");
   }
}

*/

//Exercise 3

/*
import java.util.Scanner;
public class Lab1{
   public static void main(String[] args)
   {
         int age;
         System.out.println("Enter your Age :");
         Scanner input=new Scanner(System.in); 
         age=input.nextInt();

         if(age>18)
         {
             System.out.println("Adult");
         }
         else
         {
             System.out.println("Child"); 
         }
   }
}

*/

//Exercise 4

/*

import java.util.Scanner;
public class Lab1{
   public static void main(String[] args)
   {
         int day;

         System.out.println("Enter the day_n0 : ");

         Scanner input = new Scanner(System.in);
         
         day=input.nextInt();
        
          switch (day){

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;
                default:
                    System.out.println("Enter valid one");
                
                }
        
   }
}

*/


//Exercise 5

/*

public class Lab1{
    public static void main(String[] args) {
        int i=0,j;
        
        while(i<5){
           for(j=0;j<5;j++)
           {
               System.out.print("* ");
           }
          System.out.println();
          i++;
        }
      }
}

*/


//Exercise 5

/*

public class Lab1{
  public static void main(String[] args)
  {
    int i,j,k;
     
     for(i=0;i<5;i++)
     {
        for(j=5;j>i;j--)
        {
           System.out.print(" ");
        }
        for(k=0;k<i;k++)
        {
           System.out.print("* ");
        }
        System.out.println();
     }
  }
}

*/


//Exercise 6


public class Lab1{
    public static void main(String[] args) {
        
        int i,j,l,m;
        for (i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print("* ");
            }
         
        for(l=5;l>=i;l--)
        {
           System.out.print(" ");
        }
        for(m=0;m<=i;m++)
        {
           System.out.print("* ");
        }
        System.out.println();
     }
    }
}



//Exercise 7

/*

import java.util.Scanner;
public class Lab1{
   public static void main(String[] args)
   {
         int no1,no2,sum,avg;
         
         System.out.println("Enter the 2 numbers :");
         
         Scanner input=new Scanner(System.in); 
         no1=input.nextInt();
         no2=input.nextInt();

         sum=no1+no2;
         avg=sum/2;
  
         System.out.println("Total is: "+sum);
         System.out.println("Average is: "+avg);             
     
   }
}

*/