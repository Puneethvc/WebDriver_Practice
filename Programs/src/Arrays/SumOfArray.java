package Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			sum = a[i]+sum;
		}
		System.out.println("sum of array in ascending--"+ sum);
		
		//Method 2
	for(int value : a) {
		sum = value+sum;
	}
	System.out.println("sum in enhanced loop --"+ sum);
		
		
}
}

