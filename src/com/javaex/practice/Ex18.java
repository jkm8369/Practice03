package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y=1; y<=num; y++) {
			for(int x=1; x<=num; x++) {
				if(num+x-y==1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
