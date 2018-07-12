package com.ryfchina.demo.common.kit;



import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.*;

import com.ryfchina.demo.common.exception.CustomException;
import org.apache.commons.beanutils.BeanUtils;

/**
 * MapUtil
 *
 * @author renjun
 * @version 1.0
 * @description:
 * @create 2017/6/22 13:50
 * @since JDK 1.7
 */
public class MapKit {

    public static final String UNDERLINE = "_";


    /**
     * 把数组所有元素，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     *
     * @param params 需要参与字符拼接的参数组
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, Object> params) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = String.valueOf(params.get(key));
            if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }
        return prestr;
    }

    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null)
            return null;

        Object obj = beanClass.newInstance();

        BeanUtils.populate(obj, map);

        return obj;
    }

    /**
     * 对象转Map
     *
     * @param bean bean对象
     * @return Map
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        return beanToMap(bean, false);
    }

    /**
     * 对象转Map
     *
     * @param bean              bean对象
     * @param isToUnderlineCase 是否转换为下划线模式
     * @return Map
     */
    public static <T> Map<String, Object> beanToMap(T bean, boolean isToUnderlineCase) {

        if (bean == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            final PropertyDescriptor[] propertyDescriptors = getPropertyDescriptors(bean.getClass());
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (false == key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(bean);
                    if (null != value) {
                        map.put(isToUnderlineCase ? toUnderlineCase(key) : key, value);
                    }
                }
            }
        } catch (Exception e) {
            throw new CustomException("对象转换", e);
        }
        return map;
    }

    /**
     * 获得Bean字段描述数组
     *
     * @param clazz Bean类
     * @return 字段描述数组
     * @throws IntrospectionException
     */
    public static PropertyDescriptor[] getPropertyDescriptors(Class<?> clazz) throws IntrospectionException {
        return Introspector.getBeanInfo(clazz).getPropertyDescriptors();
    }

    /**
     * 将驼峰式命名的字符串转换为下划线方式。如果转换前的驼峰式命名的字符串为空，则返回空字符串。</br>
     * 例如：HelloWorld->hello_world
     *
     * @param camelCaseStr 转换前的驼峰式命名的字符串
     * @return 转换后下划线大写方式命名的字符串
     */
    public static String toUnderlineCase(String camelCaseStr) {
        if (camelCaseStr == null) {
            return null;
        }

        final int length = camelCaseStr.length();
        StringBuilder sb = new StringBuilder();
        char c;
        boolean isPreUpperCase = false;
        for (int i = 0; i < length; i++) {
            c = camelCaseStr.charAt(i);
            boolean isNextUpperCase = true;
            if (i < (length - 1)) {
                isNextUpperCase = Character.isUpperCase(camelCaseStr.charAt(i + 1));
            }
            if (Character.isUpperCase(c)) {
                if (!isPreUpperCase || !isNextUpperCase) {
                    if (i > 0)
                        sb.append(UNDERLINE);
                }
                isPreUpperCase = true;
            } else {
                isPreUpperCase = false;
            }
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    /*public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("b", "1");
        params.put("a", "2");
        params.put("c", "3");
        params.put("d", "4");
        params.put("e", "5");
        String resultStr = createLinkString(params);
        System.out.println("resultStr为： " + resultStr);
    }*/

}
