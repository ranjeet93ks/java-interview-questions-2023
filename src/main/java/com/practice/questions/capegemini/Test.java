package com.practice.questions.capegemini;

public class Test {

	public static void main(String[] args) {
		System.out.println(isPrime(0));// false
		System.out.println(isPrime(1));// false
		System.out.println(isPrime(2));// true
		System.out.println(isPrime(3));// true
		System.out.println(isPrime(4));// false

		System.out.println(isPrime(5));// true
		System.out.println(isPrime(6));// false
		System.out.println(isPrime(7));// true
		System.out.println(isPrime(8));// false
		System.out.println(isPrime(9));// false
		System.out.println(isPrime(10));// false
		System.out.println(isPrime(11));// true
	}

	public static boolean isPrime(int no) {
		System.out.println("No is : " + no);
		if (no == 0 || no == 1)
			return false;
		else if (no == 2 || no == 3)
			return true;
		else if (no % 1 == 0 || no % no == 0) {
			for (int j = 2; j < no - 1; j++) {
				if (no % j == 0)
					return false;
			}
			return true;
		}
		return false;
	}

}
