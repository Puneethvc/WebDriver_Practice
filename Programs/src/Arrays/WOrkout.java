package Arrays;

import java.util.HashSet;

public class WOrkout {

	public static void main(String[] args) {
		/*
		int num=121;
		int sum=0,rem=0;
		int temp=num;
		while(num >0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("palin");
			
		}
		else
			System.out.println("npt palin");

	}
	
	*/
		
		/*
		String s="aba";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
		System.out.println("palin"+rev);
		}
		else
			System.out.println("nott");
	}
	*/

/*		

		// method 1
		String s="puni";
		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
//		
		//method 2
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch) {
			count++;
		}
		
		for(int i=count-1;i>=0;i--) {
			System.out.println(count);
		}
		*/
		
		/*
		String s="puneeth";
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		
		}
		
		for(char c: set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				
			if(c==s.charAt(i)) {
			count++;
		}
		
			}
			if(count>0) {
				System.out.println(c + " "+count);
			}
		}
		*/
		
		String s=" punneeth 1234";
		System.out.println(s.substring(10, 14));
		}	

}
