package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	String A;
	class a{
		String A="adas";
	}
	public static void main(String[] args) {
		long l = System.nanoTime();
		SortedMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("a","4");
		treeMap.put("c","3");
		treeMap.put("d","1");
		treeMap.put("b","2");
		List<Map.Entry<String, String>> arrayList = new ArrayList<>(treeMap.entrySet());
//		Collections.sort(arrayList, (o1, o2) ->Integer.valueOf(o2.getValue()).compareTo(Integer.valueOf(o1.getValue())));
//		arrayList.parallelStream().sorted(((o1, o2) -> Integer.valueOf(o2.getValue()).compareTo(Integer.valueOf(o1.getValue()))));
//		arrayList.stream().sorted((Comparator.comparing(Map.Entry::getValue)));
		final Boolean[] flag = {true};
//		for(Map.Entry e :arrayList){
//			flag="32131";
//			System.out.println(e.getKey().toString()+e.getValue());
//		}

		treeMap.forEach((k,v)->{
			flag[0] =true;
			System.out.println(k+v);});
		long l1 = System.nanoTime();
//		System.out.println(l1-l);
		System.out.println(Long.valueOf("43323141"));
	}

}
