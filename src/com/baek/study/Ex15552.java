package com.baek.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		StringTokenizer sum;	//문자열을 쪼갠다
		
		for(int i=1; i<=count; i++) {
			sum = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(sum.nextToken()) + Integer.parseInt(sum.nextToken()))+ "\n");	//쪼갠 문자열의 앞, 뒤의 합
		}
		br.close();
		bw.flush();
		bw.close();
		
		

	}

}
