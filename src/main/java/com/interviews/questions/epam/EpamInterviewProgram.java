package com.interviews.questions.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EpamInterviewProgram {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		String d = new String("abc");
		System.out.println(a == b);// true
		System.out.println(a == c);// false
		System.out.println(b == c);// false
		System.out.println(c == d);// false

		System.out.println(a == b.intern());// true
		System.out.println(a.intern() == b.intern());// true
		System.out.println(a.intern() == c.intern());// true

		System.out.println(c.intern() == d.intern());// true

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> list = Arrays.asList(arr);
		// list to hashset
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println(set);// [1, 2, 3, 4, 5, 6, 7, 8, 9]

		Map<Integer, Integer> result2 = list.stream().collect(Collectors.toMap(x -> x, x -> x * 2));
		System.out.println(result2);// {1=2, 2=4, 3=6, 4=8, 5=10, 6=12, 7=14, 8=16, 9=18}

		// using java8 find first non-repeating char of a string
		System.out.println(findFirstNonRepeatingCharOfString("Llove java"));// o

	}

	private static String findFirstNonRepeatingCharOfString(String input) {
		System.out.println("findFirstNonRepeatingCharOfString -->> ");
		List<String> list = Arrays.stream(input.toLowerCase().replaceAll("\\s+", "").split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(list);
		String uniqueElement = list.stream().findFirst().get();

		return uniqueElement;

	}

}
