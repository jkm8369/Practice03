package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum = sum + i;
			
			if(num==1 || num==i) {
				System.out.println(i);
			} else {
				System.out.print(i+ "+");
			}
		}
		
		System.out.println("합계 : " + sum );
			
		
		
		
		/*
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		System.out.print("1");
		for(int i=2; i<=num; i++) {
			sum = sum + i;
			System.out.print("+" + i);
			
		}
		System.out.println();
		System.out.println("합계 : " + (sum+1) );
		*/
		
		sc.close();
	}
	
}
					
