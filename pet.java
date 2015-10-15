import java.util.Scanner;

public class pet {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);

		int sum = 0;
		int indexHolder = 0;
		int holder = 0;
		int i,j,k;
		int[] pet = new int[5];
				
		for(i = 0;i < 5;i++){
			for(j = 0;j < 4;j++){
				sum = sum + s.nextInt();
			}
			pet[i] = sum;
			sum = 0;
		}
		
		for(k = 0;k < 5;k++){
			if (pet[k] > holder){
				holder = pet[k];
				indexHolder = k + 1;
			}	
		}
		
		System.out.print(indexHolder + " " + holder);
	}
}
