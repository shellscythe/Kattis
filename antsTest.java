import java.util.Scanner;
public class antsTest {
	
	private static Scanner s;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int num;
		int l;
		int n;
		int ans1;
		int ans2;
		
		num = s.nextInt();

		int[] N;
		int[] S = new int[num];
		int[] F = new int[num];
		
		for (int i = 0;i < num;i++){
		
			l = s.nextInt();
			n = s.nextInt();
			N = new int[n];
			
			for(int j = 0;j < n;j++){
				N[j] = s.nextInt();
			}
			
			ans1 = N[0];
			ans2 = N[0];
			
			for (int k = 0;k < n;k++){
				if (Math.abs(l/2 - N[k]) < Math.abs(l/2 - ans1)){
					ans1 = N[k];
				}

				if (Math.abs(l/2 - N[k]) > Math.abs(l/2 - ans2)){
					ans2 = N[k];
				}
			}
			
			ans1 = l/2 - Math.abs(l/2 - ans1);
			ans2 = l/2 + Math.abs(l/2 - ans2);
			
			S[i] = ans1;
			F[i] = ans2;
			
			System.out.print(S[i] + " ");
			System.out.print(F[i] + "\n");
			
		}
		
	}

}
