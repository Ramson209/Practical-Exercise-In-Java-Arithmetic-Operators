package amalitecharithmeticoperators;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int base;
          int exponent;
          double Total ;
          
          Scanner in=new Scanner(System.in);
          
          System.out.println("Enter The Base Number: ");
          base=in.nextInt();
          
          System.out.println("Enter The Exponent Of The Base: ");
          exponent=in.nextInt();
          in.close();
          
          Total=  Math.pow(base, exponent);
          
          System.out.print("The power is: ");
          System.out.println(Total);
          
	}
 
}
