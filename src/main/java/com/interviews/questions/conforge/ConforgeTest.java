package com.interviews.questions.conforge;

import java.util.*;

public class ConforgeTest {

	public static void main(String[] args) {

		ArrayList<Integer> outList = removeNthSmallest(1);
		System.out.println(outList);
		
		ArrayList<Integer> outList1 = removeNthSmallest(2);
		System.out.println(outList1);
	}

	public static ArrayList<Integer> removeNthSmallest(Integer nThSmall) {
		List<Integer> inpList = new ArrayList<Integer>();
		Integer[] intArr = new Integer[] { 99, 345, 2, 12, 24, 12, 275 };
		inpList.addAll(Arrays.asList(intArr));
		System.out.println(inpList);
		ArrayList<Integer> outList = new ArrayList<>();
		Collections.sort(inpList);
		int smallestNo = inpList.get(nThSmall - 1);
		inpList.removeAll(Arrays.asList(smallestNo));
		outList.addAll(inpList);
		return outList;
	}

}
