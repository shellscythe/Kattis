import java.util.Scanner;

public class sl {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		int i,n,l;
		int[] S;
		int[] T;
		l = 0;
		
		n = sc.nextInt();

		while(n != -1){
			
			S = new int[n];
			T = new int[n];

			for(i = 0;i < n;i++){
				S[i] = sc.nextInt();
				T[i] = sc.nextInt();
			
				if(i == 0){
					l = S[0] * T[0];
				}
				else{
					l = l + S[i] * (T[i] - T[i - 1]); 
				}
			}	
			System.out.println(l + " miles");
			n = sc.nextInt();
		}
	}
}
