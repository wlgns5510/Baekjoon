package com.baek.study;

import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String num = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<count; i++) {
			sum += num.charAt(i) - '0';	//아스키코드 값을 반환하기 때문에 '0'을 해줘야 입력받은 숫자를 그대로 받을 수 있음
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
