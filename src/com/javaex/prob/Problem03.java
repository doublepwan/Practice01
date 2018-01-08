package com.javaex.prob;


public class Problem03 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int k=2; k<10; k++) {
				System.out.printf("%d * %d = %-4d",k,i,i*k);
			}
			System.out.println();
		}
	}

}
