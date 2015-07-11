package org.ac;

import java.util.Scanner;

public class Hd_1091_AplusB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(b != 0 || c != 0) 
				System.out.println(b + c);
		}
		
	}
}
