package Arrays;

public class HappyNumer {

	public static void main(String[] args) {

		int num=123991;
		
		int n=num;
		while(n>9) {
			int sum=0;
			while(n>0) {
			int hn=n%10;
			sum = sum+hn;
			n=n/10;
		}
		n=sum;
		}
//		System.out.println("Happy Number -- "+n);
		
		int a=6;
		int b=2;
		while(a>0) {
			if(a%b==0) {
				break;
			}else {
				b++;
			}
			if(a==b) {
				System.out.println("prime");
			}else
				System.out.println("not prime");
		}
	}
}
