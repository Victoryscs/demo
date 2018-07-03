package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlibabaCodeStyleTests {
    public static void main(String[] args) {
        testForEeach();
    }

    /* 测试for与foreach效率 */
    public static void testForEeach() {
//        List<String> list = new ArrayList<String>();
//        list.add("1");
//        list.add("2");
//        // 报错(java.util.ConcurrentModificationException)
////        for (String item : list) {
////            if ("2".equals(item)) {
//////                list.add("3");
////                list.remove("2");
////            }
////        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if ("2".equals(next)) {
//                iterator.remove();
//            }
//        }
//        for (String s : list) {
//            System.out.println(s);
//        }
        HashMap<Object, Object> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.forEach((x,y)-> System.out.println(x));
    }

    /*List、JSON互转*/
    @Test
    public  void testJSON() {
        ArrayList<Map> users = new ArrayList<>();
        Map user = new HashMap<String,Object>();
        user.put("name","112");
        user.put("code","1");
        user.put("age","21");
        users.add(user);
        JSONObject object= JSONArray.parseObject(JSON.toJSONString(user));
        System.out.println("object>>"+object);
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(users));
        System.out.println("array>>"+array);
        List<Map> users1 = JSONObject.parseArray(array.toString(),Map.class);
        System.out.println("users1>>"+users1);
        List<Map> users2 =JSONObject.parseArray(array.toString().toString(),Map.class);
        System.out.println("users2>>"+users2);
    }
}
