import java.util.Scanner;

/**
 * __computes number of flowers that can be planted___ 
 * @onuralp_avc�___
 * @16.10.2019__
 */ 
public class Lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      
      //variables
      
      int sidea ;
      int sideb ;
      int sidec ;
      double area;
      double semi;
      int number;
      
      //program code
      
      System.out.println("Enter the length of side a: ");
      sidea = scan.nextInt();
      System.out.println("Enter the length of side b: ");
      sideb = scan.nextInt();
      System.out.println("Enter the length of side c: ");
      sidec = scan.nextInt();
      
      semi = ((sidea + sideb + sidec)/2.0) ;
      area = (Math.sqrt(semi * (semi-sidea) * (semi - sideb) * (semi - sidec)));
      number = (int)(area * 17);

      System.out.println("Number of flowerers that can be planted: " + number);

   }

}