package com.interviews.questions.dautshetelekom;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DautsheTelekom {

	public static void main(String[] args) {
		int[] inpArr = new int[] { 5, 7, 7, 8, 8, 10 };
		System.out.println(Arrays.toString(findFirstLastIndex(inpArr, 8)));

		int[] inpArr1 = new int[] { 5, 7, 7, 8, 8, 10 };
		System.out.println(Arrays.toString(findFirstLastIndex(inpArr1, 6)));

		int[] inpArr2 = new int[0];
		System.out.println(Arrays.toString(findFirstLastIndex(inpArr2, 0)));

		String inp = "abcdeabcd";
		System.out.println(firstNonRepeatingChar(inp));
	}

	public static String firstNonRepeatingChar(String inp) {
		Map<Character, Long> map = new HashMap<Character, Long>();
		map = inp.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue() > e2.getValue() ? 1 : e1.getValue() < e2.getValue() ? -1 : 0)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

		String out = String.valueOf(map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey());
		return out;
	}

	public static int[] findFirstLastIndex(int[] inpArr, int target) {
		// sorted array as inp
		List<Integer> list = new ArrayList<>();
		if (inpArr == null || (inpArr != null && inpArr.length == 0)) {
			int[] inpArr2 = new int[] { -1, -1 };
			return inpArr2;
		}

		int length = inpArr.length;
		for (int i = 0; i < length; i++) {
			if (inpArr[i] == target) {
				list.add(i);
			} else
				list.add(-1);
		}

		int[] opArr = new int[2];
		// System.out.println(list);
		list = list.stream().sorted((i1, i2) -> i1 > i2 ? 1 : i1 < i2 ? -1 : 0).collect(Collectors.toList());
		// System.out.println(list);
		opArr[0] = list.get(list.size() - 2);
		opArr[1] = list.get(list.size() - 1);

		return opArr;
	}

}
