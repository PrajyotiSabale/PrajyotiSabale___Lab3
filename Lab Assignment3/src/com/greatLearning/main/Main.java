package com.greatLearning.main;

import com.greatLearning.service.BalancedBrackets;

public class Main {

	public static void main(String[] args) {
		String expr = "[()]{}";
		if (BalancedBrackets.areBracketsBalanced(expr))
			System.out.println("The entered string has Balanced Brackets");
		else
			System.out.println("The entered string has Not Balanced Brackets");
	}
}
