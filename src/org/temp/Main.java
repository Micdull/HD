package org.temp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import jdk.management.resource.internal.TotalResourceContext;

public class Main {
	
	public static int isLeap(int y){
		if((y/4 == 0 && y/100 != 0) || y/400 ==0)
			return 1;
		return 0;
	}
	public static int TotalDay(int y,int m, int d){
		int month[][]={{31,28,31,30,31,30,31,31,30,31,30,31},
					{31,29,31,30,31,30,31,31,30,31,30,31}};
		int day = 0;
		int b = isLeap(y);
		for(int i = 0; i < m-1; i++)
			day += month[b][i];
		day = day + d;
		return day;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = "2004/01/01";
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			try{
				Date date = df.parse(str);
				df = new SimpleDateFormat("D");
				System.out.println(df.format(date));
			}catch(Exception e){
				e.printStackTrace();
			}
			
			int y = scan.nextInt();
			int m = scan.nextInt();
			int d = scan.nextInt();
			int T = TotalDay(y,m,d);
			System.out.println(T);
		}
	}
}

