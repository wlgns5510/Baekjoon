package com.baek.study;

import java.util.Scanner;

public class Ex2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	//케이스 개수

		for(int i=0; i<T; i++) {
			
			int R = sc.nextInt();	//케이스 반복횟수
			
			String S = sc.next(); //케이스 내용
			
			for(int j=0; j<S.length(); j++) {
				for(int z=0; z<R; z++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
