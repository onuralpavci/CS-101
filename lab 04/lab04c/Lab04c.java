import java.util.Scanner;

/**
 * __lab04c___ 
 * @author __onuralp avcı___
 * @version __29.10.2019__
 */ 

public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int number;
      int n;
      int sum;
      int max;
      int min;
      // program code
      System.out.println( "Start...");
      number = 0;
      n = 0;
      sum = 0;

      System.out.println("Enter your number(s):");
      max = scan.nextInt();
      min = max;
      sum += max;
      n += 1;
      while (number >= 0){
         number = scan.nextInt();
         if(number >= 0){
            sum = sum + number;
            if (number > max){
               max = number;
            }
            if (number < min){
               min = number;
            }
            n += 1;
         }
      }
      System.out.println("Sum of the number(s) is " + sum);
      System.out.println("Average of the number(s) is " + sum/n);
      System.out.println("Maximum of the number(s) is " + max);
      System.out.println("Minimum of the number(s) is " + min);

      System.out.println( "End.");
   }

}