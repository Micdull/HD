package org.ac;

import java.util.Scanner;
public class Hd_1092_AplusB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			if (a > 0){
				int sum = 0;
				for(int i = 1; i <= a; i++){
					sum += scan.nextInt();
				}
				System.out.println(sum);
			}
			else
				break;		
		}
	}
}
