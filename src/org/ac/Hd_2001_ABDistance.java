package org.ac;

import java.util.Scanner;

public class Hd_2001_ABDistance {
	public static void main(String[] args) {
		//Scanner a new number
		Scanner scan = new Scanner(System.in);
		do{
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			System.out.printf("%.2f",Math.sqrt((a-c)*(a-c)+(b-d)*(b-d)));
			System.out.println();
		}while(scan.hasNext());
	}
}
