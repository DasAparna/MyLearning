import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * Check if MOM is pallindrome or not
 */
public class Pallindrome {
	public static void main(String args[]){
		String s;
		String rev ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s = sc.nextLine();
		int length = s.length();
		for(int i= length-1;i>=0;i--){
			rev = rev + s.charAt(i);
		}
	}
}
