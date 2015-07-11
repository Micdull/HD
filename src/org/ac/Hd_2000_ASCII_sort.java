package org.ac;

import java.util.Arrays;
import java.util.Scanner;

public class Hd_2000_ASCII_sort {
	/**
	 * Arrays.sort
	 * @author Bryce
	 * */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch[] = new char[3];
		while(scan.hasNext()){
			ch = scan.next().toCharArray();
			Arrays.sort(ch);
			System.out.println(ch[0]+" "+ch[1]+" "+ch[2]);
		}
	}
}
