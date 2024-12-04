package Arrays;

public class fibonachi {
	 public static void main(String[] args) {
//	        int n = 10; // Change this value to generate Fibonacci series up to a different number
//	        generateFibonacci(n);
//	    }
//
//	    public static void generateFibonacci(int n) {
//	        int num1 = 0, num2 = 1;
//	        System.out.println("Fibonacci Series up to " + n + " terms:");
//	        System.out.print(num1 + " " + num2 + " ");
//
//	        for (int i = 2; i < n; i++) {
//	            int nextNum = num1 + num2;
//	            System.out.print(nextNum + " ");
//	            num1 = num2;
//	            num2 = nextNum;
//	        }
		 
		 System.out.println("Fibonacci series upto 10 terms ");
		 int a=10, b=0,c=1;
		 System.out.print(b +"  "+c +" ");
		 
		 for(int i=2;i<a;i++) {
			 int sum = b+c;
			 System.out.print(sum +" ");
			 b=c;
			 c=sum;
		 }
		 
	    }

}
