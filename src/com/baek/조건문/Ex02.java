package com.baek.조건문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		if(s<=100 && 90 <=s) {
			System.out.println("A");
		}
		else if(s<=89 && 80 <=s) {
			System.out.println("B");
		}
		else if(s<=79 && 70 <=s) {
			System.out.println("C");
		}
		else if(s<=69 && 60 <=s) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		sc.close();

	}

}
