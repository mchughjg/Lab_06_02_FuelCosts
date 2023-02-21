import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args)
    {
	   Scanner scanner = new Scanner(System.in);

       double n,e,p;
       System.out.print("Please enter the number of gallons of gas in your gas tank.: ");
       n = scanner.nextDouble();
       System.out.print("Please enter the fuel efficiency in miles per gallon for your car: ");
       e = scanner.nextDouble();
       System.out.print("Please enter the price per gallon: ");
       p = scanner.nextDouble();

       if(n < 0 || e < 0 || p < 0)
           System.out.println("Error: Invalid Input. All values can only be positive.");
       else
       {
           System.out.println("The cost of 100 miles: $" + ((100/e)*p) );
       }
    }
}
