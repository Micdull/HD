package org.ac;

import java.util.Scanner;

public class Hd_1090_AplusB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		while(a > 0){
			System.out.println(scan.nextInt()+scan.nextInt());
			a--;
		}
	}

}
