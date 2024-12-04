package practice;

public class methodTest {
	 public void palin() {
	        String s = "aba";
	        String rev = "";

	        // Reversing the string
	        for (int i = s.length()-1;i>=0; i--) {
	            rev = s.charAt(i) + rev;
	        }

	        // Checking if the reversed string matches the original string
	        if (s.equals(rev)) {
	            System.out.println("Palindrome string: " + s);
	        } else {
	            System.out.println("Not a palindrome string: " + s);
	        }
	    }
	 public void palinNumbre() {
		 int num=121;
		 int temp=num;
		 int sum=0;
		 
		 while(num>0) {
			 int rem=num%10;
			 sum=sum*10+rem;
			 num=num/10;
			 
		 }
		 if(temp==sum)
		 {
			 System.out.println("palin --"+temp);
		 }else
		 {
			 System.out.println("not palin--"+temp);
		 }
	 }

	public static void main(String[] args) {
		
		methodTest obj = new methodTest();
		obj.palin();
		obj.palinNumbre();

}
}