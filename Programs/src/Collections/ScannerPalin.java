package Collections;

import java.util.Scanner;

public class ScannerPalin {

	public static void main(String[] args) {
// 	palindrome string using scanner class
		System.out.println("Enter a String -");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count=0;
		int j=s.length()-1;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == s.charAt(j)) {
				count++;
			}
			j--;
		}
		if(count == s.length()) {
			System.out.println("Palin "+ s);
		}else {
			System.out.println(" Not --");
		}
	}

}
