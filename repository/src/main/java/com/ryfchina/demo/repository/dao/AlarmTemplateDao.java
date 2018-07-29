package com.ryfchina.demo.repository.dao;

import com.ryfchina.demo.repository.model.AlarmTemplate;
import com.ryfchina.demo.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 预警模板信息
 *
 * @author renjun
 * @email baolu@medicalunion.cn
 * @createTime 2017-09-15 20:22:42
 * @since JDK 1.8
 */
@Mapper
@Component
public interface AlarmTemplateDao extends BaseDao<AlarmTemplate> {


}
