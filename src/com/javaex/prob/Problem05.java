package com.javaex.prob;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력 하세요");
		int temp = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자 : ");
			num = sc.nextInt();
			if(temp<num) temp = num;
		}
		System.out.println("최대값 : "+temp);
	}

}
