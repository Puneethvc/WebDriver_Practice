package Arrays;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortArrayAndAssendlingOrder {

	public static void main(String[] args) {


		int a[]= {1,3,6,7,3};
	/*	
		//Approach One 
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	*/
		Arrays.sort(a);
		ArrayList<Integer> sorted= new ArrayList();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != a[i+1]) {
				sorted.add(a[i]);
			}
		}
		sorted.add(a[a.length-1]);
		System.out.println(sorted);
		
		
		
	}

}
