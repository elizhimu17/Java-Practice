package practice;

import java.util.Scanner;

public class PrintFibonacciSeries {
	public static int fibonacciSeries(int n){
		int n1=0;
		int n2=1;
		int temp=0;
		if(n==1){
			return 0;
		}
		if(n==2)
			return 1;
		for(int i=3;i<=n;i++){
			temp=n1+n2;
			n1=n2;
			n2=temp;
		}
		return temp;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
		System.out.println(fibonacciSeries(i));
		}
		

	}

}
