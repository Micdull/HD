package org.ac;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hd_2005_CountDays {
	/*
	 *DateFormat
	 *Date
	 *SimpleDateFormat
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.next();
			DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			try{
				Date date = df.parse(str);
				df = new SimpleDateFormat("D");
				System.out.println(df.format(date));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
