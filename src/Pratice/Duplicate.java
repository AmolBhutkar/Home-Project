package Pratice;

public class Duplicate {

	public static void main(String[] args) {
		String str = "deeptibhutkar";
		int cnt = 0;
		char[] inp = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (inp[i] == inp[j]) {
					System.out.println(inp[j]);
					cnt++;
					break;

				}

			}
   
		}
		str = "bhutkaramol";
		int count = 0;
		char convert[] = str.toCharArray();
		System.out.println("Total Duplicate");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (convert[i] == convert[j]) {
					System.out.println(convert[i]);
					count++;
					break;  
				}
			}
		}
		str = "niti";
		StringBuilder br = new StringBuilder(str);
		br.reverse();
		String s = "";
		if (str.equals(s)) {
			System.out.println("Palendrome");
		} else {
			System.out.println("not Palindrop");
		}
	str="datta";
	StringBuilder st=new StringBuilder(str);
	System.out.println("st.reverse()");
	}

}
