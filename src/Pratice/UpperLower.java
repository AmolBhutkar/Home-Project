package Pratice;

public class UpperLower {

	public static void main(String[] args) {
		String str = "Adira Amol Bhutkar";
		int upper = 0;
		int lower = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z' ) {
				upper++;
			} else if (ch>='a' && ch<='z')  {
				lower++;
			}
			}
		System.out.println("Total Uppercase latters:"+upper);
		System.out.println("Total lowercase latters:"+lower);
	

	}

}
