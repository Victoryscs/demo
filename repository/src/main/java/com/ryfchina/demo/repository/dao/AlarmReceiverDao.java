package com.ryfchina.demo.repository.dao;

import com.ryfchina.demo.common.dao.BaseDao;
import com.ryfchina.demo.repository.model.AlarmReceiver;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 预警信息接收人
 *
 * @author baolu
 * @email baolu@medicalunion.cn
 * @createTime 2017-09-16 12:04:06
 * @since JDK 1.8
 */
@Mapper
@Component
public interface AlarmReceiverDao extends BaseDao<AlarmReceiver> {


}
