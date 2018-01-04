package practice;

import java.util.Scanner;

public class MultiplicationTableOfNumber {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(n+" X "+i +" = "+n*i);
		}
	}
}
