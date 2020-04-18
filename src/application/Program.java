package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Instánciar a matriz
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		// Ler os dados da matriz:
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position" + i + "," + j);
				}
				if (j < 0) {
					System.out.println("Left: " + mat[i][j - 1]);
				}
				if (i < 0) {
					System.out.println("Up: " + mat[i - 1][j]);
				}
				if (j < mat.length - 1) {
					System.out.println("Right: " + mat[i][j + 1]);
				}
				if (i < mat.length - 1) {
					System.out.println("Down: " + mat[i + 1][j]);
				}
			}
		}

		sc.close();
	}

}
