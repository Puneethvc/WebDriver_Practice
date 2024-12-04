package Arrays;

public class PalindromNUmber {
	public static void main(String[] args) {
		
		int num =1221;
		int a=num;
		int rem=0, sum=0;
		while(num != 0) {
			rem= num%10;
			
			sum=sum*10+rem;
			num=num/10;
			
		}
		if(a==sum) {
			System.out.println("Palindrome number" + sum);
		}
		else
			System.out.println("not a palindrome number" +sum);
		

	}
}
