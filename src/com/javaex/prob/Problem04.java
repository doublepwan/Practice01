package com.javaex.prob;

public class Problem04 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%-4d",i);
			for(int k=1; k<=9; k++) {
				System.out.printf("%-4d",i+k);
			}
			System.out.println();
		}
	
	}
}
