package com.practice.questions.logicmonitor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LogicMonitorProgram {

	public static void main(String[] args) {
		String str = "welcome to lm";
		// find 2nd repeating char from string
		System.out.println(str);
		str = str.replaceAll("\\s+", "");
		System.out.println(str);

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		map.entrySet().stream().forEach(System.out::println);

		map = map.entrySet().stream().filter(e -> e.getValue() > 1)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println("after filter -->");
		map.entrySet().stream().forEach(System.out::println);
		System.out.println("find 2nd element");
		//skip(1) -- skipped 1st element before processing
		System.out.println(map.entrySet().stream().skip(1).findFirst().get());

	}

}
