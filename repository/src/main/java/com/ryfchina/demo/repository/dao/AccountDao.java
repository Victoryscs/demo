package com.ryfchina.demo.repository.dao;

import com.ryfchina.demo.repository.model.Account;
import com.ryfchina.demo.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 账户
 *
 * @author renjun
 * @email renjun@medicalunion.cn
 * @createTime 2017-09-07 16:10:17
 * @since JDK 1.8
 */
@Mapper
@Component
public interface AccountDao extends BaseDao<Account> {


}
