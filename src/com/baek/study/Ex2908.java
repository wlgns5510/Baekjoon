package com.baek.study;

import java.util.Scanner;

public class Ex2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num01 = sc.next();
		String num02 = sc.next();
		sc.close();

		String[] array01;	//배열선언
		String[] array02;

		array01 = num01.split("");	//배열안에 문자열을 하나씩 넣는다
		array02 = num02.split("");

		String[] array03 = new String[array01.length];	//거꾸로 값을 넣을 배열
		String[] array04 = new String[array02.length];

		for (int i = array01.length - 1, j = 0; i >= 0; i--, j++) {

			array03[j] = array01[i];	//거꾸로된 배열에 기존 배열을 넣는다

		}

		for (int i = array02.length - 1, j = 0; i >= 0; i--, j++) {

			array04[j] = array02[i];

		}

		String n1 = "";
		String n2 = "";
		
		for (int i = 0; i < array03.length; i++) {
			n1 += array03[i];	//배열안에 있는 값들을 합친다
		}
		
		for (int i = 0; i < array04.length; i++) {
			n2 += array04[i];
		}
		
		/*
		 * System.out.println(n1); System.out.println(n2);
		 */
		
		int number01 = Integer.parseInt(n1);	//String이기때문에 int형으로 바꿔준다
		int number02 = Integer.parseInt(n2);
		
		//정답
		if(number01 > number02) {
			System.out.println(number01);
		}
		else {
			System.out.println(number02);
		}
		
		

	}

}
