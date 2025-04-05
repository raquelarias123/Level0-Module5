package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[]args) {
		/*Ask the user for a number (JOptionPane).
		*Use a for loop, if statement, and modulo to find if the number is prime.
		*If the number is divisible by any number other than 1 or itself, the number is not prime.
		*/
		
		String userNumber = JOptionPane.showInputDialog("Enter a number");
		int integerUserNumber = Integer.parseInt(userNumber);
		boolean isPrime=true;
		for(int i=2;i<integerUserNumber;i++) {
			if(integerUserNumber%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(!isPrime) {
			JOptionPane.showMessageDialog(null,"The number is not prime");
		}else {
			JOptionPane.showMessageDialog(null,"The number is prime");
		}
		
	}

}
