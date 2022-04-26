package com.baek.입출력과사칙연산;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();  //1
		int num2 = sc.nextInt();  //2
		
		
		System.out.println(num1 * (num2%10));  //3
		System.out.println(num1 * ((num2%100-(num2%10))/10));  //4
		System.out.println(num1 * ((num2-num2%100))/100);  //5
		System.out.println(num1 * num2);  //6
		
		sc.close();
	}

}
