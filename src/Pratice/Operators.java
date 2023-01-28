package Pratice;

public class Operators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//==================Arithmatic operators==============
		System.out.println("Addition of a and b:" + (a + b));
		System.out.println("subtracton of a and b:" + (a - b));
		System.out.println("multiplication of a and b:" + (a * b));
		System.out.println("divisoin of a and b:" + (a / b));
		System.out.println("mod of a and b:" + (a % b));
        //==================Relatinal operator==============
		System.out.println(" a is > b:" + (a < b));// it will return false because a is not grater than b
		System.out.println(" a is < b:" + (a < b));// it will return true because a is less  than b
		System.out.println(" a is >= b:" + (a >= b));
		System.out.println(" a is <= b:" + (a <= b));
		System.out.println(" a is != b:" + (a != b));
		//==================Logical operator==============
		boolean x = true;
		boolean y = false;
		System.out.println(" a and b:" + (x && y));//false (&& operator always return true if both vales are true otherwisw false)
		System.out.println(" a is || b:" + (x || y));//true(or operator is ture if any valuse is ture otherwise false)
		System.out.println(" a is ! b:" + ( !x ));//if any value is ture it retun false 
		
		//==================Icrement and decrement operators==============
		int z=15;
		z++;
		int t =15;
		t--;
		System.out.println(z);
		System.out.println(t);
		

	}
}
