import java.util.Scanner;

public class rbn {

	private static Scanner s;
	
	public static void main(String[] args) {

		s = new Scanner(System.in);
		
		int n;
		
		String str1;
		String str2;
		
		n = s.nextInt();
		
		str1 = Integer.toBinaryString(n); 
		
		str2 = new StringBuffer(str1).reverse().toString();
		
		System.out.print(Integer.valueOf(str2,2).toString());

	}

}
