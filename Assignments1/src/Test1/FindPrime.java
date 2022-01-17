package Test1;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FindPrime {
	
	public static void main (String args[])
	{
	
	List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 2, 4, 16, 43);
	List<Integer> prime = numbers.stream().filter(FindPrime::isPrime).collect(Collectors.toList());
	prime.stream().forEach(s -> System.out.println(s));
	}	
  
	
	public static boolean isPrime(int number) {

	    // Even numbers
	    if (number % 2 == 0) {
	        return number == 2;
	    }

	    // Odd numbers
	    int limit = (int)(0.1 + Math.sqrt(number));
	    for (int i = 3; i <= limit; i += 2) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
