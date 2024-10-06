package java8features1.java8features1;

import java.util.Arrays;
import java.util.List;

public class MappingElementstoAnotherForm {
	
	public static void main(String[] args) {
	List<String> name = Arrays.asList("ram","g,","k","y","u");
	name.stream().map(String::toUpperCase).forEach(System.out::println); // Prints each name in uppercase


	}

}