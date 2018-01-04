package practice;

public class ReverseString {
	private static String stringRev(String str){
		String rev="";
		int n=str.length();
		for(int i=n-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(stringRev("ssecnirp"));
		

	}

}
