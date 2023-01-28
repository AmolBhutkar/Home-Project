package Pratice;

public class Fibonacci1 {

	public static void main(String[] args) {
		int s=0,s1=1,s3,count=10;
		System.out.println(" "+s+ " "+s1);
		for(int i=2;i<count;i++) {
		s3=s+s1;
		System.out.println(s3);
		s=s1;
		s1=s3;
		
		}
s=1;
for(int i=0;i<=10;i++) {
	if(i%2 ==0) {
			System.out.println("even numbers:"+i);
	}else {
		System.out.println("odd numbers:"+i);
	}
}
	}

}
