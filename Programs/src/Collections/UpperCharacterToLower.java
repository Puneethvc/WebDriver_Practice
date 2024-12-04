package Collections;

public class UpperCharacterToLower {

	public static void main(String[] args) {


		String s ="Happy Birthday";
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)>'A' && s.charAt(i)<'Z') {
				System.out.print(" "+(char)(s.charAt(i)+32));
			}else
				System.out.print(s.charAt(i));
		}

	}

}
