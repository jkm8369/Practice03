package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int i;
		long result=1;
		
		for(i=1; i<=num; i++) {
			result = result*i;
		}
		
		System.out.println("결과값: "  + result);
		
		sc.close();
	}
}
