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
        int[] i = {11, 21, 45, 431, 22, 55, 12};
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
//        int i1, j1, n1, temp, min, max;
//        n1 = i.length;
//        for (i1 = 0; i1 < n1 / 2; i1++) {
//            max = i1;
//            min = i1;
//            for (j1 = i1; j1 < n1 - i1; j1++) {
//                if (i[j1] > i[max]) {
//                    max = j1;
//                    continue;
//                }
//                if (i[j1] < i[min]) {
//                    min = j1;
//                }
//            }
//            temp = i[i1];
//            i[i1] = i[min];
//            i[min] = temp;
//            if (max == i1) {
//                // 当最大值为il时，由于min与il已交换位置，所以此时的最大值应为交换后的i[min]
//                temp = i[n1 - i1 - 1];
//                i[n1 - i1 - 1] = i[min];
//                i[min] = temp;
//            } else {
//                temp = i[n1 - i1 - 1];
//                i[n1 - i1 - 1] = i[max];
//                i[max] = temp;
//            }
//        }

        // 堆排序(在插值排序的基础上进一步优化)
//        int len = i.length;
//        //循环建堆
//        for (int i1 = 0; i1 < len - 1; i1++) {
//            //建堆
//            buildMaxHeap(i, len - 1 - i1);
//            //交换堆顶和最后一个元素
//            swap(i, 0, len - 1 - i1);
//        }
        for (int i3 : i) {
            System.out.println(i3);
        }
    }

    //对data数组从0到lastIndex建大顶堆
    private static void buildMaxHeap(int[] data, int lastIndex) {
        //从lastIndex处节点（最后一个节点）的父节点开始
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            //k保存正在判断的节点
            int k = i;
            //如果当前k节点的子节点存在
            while (k * 2 + 1 <= lastIndex) {
                //k节点的左子节点的索引
                int biggerIndex = 2 * k + 1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if (biggerIndex < lastIndex) {
                    //若果右子节点的值较大
                    if (data[biggerIndex] < data[biggerIndex + 1]) {
                        //biggerIndex总是记录较大子节点的索引
                        biggerIndex++;
                    }
                }
                //如果k节点的值小于其较大的子节点的值
                if (data[k] < data[biggerIndex]) {
                    //交换他们
                    swap(data, k, biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                    k = biggerIndex;
                } else {
                    break;
                }
            }

        }
    }

    //交换方法
    private static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
