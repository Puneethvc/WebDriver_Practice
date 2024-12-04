package Arrays;

public class MissingNumberInArray {
	public static void main(String[] args) {
		
		
//		int a[]= {1,2,4,5};
//		int sum1=0;
//		for(int i=0;i<a.length;i++) {
//			sum1=sum1+a[i];
//		}
//		System.out.println(sum1);
//	
//	int sum2=0;
//	for(int i=1;i<=5;i++) {
//		sum2=sum2+i;
//		
//		
//	}
//	System.out.println(sum2);
//	System.out.println("Missing Numbder In Array --"+ (sum2-sum1));
		
		int a[]= {1,2,3,4};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if (a[i]>a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
	for(int i=a.length-1;i>=0;i--) {
//		System.out.println(a[i]);
	}
	
	String s=" learning java";
	char[] ch =s.toCharArray();
	for(char word : ch) {
		System.out.println(word);
	}
	
	}
}
