package com.ryfchina.demo.repository.dao;

import com.ryfchina.demo.repository.model.AlarmInfo;
import com.ryfchina.demo.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 预警信息
 *
 * @author baolu
 * @email baolu@medicalunion.cn
 * @createTime 2017-09-15 17:47:46
 * @since JDK 1.8
 */
@Mapper
@Component
public interface AlarmInfoDao extends BaseDao<AlarmInfo> {


}
