package com.baek.study;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ex10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int getNum = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=getNum; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		int count = sc.nextInt();
		
		
		
		System.out.println(Collections.frequency(list, count));	//리스트에서 특정값이 몇번 존재하는지 확인하는 메서드
		
		sc.close();

	}

}
