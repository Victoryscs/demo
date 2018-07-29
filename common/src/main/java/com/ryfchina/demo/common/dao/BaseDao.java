package com.ryfchina.demo.common.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础Dao(还需在XML文件里，有对应的SQL语句)
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/30 15:10
 * @since JDK 1.8
 */
public interface BaseDao<T> {

	int save(T t);

	int save(Map<String, Object> map);

	int saveBatch(List<T> list);

	int update(T t);

	int update(Map<String, Object> map);

	int delete(Object id);

	int delete(Map<String, Object> Map);

	int deleteBatch(Object[] ids);

	T view(Object id);

	List<T> list(Map<String, Object> map);

	List<T> list(Object id);

	int count(Map<String, Object> map);

	int count();

	T selectOne(Map params);

}
