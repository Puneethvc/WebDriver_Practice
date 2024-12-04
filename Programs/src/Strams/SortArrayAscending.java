package Strams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArrayAscending {

    public static void main(String[] args) {
    	
    	/*
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        
        
        // Sort array using streams
//        int[] sortedArray = Arrays.stream(array)
//                                  .sorted()
//                                  .toArray();

        // Print sorted array
        System.out.println("Sorted array in ascending order:" + sortedArray);
        for (int num : sortedArray) {
            System.out.print(num + " ");
//        }
 
 */
    	
    	List<Integer> list = Arrays.asList(1,2,4,3,5,7,6);
//    	List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
    	
//    	System.out.println(sorted);
    	// prime even numbers
    	
    	List<Integer> even = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
    	System.out.println(even);
    	
    	/*
    	
    	int a[]= {1,5,3,2,3,6};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
    	
//    	String s ="puni";
//    	char[] ch = s.toCharArray();
//    	for(int i=0;i<s.length();i++) {
//    		System.out.println(s.charAt(i));
//    	}
	}
    	
    }




