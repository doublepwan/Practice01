package com.javaex.prob;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
