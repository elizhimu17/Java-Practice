package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddListBetweenValues {
	private static int[] array;
	private static List<Integer> odd=new ArrayList<Integer>();
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	public static List<Integer> oddNumbers(){
		for(int num:array){
			if(num%2!=0){
				odd.add(num);
			}
		}
		for(Integer i:odd){
			System.out.println(i);
		}
		return odd;
	}

	public static void main(String[] args) {
		OddListBetweenValues o=new OddListBetweenValues();
		o.oddNumbers();

	}

}
