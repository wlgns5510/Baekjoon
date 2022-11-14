package com.baek.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();	//값을 입력받는다
		
		sc.close();
		
		String[] str2 = str.split(" ");	//공백으로 문자열을 잘라서 str2에 저장
		
		List<String> list = new ArrayList<>(Arrays.asList(str2));	//맨앞의 공백을 없애기 위해 list로 변경
		
		list.remove("");	//list의 맨앞 공백을 없앤다

		System.out.println(list.size());	//정답출력
		
		
		
		

	}

}
