package Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num =5;
		int i=2;
//		int n=num;
		while(num>0) {
			if(num%i==0) {
				break;
			}else {
				i++;
			}
		}
			if(num==i) {
				System.out.println("prime" +num);
			}else {
				System.out.println("not a prime number"+num);
			}	
		}
}		

	