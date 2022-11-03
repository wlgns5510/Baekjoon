package com.baek.study;

import java.util.Scanner;

public class Ex8958 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()];	//배열의 크기를 지정
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();	//배열의 크기만큼 값을 담음
		}
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 0;	//O의 연속횟수
			int sum = 0;	//누적 합산
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {	//O의 갯수만큼 계산
					cnt++;					
				}
				else {
					cnt = 0;	//X일때
				}
				sum += cnt;	//cnt의 누적합계
			}
			System.out.println(sum);
		}
		
		
		sc.close();
	}

}
