package org.ac;

import java.util.Scanner;
public class Hd_1093_AplusB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n > 0){
			int a = scan.nextInt();
			int sum = 0;
			
			for(int i = 1; i <= a; i++){
				sum += scan.nextInt();
			}
			System.out.println(sum);	
			n--;
		}
	}
}