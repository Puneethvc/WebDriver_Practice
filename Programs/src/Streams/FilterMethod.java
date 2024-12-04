package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	int price;
	String name;
	int id;


	public Product(int price,String name, int id ) {
		this.price=price;
		this.name=name;
		this.id=id;
	}
	
}
	public class FilterMethod {
	
	public static void main(String[] args) {
		
		// using predicate method- filter
		
		List<Integer> num = Arrays.asList(10,20,15,25,30,35);
		List<Integer> evennumber = new ArrayList<Integer>();
		
//		evennumber = num.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
//		System.out.println(evennumber);
		
//		num.stream().filter(n -> n%2 ==0).forEach(n-> System.out.println(n));
		
//		List<String> names = Arrays.asList("ab","abc","abcd");
//		List<String> longname = new ArrayList<String>();
//		
//		longname=names.stream().filter(str -> str.length()>2 && str.length()<4).collect(Collectors.toList());
//		System.out.println(longname);
		
//		names.stream().filter(s -> s.length()>2 && s.length()<4).forEach(s -> System.out.println(s));
		
		
//		List<String> word = Arrays.asList("a","b","c",null,"d",null);
		
//		List<String> a = word.stream().filter(w -> w!= null).collect(Collectors.toList());
//		System.out.println(a);
		
//		word.stream().filter(w -> w!= null).forEach(w-> System.out.println(w));
		
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(100,"a",1));
		productlist.add(new Product(200,"b",2));
		productlist.add(new Product(300,"c",3));
		productlist.add(new Product(400,"d",4));
		
		productlist.stream().filter(p -> p.price>100).collect(Collectors.toList()); 
		
		
	}

}
