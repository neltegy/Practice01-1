//1에서 100까지의 수에서 5의배수 이면서 7의배수인 수 출력
package com.java.problem;

public class Problem1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
