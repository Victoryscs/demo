package com.ryfchina.demo.repository.service.impl;

import com.ryfchina.demo.repository.service.IService;
import com.ryfchina.demo.common.dao.BaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * BaseService
 *
 * @author zhanjin
 * @version 1.0
 * @version 1.0
 * @description: 描述
 * @create 2017/9/7 9:53
 * @since JDK 1.8
 */
public class BaseService<M extends BaseDao<T>, T> implements IService<T> {
	/**
	 * 日志
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseService.class);

	@Autowired
	protected M baseDao;

	@Override
	public T view(String pkid) {
		return baseDao.view(pkid);
	}

	@Override
	public List<T> list(Map<String, Object> map) {
		return baseDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return baseDao.count(map);
	}

	@Transactional
	@Override
	public int save(T t) {
		return baseDao.save(t);
	}

	@Transactional
	@Override
	public int update(T t) {
		return baseDao.update(t);
	}

	@Override
	public int delete(String pkid) {
		return baseDao.delete(pkid);
	}

	@Transactional
	@Override
	public int deleteBatch(String[] pkids) {
		return baseDao.deleteBatch(pkids);
	}

	@Override
	public T selectOne(Map<String, Object> map) {
		return baseDao.selectOne(map);
	}

	@Transactional
	@Override
	public int saveBatch(List<T> list) {
		return baseDao.saveBatch(list);
	}
}
