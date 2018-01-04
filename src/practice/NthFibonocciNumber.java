package practice;

import java.util.Scanner;

public class NthFibonocciNumber {
	public static int fib(int n){
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		System.out.println(fib(n));
	}

}
