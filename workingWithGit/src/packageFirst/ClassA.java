package packageFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassA {
	
	
	static List<String> aList = new ArrayList<>();
	
	public static  void init1() {
		aList = Arrays.asList("one","two","three");
	}

	public static void main(String[] args) {
		
		init1();
		System.out.println("call init 1 =>");
		for(String element:aList) {
			System.out.println(element);
		}
		

	}

}
