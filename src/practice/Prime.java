package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int temp;
		boolean isPrime=true;
		
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		if(n==0||n==1){
			System.out.println(n+"is not prime");
		}
		for(int i=2;i<=n/2;i++){
			temp=n%i;
			if(temp==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
		

	}

}
