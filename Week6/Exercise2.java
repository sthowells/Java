
public class Exercise2 {
//	Exercise 2
//	Find the time complexity of the following Java method:
	
	int foo(int N) { // time complexity O(n) - 1 loop
	int result = 0;
	for (int i=0; i<N; i++)
	result++;
	  for (int j=0; j<1000000; j++)
	    result+=j;
	  return result;
	}
}
