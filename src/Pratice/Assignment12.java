package Pratice;

public class Assignment12 {

	public static void main(String[] args) {
	int a[][]= { {10,20},{30,40},{50,60}       };
	System.out.println("Number of Row:"+a.length);
	System.out.println("Number of Coloms:"+a[0].length);
	for(int i=0;i<2;i++) {
		for(int j=0; j<2;j++) {
			System.out.print(a[i][j]+" ");
		}
	}
	System.out.println();

	}

}
