import java.util.Scanner;

public class aaah {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String str1 = s.nextLine();
        String str2 = s.nextLine();

        if(str1.length() < str2.length()) {
            System.out.println("no");
        }
        else
            System.out.println("go");

    }

}