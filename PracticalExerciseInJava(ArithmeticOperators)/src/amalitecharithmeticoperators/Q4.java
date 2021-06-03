package amalitecharithmeticoperators;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		
        Double  Hypotenuse;
        
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter first side: ");
		x=in.nextInt();
		
		System.out.print("Enter second side: ");
		y=in.nextInt();
		in.close();
		
		//Formula Hypotenuse =sqrt(x^2+b^2)
		
		Hypotenuse=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("The length of the hypotenuse is "+Hypotenuse);
		
		
        
	}

}
