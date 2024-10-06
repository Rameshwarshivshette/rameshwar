package java8features1.java8features1;

import java.util.Arrays;
import java.util.List;

public class ofallevenodnumbers {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(3,7,6,2,2,2,4,5,5);
		int sumOfOdd =number.stream().filter(n-> n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sumOfOdd);
		
		int SumOfEven= number.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(SumOfEven);
				
				  
	}

}
