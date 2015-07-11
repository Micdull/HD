package org.ac;

import java.math.BigInteger;
import java.util.Scanner;

public class  Hd_1002_BigInterger{//Main
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i = 1;
		while(a > 0){
			String b = scan.next();
			String c = scan.next();
			BigInteger b2 = new BigInteger(b);
			BigInteger c2 = new BigInteger(c);
			System.out.println("Case " + i + ":");
			System.out.println(b2 + " + " + c2 +" = " + b2.add(c2));
			if(a != 1)
				System.out.println();
			a--;
			i++;
		}
	}
}
