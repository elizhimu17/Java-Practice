package practice;

import java.util.Scanner;

public class PalindromeUsingStringBuffer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String to be reversed:");
		String str=s.next();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println("reversed String:"+sb);

	}

}
