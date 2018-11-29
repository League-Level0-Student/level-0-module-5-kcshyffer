package algorithms;


import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Give me a number.");
		
		int n = Integer.parseInt(s);
		
		for (int i = 2; i < n/2; i++) {
		if (n % i == 0 ) {
			JOptionPane.showMessageDialog(null, "Your number is NOT prime!");	
			System.exit(0);
		}
		
		}
		JOptionPane.showMessageDialog(null, "Your number is prime! Congratulations!");

		
		
		
	}
}
