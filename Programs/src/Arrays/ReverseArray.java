package Arrays;

public class ReverseArray {

	public static void reverse(int a[]) {
	int i=0;int j=a.length-1;
	while(i<=j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	
	}
	
	public static void main(String[] args) {
	int []a= {1,2,3,4};
	reverse(a);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
