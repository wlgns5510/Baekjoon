package com.baek.study;

import java.util.Scanner;

public class Ex1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		sc.close();
		
		int count = 0;	//while반복 횟수
		int num2 = num1; //새로 만들어진 값이 첫번째 값과 같음
		
		while(true) {
			num1 = ((num1 % 10) * 10) + (((num1 / 10) + (num1 % 10)) % 10);
			count++;
			
			if(num2 == num1) {
				break;	//만들어진 num2가 num1와 같다면 반복 멈춤
			}
		}
		System.out.println(count);
		
		
		sc.close();
	}

}
