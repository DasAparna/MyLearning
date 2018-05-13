import java.util.Scanner;


public class PrintMultiplesof1_20 {
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	//scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	for(int i=1;i<=10;i++){
		int res = N*i;
		
		System.out.println(N+ "x" +i + "=" + " " + res);
		}
	}
}
