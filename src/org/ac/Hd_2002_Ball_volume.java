package org.ac;

import java.util.Scanner;

public class Hd_2002_Ball_volume {
	public static final double PI = 3.1415927;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double r = scan.nextDouble();
			System.out.printf("%.3f",4*PI*r*r*r/3);
			System.out.println();
		}
	}

}
