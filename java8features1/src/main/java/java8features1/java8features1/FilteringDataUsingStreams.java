package java8features1.java8features1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringDataUsingStreams {
	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("ram");
		s1.add("rajesh");
		s1.add("sudesh");
		s1.add("satish");
		s1.add("ramesh");
	List<String> s2 = s1.stream().filter(n->n.startsWith("s")).collect(Collectors.toList());
	
	s2.forEach(System.out::println);

	}

}
