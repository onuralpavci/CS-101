import java.util.Scanner;

/**
 * __html page creator___ 
 * @onuralp avc�___
 * @16.10.2019__
 */ 
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final String DOCTYPEHTML = "<!DOCTYPE html>";
      final String HTML = "<html>";
      final String HEAD = "<head>";
      final String TITLE = "<title>";
      final String STITLE = "</title>";
      final String SHEAD = "</head>";
      final String BODY = "<body>";
      final String HR = "<hr>";
      final String HL = "<h1>";
      final String SHL = "</h1>";
      final String P = "<p>";
      final String SP = "</p>";
      final String SBODY = "</body>";
      final String SHTML = "</html>";
      
      // variables
      String name;
      int age;
      double salary;
      String comments;
      
      
      //program codes 
      
      /*System.out.println( "Enter your name: ");*/
      name = scan.nextLine();
      /*System.out.println( "Enter your age: ");*/
      age = scan.nextInt();
      /*System.out.println( "Enter your salary: ");*/
      salary = scan.nextDouble();
      /*System.out.println( "Enter comment: ");*/
      scan.nextLine();
      comments = scan.nextLine();

      System.out.println(DOCTYPEHTML);
      System.out.println( "");
      System.out.println( HTML);
      System.out.println( "");
      System.out.println( HEAD);
      System.out.println( TITLE+name+"'s Home Page"+STITLE);
      System.out.println( SHEAD);
      System.out.println( "");
      System.out.println( BODY);
      System.out.println( "");
      System.out.println( HR);
      System.out.println( HL+name+SHL);
      System.out.println( P + "Age:" + age + SP);
      System.out.println( P + "Salary: " + salary + SP);
      System.out.println( P + "Comments: " + comments + SP);
      System.out.println( HR);
      System.out.println( "");
      System.out.println( SBODY);
      System.out.println( "");
      System.out.println(SHTML);
   }

}