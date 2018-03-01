package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlibabaCodeStyleTests {
    public static void main(String[] args) {
        testForEeach();
    }

    /* 测试for与foreach效率 */
    public static void testForEeach() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        // 报错(java.util.ConcurrentModificationException)
//        for (String item : list) {
//            if ("2".equals(item)) {
////                list.add("3");
//                list.remove("2");
//            }
//        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("2".equals(next)) {
                iterator.remove();
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
