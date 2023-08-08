package dataStructures;

public class ArraysHW {
	
	// I made the method use an array of doubles so I could reuse the array from the sample code.
	public static double arraySum(double[] nums) {
		double sum = 0;
		
		for (double num : nums) {
			sum += num;
		}
		
		return sum;
	}
	
	public static int[] toPower(int size, int power) {
		int[] expArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			// I wasn't sure if we were allowed to use Math.pow(), so I went the long way around.
			int result = 1;
			
			for (int j = 0; j < power; j++) {
				result *= i;
			}
			
			expArray[i] = result;
		}
		
		return expArray;
	}
	
	public static void main(String[] args) {
		
		// SAMPLE CODE STARTS HERE
		double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        // Made a couple of edits to the given code for readability (and also because the compiler yelled at me for i<examplesArray.length>).
        for (int i = 1; i < exampleArray.length; i++){
        	
        	// Looks an awful lot like our array list loop map exercise, but it only needs the comparison for the largest number, and it saves the index of the largest number.
             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }
        // Looks like it prints the index of the largest number of the array.
        System.out.println(index);
        
        //SAMPLE CODE ENDS HERE
        
        int[] testing = toPower(4, 2); // This is the example given in the homework. Output should be 0 1 4 9.
        
        for (int num : testing) {
        	System.out.printf("%d ", num);
        }
        
        System.out.println();
        System.out.printf("%f", arraySum(exampleArray)); // Reusing the array in the sample code. Output should be 22.
	}
}