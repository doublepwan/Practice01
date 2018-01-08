package com.javaex.prob;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println("결과값 : " + sum);
			} 
			else {
				sum2 += i;
				System.out.println("결과값 : " + sum2);
			}
		}
	}

}
