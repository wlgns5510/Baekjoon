package com.baek.입출력과사칙연산;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A,B;
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		if(0 < A && B < 10) {
			System.out.println(A/B);
		}
		sc.close();
	}
}
