package org.ac;

import java.util.Scanner;

public class  Hd_1001_Sum{  //
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int sum = 0;
			int a = scan.nextInt();
			//int b = scan.nextInt();
			for(int i = 0;i<=a;i++){
				sum += i;
			}
			System.out.println(sum);
			System.out.println();
		}
	}
}
