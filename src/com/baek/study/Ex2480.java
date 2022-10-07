package com.baek.study;

import java.util.Scanner;

public class Ex2480 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int money=0;
		sc.close();
		
		if(num1 == num2 && num2 == num3) {	//3개의 주사위 눈이 같은결우
			money = 10000+(num1*1000);
		}
		else if(num1 == num2) {	//2개의 주사위 눈이 같은경우
			money = 1000+(num1*100);
		}
		else if(num1 == num3) {
			money = 1000+(num1*100); //2개의 주사위 눈이 같은경우
		}
		else if(num2 == num3) {
			money = 1000+(num2*100); //2개의 주사위 눈이 같은경우
		}
		else {	//3개의 눈이 모두 다를경
			money = Math.max(num1, Math.max(num2, num3))*100;
		}
		System.out.println(money);
	}
}

	
	




