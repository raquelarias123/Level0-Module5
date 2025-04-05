package _01_algorithms._2_fibonacci;

public class Fibonacci {
	/*There is more than one way to code a solution to this. The following steps give you some guidelines for one of them.
	Declare and initialize three int variables: number1, number2, and sum.
	Initialize number1 and number2 to the first two numbers of the fibonacci sequence (0 and 1) and print both numbers.
	Use a for loop that calculates the sum of the two numbers and prints it. The for loop should repeat 10 times.
	Now try to figure out how to change the variables before the for loop repeats so the sequence of numbers is correct.
	*/
	
	public static void main(String[]args){
		int number1=0;
		int number2=1;
		int sum=number1+number2;
		System.out.println(number1);
		System.out.println(number2);
		
		for(int i=0;i<10;i++){
			System.out.println(sum);
			number1=number2;
			number2=sum;
			sum=number1+number2;
			
		}
	}
}
