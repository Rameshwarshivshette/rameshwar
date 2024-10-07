import java.util.Arrays;
import java.util.List;

public class h {
	public static void main(String[] args) {
		List<Integer> number =Arrays.asList(2,4,3,5,3,5,3,4);
		
		number.stream().sorted().forEach(System.out::println);
 	}
	


}
