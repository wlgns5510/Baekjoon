package com.baek.study;

import java.util.Scanner;

public class Ex10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNextInt()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1+num2);
		}
		
		
		
		sc.close();

	}

}
