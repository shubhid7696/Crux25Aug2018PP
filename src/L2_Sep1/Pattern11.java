package L2_Sep1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class Pattern11 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nst = 1;
		int nsp = n - 1;
		int row = 1;

		while (row <= n) {

			// work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {

				if (cst % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				cst++;
			}

			// prep
			row = row + 1;
			nst = nst + 2;
			nsp = nsp - 1;
			System.out.println();

		}

	}

}
