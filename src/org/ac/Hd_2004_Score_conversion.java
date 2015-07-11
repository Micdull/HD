package org.ac;

import java.util.Scanner;

public class Hd_2004_Score_conversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double n = scan.nextInt();
			if(n>100 || n<0)
				System.out.println("Score is error!");
			else if(n>=90 && n<=100)
				System.out.println("A");
			else if(n>=80 && n<90)
				System.out.println("B");
			else if(n>=70 && n<80)
				System.out.println("C");
			else if(n>=60 && n<70)
				System.out.println("D");
			else
				System.out.println("E");
		}
	}

}
