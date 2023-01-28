package Pratice;

import java.util.Scanner;

public class GratestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a:");
		a =s.nextInt();
		System.out.println("Enter b:");
		b=s.nextInt();
		System.out.println("Enter c:");
		c=s.nextInt();
		if(a > b && a > c) {
			System.out.println("a is grater");
		}else if(b > a && b > c) {
			System.out.println("b is grater");
		}else {
			System.out.println("c is grater");
		}

	}

}
