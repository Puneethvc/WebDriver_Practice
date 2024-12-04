package Arrays;

public class Cherie {

	public static void main(String[] args) {
/*
		String s ="amma";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("givene string is palindrome");
		}else {
			System.out.println("given string is not palindrome");
		}
		
		*/
		
		/*
		int num =121;
		int rem,sum=0;
		int temp=num;
		if(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(temp==sum) {
			System.out.println("palin");
		}else
			System.out.println("not");
		*/
		
		/*
		int num =5;
		int i=2;
		int temp =num;
		while(num>0) {
			if(num%2==0) {
				break;
			}else {
				i++;
			}
		}
		if(num==i) {
			System.out.println("prime num");
		}else
			System.out.println("not a prime number");
			
			*/
		
		int a=121;
		int sum=0,rem=0;
		int temp=a;
		while(a!=0) {
			rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("palin"+sum);
		}else {
			System.out.println("not"+sum);
		}
	}
}

