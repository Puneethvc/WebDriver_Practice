package Collections;

import java.util.HashSet;

public class CountOfLetter {

	public static void main(String[] args) {
	
		String s="Puniii";
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(char c : set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(c == s.charAt(i)) {
					count++;
				}
			}
			if(count > 0) {
				
			}
			System.out.println(c + " "+count);
		}

		
	}
}