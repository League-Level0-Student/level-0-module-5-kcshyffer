package nested_loops;

public class ForLoopGauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 100; i++) {
		System.out.println(i);
	}
	for (int j = 100; j > 0; j--) {
		System.out.println(j);
	}
	for (int i = 0; i < 100; i++) {
		System.out.println(i);
		i =	i + 1;
	}
	System.out.println("");
	for (int i = 1; i < 100; i++) {
		System.out.println(i);
		i =	i + 1;
	}
	for (int i = 0; i < 501; i++) {
		System.out.println("");
		
		if (i%2==0 ) {
			System.out.print(i + " is even.");
		}
		else {
			System.out.print(i + " is odd.");
		}
	}
	System.out.println("");
	System.out.println("");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(i);
			System.out.print(0 + j);
			System.out.println("");
		}
	}
	System.out.println("");
	for (int i = 1; i < 9; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print(i);
			i = i + 1;
		}
		System.out.println("");
		i = i - 1;
	}
	System.out.println("");
	for (int i = 1; i < 101; i++) {
		for (int j = 0; j < 10; j++) {
			System.out.print(i + " ");
			i = i + 1;
		}
		System.out.println("");
		i = i - 1;
	}
	System.out.println("");
	for (int i = 1; i < 6; i++) {
		for (int j = 1; j < 2; j++) {
			if (i == 1) {
				System.out.println("*");
			}
			else if (i == 2) {
				System.out.println("* *");
			}
			else if (i == 3) {
				System.out.println("* * *");
			}
			else if (i == 4) {
				System.out.println("* * * *");
			}
			else if (i == 5) {
				System.out.println("* * * * *");
			}
			else {
				System.out.println("* * * * * *");
			}
			
		}
	}
}
}
