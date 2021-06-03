package amalitecharithmeticoperators;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		int interest;
		int time;
		double Total;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		amount=in.nextInt();
		
		System.out.print("Enter the interest: ");
		interest=in.nextInt();
		
		System.out.print("Enter the time period: ");
		time=in.nextInt();
		
		in.close();
		//Simple interest=p*r*t/100
		
		Total=amount*interest*time/100;
		
		System.out.print("The simple interest is: ");
		System.out.println(Total);

	}

}
