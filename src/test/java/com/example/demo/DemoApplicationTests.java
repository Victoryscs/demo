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

    class a {
        String A = "adas";
    }

    public static void main(String[] args) {
//		long l = System.nanoTime();
//		SortedMap<String, String> treeMap = new TreeMap<>();
//		treeMap.put("a","4");
//		treeMap.put("c","3");
//		treeMap.put("d","1");
//		treeMap.put("b","2");
//		List<Map.Entry<String, String>> arrayList = new ArrayList<>(treeMap.entrySet());
//		Collections.sort(arrayList, (o1, o2) ->Integer.valueOf(o2.getValue()).compareTo(Integer.valueOf(o1.getValue())));
//		arrayList.parallelStream().sorted(((o1, o2) -> Integer.valueOf(o2.getValue()).compareTo(Integer.valueOf(o1.getValue()))));
//		arrayList.stream().sorted((Comparator.comparing(Map.Entry::getValue)));
//		final Boolean[] flag = {true};
//		for(Map.Entry e :arrayList){
//			flag="32131";
//			System.out.println(e.getKey().toString()+e.getValue());
//		}

//		treeMap.forEach((k,v)->{
//			flag[0] =true;
//			System.out.println(k+v);});
//		long l1 = System.nanoTime();
//		System.out.println(l1-l);
//		System.out.println(Long.valueOf("43323141"));
        int[] i = {11, 2, 45, 43, 22, 55, 12};
        testSort(i);

    }


    public static void testSort(int[] i) {
        //冒泡排序，将每段数值区间的最大值向后移动
//        int temp;
//        for (int i1 = 0; i1 < i.length; i1++) {
//            for (int j=1;j<i.length-i1;j++){
//                if(i[j]<i[j-1]){
//                 temp=i[j];
//                 i[j]=i[j-1];
//                 i[j-1]=temp;
//                }
//            }
//        }
        //选择排序，从坐标值开始，筛选出区间最小值下标，并与坐标值交换位置1
        /*int index;
        int temp;
        for (int i1 = 0; i1 < i.length; i1++) {
            index=i1;
            for(int j=index+1;j<i.length;j++){
                if(i[j]<i[index]){
                    index=j;
                }
            }
            if(index!=i1) {
                temp = i[i1];
                i[i1]=i[index];
                i[index]=temp;
            }
        }*/
        //差值排序,将坐标值插入已排数值的正确位置
       /* int j;
        int num;
        for (int i1 = 1; i1 < i.length; i1++) {
            j = i1 - 1;
            num = i[i1];
            while (j >= 0 && num < i[j]) {
                i[j + 1] = i[j];
                j--;
            }
            i[j + 1] = num;
        }*/
        //二元选择排序
        int i1, j1, n1, temp, min, max;
        n1 = i.length;
        for ( i1 = 1; i1 < n1 ; i1++) {
            max = i1;
            min = i1;
            for ( j1 = i1 + 1; j1 < n1 - i1; j1++) {
                if (i[j1] > i[max]) {
                    max = j1;
                    continue;
                }
                if (i[j1] < i[min]) {
                    min = j1;
                }
            }
            temp = i[i1 - 1];
            i[i1 - 1] = i[min];
            i[min] = temp;
            temp = i[n1 - i1];
            i[n1 - i1] = i[max];
            i[max] = temp;
        }
        for (int i2 : i) {
            System.out.println(i2);
        }
    }


}
