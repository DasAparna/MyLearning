import java.util.Scanner;


public class evenODd {
	public static class Solution {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        //int n;
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	       if //N is odd print Weird
	       (N%2 != 0){
	    	   System.out.println("Weird");
	       }else if(N%2 == 0 && 2 <= N && N <= 5) { // if N is even and inclusive of 2-5 print not weird
	            System.out.println("Not Weird");
	        }else if(N%2 == 0 && 6<=N && N<= 20){ // if N is even and inclusive of 6-20 print weird
	            System.out.println("Weird");
	        }else if(N%2 == 0 && N > 20) { // if N is even and greater than 20 print not weird
	            System.out.println("Not Weird");
	        }

	        scanner.close();
	    }
	}

}
