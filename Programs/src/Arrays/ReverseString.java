package Arrays;

public class ReverseString {

	public static void main(String[] args) {

		String s="hello Java Learners";
		String str[]=s.split("");
		int count=0;
		// using length  method
//		for(int i=str.length-1;i>=0;i--) {
//			System.out.print(str[i]);
//		
//	}
		// without using third variable
		for(String word : str) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(str[i]);
		}
	
		
		
/*
		String s ="amma";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {   // B
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("given string is palindrome --"+ rev);
		}else
			System.out.println("not plaindrome --");
	}
	*/
	}
}
