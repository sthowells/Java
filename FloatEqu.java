
public class FloatEqu {
	public static void main(String[] args) {
	
		double x = (1.0/10) * (1.0/10);
		double y = (1.0/100);
		
		// creates tolerance and sets to an appropriate level
		double TOLERANCE = 0.000001;
		
		// if abs value is LESS THAN tolerance level,
		// then it is Essentially EQUAL, else NOT EQUAL
		if (Math.abs(x - y) < TOLERANCE)
			System.out.println("Essentially EQUAL");
		else
			System.out.println("NOT EQUAL");
			
		System.out.println("x equals: " + x);
		System.out.println("y equals: " + y);
	}
}
