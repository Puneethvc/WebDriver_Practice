package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappPrograms {
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("aa","bb","cc");
		List<String> upper = new ArrayList <String>();
		
//		for(String data : name) {
//			upper.add(data.toUpperCase());
//		}
		//using streams convert upper case
//		upper =name.stream().map(data -> data.toUpperCase()).collect(Collectors.toList());
//		System.out.println(upper);
		
		List<String> lower = name.stream().map(u ->u.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(lower);
		List<String> wordlength = Arrays.asList("hi","hello","lunch");
		
//		for(String a : wordlength)
//		{
//			System.out.println("wordklength--"+a.length());
//		}
		
		//wordlength.stream().map(len -> len.length()).forEach(length -> System.out.println(length));
//		wordlength.stream().map(len -> len.length()).forEach(System.out::println);
		
		
	}

}
