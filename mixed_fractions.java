import java.util.Scanner;

public class mf {

	private static Scanner s;
	
	public static void main(String[] args) {

		s = new Scanner(System.in);
		int n,d;
		n = s.nextInt();
		d = s.nextInt();
		
		while(n != 0 && d != 0){
			System.out.println(n / d + " " + n % d + " / " + d);
			n = s.nextInt();
			d = s.nextInt();
		}
		
	}

}
