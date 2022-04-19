package com.baek.입출력과사칙연산;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		A = sc.nextInt();
		B = sc.nextInt();
		if(0 < A && B < 10) {
			System.out.println(A*B);
		}
		sc.close();
	}
}
