package com.interviews.questions.deutschebank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProgrammingQuestions {
	// below 3 prog asked from flowcareer on behalf of deutsche bank:-
	// 1. calc. value upto N series -> 1 -1/3 + 1/5 -1/7 +1/9
	// 2. find cube root >50 from list
	// 3. count no of emp in each dept
	public static void main(String[] args) {
		// 1.
		double sum = 1;
		int N = 1000;
		for (int i = 0; i < N; i++) {
			sum += (Math.pow(-1, i)) * (1.0 / (2.0 * i + 1.0));
		}
		System.out.println(sum);//1.7851481634599504

		// 2.
		Integer intArr[] = new Integer[] { 1, 8, 27, 64, 125, 216 };
		List<Integer> intList = Arrays.asList(intArr);
		System.out.println(intList);//[1, 8, 27, 64, 125, 216]
		List<Integer> newList = intList.stream().filter(i -> Math.cbrt(i) >= 5).collect(Collectors.toList());
		System.out.println(newList);//[125, 216]

		List<Employee> empList = getEmployeeList();

		// group by dept.
		Map<Object, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(map);

		// count of employee dept-wise
		Map<String, Long> deptWiseMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, TreeMap::new, Collectors.counting()));
		System.out.println(deptWiseMap);//{ADMIN=4, HR=4, IT=5}

	}

	static List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(0, "Ranjeet", "IT", "abc0@gmail.com"));
		empList.add(new Employee(1, "Rohan", "IT", "abc1@gmail.com"));
		empList.add(new Employee(2, "Shubham", "HR", "abc2@gmail.com"));
		empList.add(new Employee(3, "Vikas", "ADMIN", "abc3@gmail.com"));
		empList.add(new Employee(4, "Rajeev", "IT", "abc6@gmail.com"));
		empList.add(new Employee(5, "Advik", "HR", "abc8@gmail.com"));
		empList.add(new Employee(6, "Sonam", "HR", "abc9@gmail.com"));
		empList.add(new Employee(7, "Ram", "ADMIN", "abc5@gmail.com"));
		empList.add(new Employee(8, "Ayush", "ADMIN", "abc4@gmail.com"));
		empList.add(new Employee(9, "Anand", "ADMIN", "abc7@gmail.com"));
		empList.add(new Employee(10, "Rahul", "IT", "abc12@gmail.com"));
		empList.add(new Employee(11, "Raju", "IT", "abc11@gmail.com"));
		empList.add(new Employee(12, "Yashwant", "HR", "abc10@gmail.com"));

		return empList;

	}

}
