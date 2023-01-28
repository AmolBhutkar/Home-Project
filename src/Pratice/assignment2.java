package Pratice;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		int x ;
		int y;
		int t;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Swapping numbersof x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("BeforeSwapping");
		t=x;
		x=y;
		y=t;
		System.out.println("Aafter Swapping:"+x+"  "+y);

		
	}

}
