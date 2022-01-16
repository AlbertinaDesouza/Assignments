
public class MaximumTest<T extends Comparable<T>> {

	public MaximumTest(T x, T y, T z) {

		this.x = x;
		this.y = y;
		this.z = z;
		
	}

	T x, y, z;

	public T maximum() {
		return MaximumTest.maximum(x, y, z);
	}
	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; // assume x is initially the largest

	    if (y.compareTo(max) > 0)
	      max = y; // y is the largest so far

	    if (z.compareTo(max) > 0)
	      max = z; // z is the largest
	    printMax(x, y, z, max);
	    return max; // returns the largest object
	  } // end method maximum

	public static String  testMaximum(String x, String y ,String z) 
	  {
		String max = x; // assume x is initially the largest

	    if (y.compareTo(max) > 0)
	      max = y; // y is the largest so far

	    if (z.compareTo(max) > 0)
	      max = z; // z is the largest
          printMax(x, y, z, max);
	    return max; // returns the largest object
	  }

	public static <T> void printMax(T x, T y, T z, T max) {

		System.out.printf("Maximum of %s, %s and %s is %s\n", x, y, z, max);

	}

	public static void main(String args[]) {
		
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
		System.out.printf("Maximum of %s, %s and %s is %s\n", "pear", "apple", "orange",
				maximum("pear", "apple", "orange"));
		
		Integer xInt= 3, yInt= 4, zInt=6;
		Float xF1=2.2f ,yF2=5.6f ,zF3=1.0f;
		String xStr= "pear",yStr="apple", zStr="orange";
		MaximumTest.testMaximum(xStr, yStr, zStr);
		 new MaximumTest(xInt, yInt, zInt).maximum();
		 new MaximumTest(xF1, yF2, zF3).maximum();
		 new MaximumTest(xStr, yStr, zStr).maximum();
		
	}
}
