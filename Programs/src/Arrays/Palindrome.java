package Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) {
		
		//String s ="abcd";
	/*	
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("palin -- "+ rev);
		}else
			System.err.println("not");
	*/
		/*
		char ch[] = s.toCharArray();
		int count =0;
		for(char c : ch) {
			count ++;
			
		}
		for(int i=count-1;i>=0;i--) {
			System.out.println(ch[i]+" "+count);
		}
		*/
		String s="i hate you i i you";
		String str[]= s.split(" ");
		Set<String> set = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String word : set) {
			int count =0;
			for(int i=0;i<str.length;i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			if(count>1) {
//			System.out.println(word + " "+ count);
		}
		}
		String sen = "learning java";
		char ch = (char)(sen.charAt(0)-32);
		System.out.println(ch);
		for(int i=0;i<sen.length();i++) {
		if(sen.charAt(i)==' ') {
			System.out.println(" "+(char)(sen.charAt(i+1)-32));
			
			i=i+1;
		}else
			System.out.println(sen.charAt(i));
		}
		
		}
		

}
