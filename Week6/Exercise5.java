
public class Exercise5 {
	
	/* Question:
	 * Trace the execution of the insertion and selection sort algorithms when executed on the following array of integers:
	 * 
	 * {1, 29, 14, 15, 94}
	 * 
	 * Show how the array will look like after each iteration of the outer loop.
	 * 
	*/
	
	
	
	/* SELECTION SORT
	 * 
	 * Find smallest integer in array. Search for next smallest integer and swap until last integer is the greatest.
	 * 
	 * iteration 1: {1, 29, 14, 15, 94}		// check first integer, 1 is smallest
	 * iteration 2: {1, 14, 29, 15, 94}		// checks second integer, swap (29) with next smallest number (14)
	 * iteration 3: {1, 14, 15, 29, 94}		// checks third integer,  swap (29) with (15)
	 * iteration 4: {1, 14, 15, 29, 94}		// confirms (29) is smaller than last (94)
	 * 
	 * 
	 */
	
	
	
	/* INSERT SORT
	 * 
	 * 
	 * 1 sorted. No shift. Insert 29
	 * iteration 1: {1, 29 | 14, 15, 94}		
	 * 
	 * 1, 29 sorted. Shift right. Insert 14. 
	 * iteration 2: {1, 14, 29 | 15, 94}		
	 * 
	 * 1, 14, 29 sorted. Shift 29 right. Insert 15.
	 * iteration 3: {1, 14, 15, 29 | 94}	
	 * 
	 * 1, 14, 15, 29 sorted. No shift. Insert 94.	
	 * iteration 4: {1, 14, 15, 29, 94}		
	 * 
	 * 
	 */
	
	
}
