import java.util.Scanner;

/*If i/p values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/

public class Parallelogram {

/*	public static void run(){
		Scanner sc = new Scanner(System.in);
		int area ;
		int b = sc.nextInt();
		int h = sc.nextInt();
		
		if(0<= b && b<=100  && 0<=h && h<= 100) {
			area = b*h;
			System.out.println(area);
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}*/
	
	
	static Scanner sc = new Scanner(System.in);
	static boolean flag =false;
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	static{
	
	if(B>0 && B<=100  && H > 0 && H<= 100) {
		flag = true;
	} else {
		System.out.println("java.lang.Exception: Breadth and height must be positive");
		flag = false;
	
	//return flag;
}
	
	}
public static void main(String args[]){
	//Parallelogram parClassObj = new Parallelogram();
	if(flag){
		int area=B*H;
		System.out.print(area);
	}
}
}
