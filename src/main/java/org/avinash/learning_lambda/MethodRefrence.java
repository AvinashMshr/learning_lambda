package org.avinash.learning_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefrence {
	
	public void refrence() {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
//		intList.forEach(new Consumer<Integer>() {
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		});
		
//		intList.forEach((Integer i )->System.out.println(i));
//		intList.forEach((i )->System.out.println(i));
//		intList.forEach(System.out::println);
		
//		intList.stream().map(String::valueOf).forEach(System.out::println);
		intList.stream().map(String::valueOf).map(String::toString).forEach(System.out::println);
		
		System.out.println(
				intList.stream()
				//.reduce(0,(total,e)->Integer.sum(total, e))
				.reduce(0,Integer::sum)
				);
		
		System.out.println(
				intList.stream()
				.map(String::valueOf)
				.reduce("",String::concat)
				);
		
		System.out.println(
				intList.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * 2)
				.reduce(0,Integer::sum)
				);
		
		System.out.println(
				intList.parallelStream()
				//.stream()
				.filter(e -> e%2 == 0)
				.mapToInt(e -> e * 2).sum()
				);
	}

}
