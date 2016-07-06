package Task01;

import java.util.Scanner;

class ArrayConverse {
	public int[] function(int b[][]) {
		int c[] = new int[b.length * b.length];
		for (int i = 0, k = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++, k++) {
				c[k] = b[j][i] * k;
			}
		}
		return c;
	}

	public int[][] function(int c[]) {
		int size = (int) Math.sqrt(c.length);
		int b[][] = new int[size][size];
		for (int i = 0, k = 0; i < size; i++) {
			for (int j = 0; j < size; j++, k++) {
				b[i][j] = c[k] * k;
			}
		}
		return b;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b[][] = null;
		int c[] = null;
		ArrayConverse a = new ArrayConverse();
		int s = -1, n;
		do {
			System.out.println();
			System.out.println("To converse from first dimension array to second dimension array press \'1\'");
			System.out.println("To converse from second dimension array to first dimension array press \'2\'");
			System.out.println("Select your option \'1\' or \'2\':");
			s = in.nextInt();
			do {
				System.out.print("Side size(2-9): ");
				n = in.nextInt();
			} while (n < 2 || n > 9);
			    System.out.println("Input array elements");
			switch (s) {
			case 1:
				n = in.nextInt();
				c = new int[n];
				for (int i = 0; i < n; i++) {
					c[i] = in.nextInt();
				}
				b = a.function(c);
				break;
			case 2:
				n = in.nextInt();
				b = new int[n][n];
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						b[i][j] = in.nextInt();
					}
					c = a.function(b);
					;
					break;
				}
				if (b != null && c != null) {
					System.out.println("c = ");
					for (int i = 0; i < c.length; i++) {
						System.out.println(c[i] + " ");
					}
					System.out.println();
					System.out.println("b = ");
					for (int i = 0; i < b.length; i++) {
						for (int j = 0; j < b[i].length; j++) {
							System.out.println(b[i][j] + " ");
						}
						System.out.println();
					}

				}

			}
		} while (s != 0);

	}

}