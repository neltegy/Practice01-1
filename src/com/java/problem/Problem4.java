//1 2 3 4 5 6 7 8 9 10
//2 3 4 5 6 7 8 9 10 11
//3 4 5 6 7 8 9 10 11 12
//이런식으로 출력
package com.java.problem;

public class Problem4 {

	public static void main(String[] args) {
		
		int num = 10;
		for (int i = 1; i <= num; i++) {
			for (int j = i; j < num + i; j++) {
				System.out.printf("%2d  ", j);
			}
			System.out.println();
		}
	}
}
