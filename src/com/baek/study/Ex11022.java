package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> mList = new ArrayList<>();
		
		for(int i=1; i<=count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = num1+num2;
			String math = num1 + " + " + num2 + " = ";
			
			
			list.add(sum);	
			mList.add(math);
		}
		
		for(int i=0; i<count; i++) {
			System.out.println("Case #" + (i+1) + ": " + mList.get(i) + list.get(i));
		}
		
		sc.close();

	}

}
