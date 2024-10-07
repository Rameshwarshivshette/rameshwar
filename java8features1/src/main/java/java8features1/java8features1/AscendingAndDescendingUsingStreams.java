package java8features1.java8features1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescendingUsingStreams {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(3, 6, 4, 5, 3, 5, 3, 56, 3, 5, 3);
        
        // Sorting in ascending order
        List<Integer> s2 = s.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending Order: " + s2);
        
        // Sorting in descending order
        List<Integer> s3 = s.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending Order: " + s3);
    }
}
