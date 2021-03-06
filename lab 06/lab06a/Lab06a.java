import java.util.Scanner;

/**
 * __excercising methods in java___ 
 * @author __onuralp avc�___
 * @version __11.11.2019__
 */ 
public class Lab06a
{
   static Scanner scan = new Scanner(System.in);
   

   /**
    * takes the power of double x to the power of y.
    * @param x as double.
    * @param y as int.
    * @return some useful result which is a double
    */
   public static double power(double x, int y) {
      // varibables
      double result;

      // program code
      result = 1.0;
      if (y > 0) {
         for (int yLoop = y; yLoop > 0; yLoop += (-1)) {
            result = result * x;
         }
         return result;
      } 
      else if (y == 0) {
         return 1;
      } 
      else {
         return 0;
      }
      // end of program code
   }

   
   /**
    * finds the factorial of n.
    * @param n as an integer
    * @return some useful result which is a long
    */
   public static long factorial(int n) {

      // program code
      long initial = 1;
      for (int nLoop = n; nLoop > 0; nLoop += (-1)) {
         initial = initial * (n - nLoop + 1);
      }
      return initial;
      // end of program
   }


   /**
    * returns a string as the reverse of the input
    * @param s as string
    * @return some useful result reverse as a string
    */
   public static String reverse(String s) {

      // variables
      String result;

      //initializing
      result = "";

      // program code
      for( int loop = s.length(); loop > 0; loop--){
         result = result + s.charAt(loop -1);
      }
      return result;
      // end of program
   }


   /**
    * retyrn a binary base 2 number to decimal
    * @param base2 as string
    * @return some useful result toDecimal as int
    */
   public static int toDecimal(String base2) {
      int decimal;
      //Ignored parts was used for another method called "toBinary". However method was not efficient so it is ignored
      /** if (base2.contains("2") || base2.contains("3") || base2.contains("4") || base2.contains("5")
            || base2.contains("6") || base2.contains("7") || base2.contains("8") || base2.contains("9")) {
         decimal = -1;
      } 
      else { */

      //initializing
      decimal = 0;

      //program code
      for (int lengthLoop = base2.length(); lengthLoop > 0; lengthLoop += (-1)) {
         decimal = decimal + (Integer.valueOf( base2.charAt( lengthLoop - 1) + "") * (int) power( 2, (  base2.length() - lengthLoop)));
      }
      //}
      return decimal;
      // end of program
   }


   //toBinary method
   // It is the worst way to solve that problem but it works any way! So it is ignored
   /**public static int toBinary(int decimal) {
      int result = 0;
      for (int x = 0; toDecimal(x + "") != decimal; x += 1) {
         result = x;
      }
      return (result + 1);
   }
   */
   

   /**
    * returns the decimal number as binary number base 2.
    * @param decimal as int
    * @return toBinary as string
    */
   public static String toBinary(int decimal){
      //variable
      String binary;

      //initializing
      binary = "";

      //program code
      do{
         binary += decimal % 2;
         decimal = decimal / 2;
      } while(decimal > 0);
      return reverse(binary);
   }


   //MAIN METHOD
   public static void main(String[] args) {

      // constants

      // variables
      String binary1;
      String binary2;
      int sum;
      String reverse;
      double x;
      double currentSum;
      double currentSumImproved;
      double a;
      double b;
      double c;
      int multipleA;
      int multipleB;
      

      // program code
      System.out.println("Start...");

      //First loop
      for (int n = -1; n < 11; n += 1) {
         for (int loop = 1; loop < 5; loop ++) {
            System.out.printf("%6s", (int)power(n, loop) + " ");
         }
         System.out.println("");
      }

      //Second loop
      for (int n = 1; n < 16; n ++) {
         System.out.print(n ); System.out.printf("%14s", Lab06a.factorial(n));
         System.out.println("");
      }

      //Sum up two binary number and prints result in binary form
      System.out.println("Enter the binary numbers");
      binary1 = scan.next();
      binary2 = scan.next();
      sum = toDecimal(binary1) + toDecimal(binary2);
      System.out.println("Their sum is equal to " + toBinary(sum));

      //Writes a string by reversing each word
      System.out.println("Enter a string to be reversed");
      scan.nextLine();
      reverse = scan.nextLine();
      String[] parts = reverse.split(" ");
      for( int loop = parts.length; loop > 0 ; loop += (-1)){
         System.out.print(reverse(parts[parts.length-loop]) + " ");
      }
      System.out.println("");

      //Third loop
      System.out.print("Please enter the number x for 'sin(x)'");
      x = scan.nextDouble();
      currentSum = 0;
      for( int loop = 0; loop < 11 ; loop++){
         currentSum +=  (power( -1 , loop)) / (factorial(2 * loop + 1)) * (power(x , (2 * loop + 1)));
         System.out.print( loop + "   " + power( -1 , loop) + "   " + power(x , (2 * loop + 1)) + "   " + factorial(2 * loop + 1) + "   " + currentSum);
         System.out.println("");
      }
      System.out.println("The end result of sin(" + x + ") is:" + currentSum);

      //Fourth loop. It is the improved version of the sin(x) method
      currentSumImproved = 0;
      for( int loop = 1; loop < 11; loop += 2){
         double add = power(x , loop) / factorial(loop);
         if( (loop + 1) % 4 == 0){
            add = add * (-1);
         }
         currentSumImproved += add;
      }
      
      //Fifth loop which works better
      multipleA = 2;
      multipleB = 3;
      a = x;
      b = a * power( x, 2) / (multipleA * multipleB) * (-1);
      multipleA += 2;
      multipleB += 2;
      c = b * power( x, 2) / ((multipleA) * (multipleB)) * (-1);
      
      for( int loop = 0; loop < 30; loop ++){
        if( loop == 11){
           a = a + b + c;
        }
        else{
           a = a + b;
           b = c;
           multipleA += 2;
           multipleB += 2;
           c = b * power(x ,2) / (multipleA * multipleB) * (-1);
        }
      }
        
      System.out.println("The more accurate end result of sin(" + x + ") is:" + currentSumImproved);
      System.out.println("The more and more accurate end result of sin(" + x + ") is:" + a);
      System.out.println("The Math.sin(x result of sin(" + x + ") is:" + Math.sin(x) );

      System.out.println( "End.");
   }

}