package com.interviews.questions.wissen;

import java.util.*;

public class WissenTechProgram1 {

	public static void main(String[] args) {
		System.out.println(sumOfAlternateTarget(4));// 6 //correct
		System.out.println(sumOfAlternateTarget(5));// 11 -> correct o/p
		System.out.println(sumOfAlternateTarget(6));// 17

		System.out.println(sumOfAlternateTarget(1000));// 499988
		System.out.println(sumOfAlternateTarget(10000));// 49996808
		System.out.println(sumOfAlternateTarget(100000));// 705017168
		System.out.println("end -->");

	}

	// 1st program
	// no ways to divide a no into two unequal Equal
	// 6 -> 1,1 &2,2 --only 1 way so o/p should be 1
	// 8 -> 1,1 &3,3 --only 1 way so o/p should be 1

	// 2nd program
	// lets say inp is N =5-> o/p should be 1+3+5 +2 =11
	// n target -> hit target alternatively until just 1 target remains
	// o/p will be sum of target got hitted.

	public static int sumOfAlternateTarget(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		// hit alternate target and remove the hitted target till 1 element left
		// for n=5 -> [1,2,3,4,5] -> 1+3+5=9 and then [2,4] -> 9+2=11 is o/p
		int result = 0;

		int j = 0;
		List<Integer> indexList = new ArrayList<>();
		while (list.size() >= 2) {
			for (j = 0; j < list.size(); j += 2) {
				result += list.get(j);
				// list.remove(j);
				indexList.add(list.get(j));
			}

			list.removeAll(indexList);
		}

		return result;

	}

}
