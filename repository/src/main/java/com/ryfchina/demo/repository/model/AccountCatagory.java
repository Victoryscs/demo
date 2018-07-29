package com.ryfchina.demo.repository.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户类别
 *
 * @author renjun
 * @email renjun@medicalunion.cn
 * @createTime 2017-09-07 17:09:39
 * @since JDK 1.8
 */
public class AccountCatagory implements Serializable {

	private static final long serialVersionUID = 1454657565L;

	// 主键
	private String pkid;
	// 账户类别名称
	private String name;
	// 账户类别编码
	private String code;
	// 所属机构
	private String belong;
	// 所属机构（值）
	private String belongValue;
	// 所属渠道编号
	private String channelId;
	// 录入人
	private String createUser;
	// 录入时间
	private Date createTime;
	// 修改时间
	private Date updateTime;
	// 修改人
	private String updateUser;
	// 备注
	private String remark;
	// 交易上限
	private long upper;
	// 交易下限
	private long lower;

	public long getUpper() {
		return upper;
	}

	public void setUpper(long upper) {
		this.upper = upper;
	}

	public long getLower() {
		return lower;
	}

	public void setLower(long lower) {
		this.lower = lower;
	}

	public String getBelongValue() {
		return belongValue;
	}

	public void setBelongValue(String belongValue) {
		this.belongValue = belongValue;
	}

	/**
	 * 设置：主键
	 */
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}

	/**
	 * 获取：主键
	 */
	public String getPkid() {
		return pkid;
	}

	/**
	 * 设置：账户类别名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取：账户类别名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置：账户类别编码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取：账户类别编码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置：所属机构
	 */
	public void setBelong(String belong) {
		this.belong = belong;
	}

	/**
	 * 获取：所属机构
	 */
	public String getBelong() {
		return belong;
	}

	/**
	 * 设置：所属渠道编号
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * 获取：所属渠道编号
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * 设置：录入人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * 获取：录入人
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * 设置：录入时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取：录入时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置：修改人
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * 获取：修改人
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountCatagory[");
		builder.append(" 主键 [ pkid ] = ");
		builder.append(pkid);
		builder.append(" 账户类别名称 [ name ] = ");
		builder.append(name);
		builder.append(" 账户类别编码 [ code ] = ");
		builder.append(code);
		builder.append(" 所属机构 [ belong ] = ");
		builder.append(belong);
		builder.append(" 所属机构（值） [ belongValue ] = ");
		builder.append(belongValue);
		builder.append(" 所属渠道编号 [ channelId ] = ");
		builder.append(channelId);
		builder.append(" 录入人 [ createUser ] = ");
		builder.append(createUser);
		builder.append(" 录入时间 [ createTime ] = ");
		builder.append(createTime);
		builder.append(" 修改时间 [ updateTime ] = ");
		builder.append(updateTime);
		builder.append(" 修改人 [ updateUser ] = ");
		builder.append(updateUser);
		builder.append(" 备注 [ remark ] = ");
		builder.append(remark);
		builder.append(" 交易上限 [ upper ] = ");
		builder.append(upper);
		builder.append(" 交易下限 [ lower ] = ");
		builder.append(lower);
		builder.append("]");
		return builder.toString();
	}
}