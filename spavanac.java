import java.util.Scanner;

public class spavanac {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		int H,M;
		H = s.nextInt();
		M = s.nextInt();
				
		if(M - 45 < 0){
			M = M + 15;
			if(H - 1 < 0){
				H = 23;
			}
			else{
				H = H - 1;
			}
		}
		else{
			M = M - 45;
		}
		
		System.out.print(H + " " + M);
		
	}

}
