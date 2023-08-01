package com.practice.questions.javaeight.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StreamsPractice {

	public static void main(String[] args) {
		String inp = "ilovemmyindiaa";
		// group by of each char of a string
		Map<Object, List<String>> map = Arrays.stream(inp.split("")).collect(Collectors.groupingBy(s -> s));
		System.out.println(map);// {a=[a, a], d=[d], e=[e], v=[v], y=[y], i=[i, i, i], l=[l], m=[m, m], n=[n],
								// o=[o]}

		// count occurance of each char of a string
		Map<Object, Long> occuranceMap = Arrays.stream(inp.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(occuranceMap);// {a=2, d=1, e=1, v=1, y=1, i=3, l=1, m=2, n=1, o=1}

		// find all duplicate elements from a string
		List<String> duplicateElementMap = (List<String>) Arrays.stream(inp.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateElementMap);// [a, i, m]

		// find all unique elements from a string
		List<String> uniqueElementMap = (List<String>) Arrays.stream(inp.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(uniqueElementMap);// [d, e, v, y, l, n, o]

		int i = 0;
		long l = 2;

		float f = 0;
		//float ff = 2.0; // compilation error
		float t = 2.0f;

		double dd = 2;
		double d = 2.4;
		double ddd = 2.0d;

	}

}
