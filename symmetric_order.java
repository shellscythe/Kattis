import java.util.Scanner;

public class so {
	
	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);

		int n;
		String[] str;
		
		n = s.nextInt();
		
		while (n != 0){
			
			str = new String[n];
			
			if (n % 2 == 0){
			
				for(int i = 0;i < n;i++){
					str[i] = s.next();
					str[n-i] = s.next();
				}
			
			}
			
			else{
				
				for(int i = 0;i < n;i++){
					if (i == (n - 1)/2){
						str[i] = s.next();
						break;
					}
					str[i] = s.next();
					str[n - i - 1] = s.next();
				}
			}
	
			for(int i = 0;i < n;i++){
				System.out.print(str[n]);
			}
						
			n = s.nextInt();
		
		}
		
	}

}
