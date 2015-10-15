import java.util.Scanner;

public class s4c {

	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);

		int P = s.nextInt();
		int N = s.nextInt();
		s.nextLine();
		for(int i = 0;i < P;i++){
			s.nextLine();
		}
		
		System.out.println(N);
		
	}

}
