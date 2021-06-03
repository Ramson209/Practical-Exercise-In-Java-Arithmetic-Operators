package amalitecharithmeticoperators;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x_A;
		int y_A;
		int x_B;
		int y_B;
		
		double Total;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter x coordinate of point A: ");
		x_A=in.nextInt();
		
		System.out.print("Enter y coordinate of point A: ");
		y_A=in.nextInt();
		
		System.out.print("Enter x coordinate of point B: ");
		x_B=in.nextInt();
		
		System.out.print("Enter y coordinate of point B: ");
		y_B=in.nextInt();
		in.close();
		
		//Total=y_B-y_A/x_B-x_A
		
		Total =(y_B-y_A)/(x_B-x_A);
		
		System.out.println("The slope of the given line is: "+Total);

	}

}
