package com.ryfchina.demo.repository.service;

import java.util.List;
import java.util.Map;

/**
 * IService
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/9/7 9:33
 * @since JDK 1.8
 */
public interface IService<T> {

	T view(String pkid);

	List<T> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(T t);

	int update(T t);

	int delete(String pkid);

	int deleteBatch(String[] pkids);

	T selectOne(Map<String, Object> map);

	int saveBatch(List<T> list);
}
