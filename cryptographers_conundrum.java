import java.util.Scanner;

public class cc {

	private static Scanner s;
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		String string = s.nextLine();
		
		char[] stringArr = string.toCharArray();
		
		int counter = 0;
		
		for(int i = 0;i < string.length() / 3;i++){
			if(stringArr[3 * i] != 'P'){
				counter++;
			}
			if(stringArr[3 * i + 1] != 'E'){
				counter++;
			}
			if(stringArr[3 * i + 2] != 'R'){
				counter++;
			}
		}
		
		System.out.println(counter);
		
	}
}
