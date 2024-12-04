package Strams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,1,2,3,4,5);
		Set<Integer> set = new HashSet<Integer>();
		
		// to remove duplicate elements in array
//		list.stream().filter(e -> set.add(e)).forEach(System.out::println);
		
		// to print match duplicate elements 
		list.stream().filter(e -> !set.add(e)).forEach(System.out::println);
	}

}
