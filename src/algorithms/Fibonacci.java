package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int z = 0;
		int x = 0;
		int y = 1;
		System.out.println(x);
		System.out.println(y);
		for (int i = 0; i < 11; i++) {
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;
		}
		
		
		
	}
}
