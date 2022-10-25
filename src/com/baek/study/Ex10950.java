package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=count; i++) {
			num1 = sc.nextInt();
		    num2 = sc.nextInt();
		    list.add(num1+num2);
		}

		for(int i=0; i<count; i++) {
			System.out.println(list.get(i));
		}
		
		sc.close();

	}

}
