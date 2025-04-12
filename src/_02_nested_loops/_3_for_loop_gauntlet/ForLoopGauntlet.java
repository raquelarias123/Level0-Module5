package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
/*
 * Write a for loop to do each the following:

1. Display all numbers from 0 to 100
2. Display all numbers from 100 to 0
3. Display all even numbers from 2 to 100
4. Display all odd numbers from 1 to 99
5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
     Eg:
          1 is odd
          2 is even
          3 is odd
          4 is even
          5 is odd...etc.

6. Display all multiples of 7 from 0 to 777.
7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)
 */
	
	public static void main(String[]args) {
		for(int i=0; i<101; i++) {
			//System.out.println(i);
		}
		
		for(int i=100; i>=0; i--) {
			//System.out.println(i);
		}
		
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				//System.out.println(i);
			}
		}
		
		for(int i=0; i<100; i++) {
			if(i%2==1) {
				//System.out.println(i);
			}
		}
		
		for(int i=1; i<501; i++) {
			if(i%2==1) {
				//System.out.println(i + " odd");
			}else {
				//System.out.println(i + " even");
			}
		}
		
		for(int i=0; i<778; i++) {
			if(i%7==0) {
				//System.out.println(i);
			}
		}
		
		for(int i=0; i<16; i++) {
			int year = i+2009;
			System.out.println("I was " + i + " years old in " + year);
		}
		
		
	}
}
