import java.util.Scanner;

/**
 * __lab04d___ 
 * @onuralp avcı___
 * @29.10.2019__
 */ 
public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      String ch;
      int width;
      int number;
      int numberinc;
      // program code
      System.out.println( "Start...");

      System.out.println("Please enter the chracter");
      ch = scan.nextLine();

      System.out.println("Please enter the width");
      width = scan.nextInt();
      number = 0;
      numberinc = 0;
      while(width > 0){
         while(number > 0){
            System.out.print(ch);
            number += -1;
         }
         while(number == 0){
            System.out.println(ch);
            number += -1;
         }
         width += -1;
         numberinc += 1;
         number = numberinc;
      }

      System.out.println( "End.");
   }

}