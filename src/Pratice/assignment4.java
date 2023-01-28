package Pratice;

import java.util.Scanner;

public class assignment4 {

	public static void main(String[] args) {
		int a,b,c ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Swapping Number of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping");
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping:"+a +" " +b);

	}

}
