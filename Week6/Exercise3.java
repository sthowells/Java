
public class Exercise3 {
	int bar(int N) { // time complexity O(n)
		  int result = 1;
		  for (int i=1; i<N; i*=2)
		result+=2;
		  return result;
		}
}
