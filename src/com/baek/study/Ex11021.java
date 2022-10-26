package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = num1+num2;
			
			list.add(sum);
		}
		for(int i=0; i<count; i++) {
			System.out.println("Case #" + (i+1) + ": " + list.get(i));	//(i+1)을 안하면 for문 안에서 i+1를 String으로 인식해서 01,11,21이런식으로 값이 나옴
		}
		
		
		sc.close();

	}

}
