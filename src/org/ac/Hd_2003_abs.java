package org.ac;

import java.util.Scanner;

public class Hd_2003_abs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double t = scan.nextDouble();
			System.out.printf("%.2f",Math.abs(t));
			System.out.println();
		}
	}

}
