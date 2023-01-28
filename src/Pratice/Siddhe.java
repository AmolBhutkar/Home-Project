package Pratice;

public class Siddhe {

	public static void main(String[] args) {
		int arr[]={1,5,6,7,8,9,2};
		boolean flag=false;
		int len=arr.length;
		for(int i =0;i<len;i++) {
			for(int j=0;j<len;j++) {
				int sum ;
				sum = arr[i]+arr[j];
				if(sum==15) {
					System.out.println("numbers are:"+i+ ":"+arr[i]+" ,"+j+ ":"+arr[j]);
					System.out.println("Result is ture");
				}
			}
		}
if(flag==false) {
	System.out.println(false);
}
	}

}

/* ..............................................*/

/* class Sid1{
	public static void main(String[] args) {
		int []arr2= {1,5,6,7,8,9,2};
		boolean flag=false;
		int len=arr2.length;
		for(int i=0;i<len;i++) {
			for(int j=0;i<len;j++) {
				int sum;
				sum=arr2[i]+arr2[j];
				//System.out.println("numbers are:"+i+ ":"+arr[i]+" ,"+j+ ":"+arr[j]);
				System.out.println("Numbers are:"+i+ ":"+arr2[i]+","+j+ ":" +arr2[j]);
				System.out.println("true");
				
			}
		}
	
if(flag==false) {
	System.out.println("false");
}
 }}*/