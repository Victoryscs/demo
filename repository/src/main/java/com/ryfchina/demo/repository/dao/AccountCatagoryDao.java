package com.ryfchina.demo.repository.dao;

import com.ryfchina.demo.common.dao.BaseDao;
import com.ryfchina.demo.repository.model.AccountCatagory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 账户类别
 *
 * @author renjun
 * @email renjun@medicalunion.cn
 * @createTime 2017-09-07 17:09:39
 * @since JDK 1.8
 */
@Mapper
@Component
public interface AccountCatagoryDao extends BaseDao<AccountCatagory> {

	List<Map<String, Object>> listOptions();

}
