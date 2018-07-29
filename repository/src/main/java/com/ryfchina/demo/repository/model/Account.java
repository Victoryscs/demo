package com.ryfchina.demo.repository.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户
 *
 * @author renjun
 * @email renjun@medicalunion.cn
 * @createTime 2017-09-07 16:10:17
 * @since JDK 1.8
 */
public class Account implements Serializable {

	private static final long serialVersionUID = 1454657565L;

	// 账户号
	private String pkid;
	// 账户名称
	private String name;
	// 会计科目
	private String subject;
	// 账户所属机构/用户
	private String belong;
	// 账户所属机构/用户（值）
	private String belongValue;
	// 账户类型(1：个人账户2：企业账户)
	private String type;
	// 账户类别(该值由账户类别字典值管理)
	private String catagory;
	// 账户类别(值)
	private String catagoryValue;
	// 账户余额(可用+冻结)
	private Long balance;
	// 可用余额
	private Long balanceUsable;
	// 冻结余额
	private Long balanceFrozen;
	// 货币单位
	private String currency;
	// 创建时间
	private Date createTime;
	// 创建人
	private String createUser;
	// 修改时间
	private Date updateTime;
	// 修改人
	private String updateUser;
	// 备注
	private String remark;

	public String getBelongValue() {
		return belongValue;
	}

	public void setBelongValue(String belongValue) {
		this.belongValue = belongValue;
	}

	public String getCatagoryValue() {
		return catagoryValue;
	}

	public void setCatagoryValue(String catagoryValue) {
		this.catagoryValue = catagoryValue;
	}

	/**
	 * 设置：账户号
	 */
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}

	/**
	 * 获取：账户号
	 */
	public String getPkid() {
		return pkid;
	}

	/**
	 * 设置：账户名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取：账户名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置：会计科目
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 获取：会计科目
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * 设置：账户所属机构/用户
	 */
	public void setBelong(String belong) {
		this.belong = belong;
	}

	/**
	 * 获取：账户所属机构/用户
	 */
	public String getBelong() {
		return belong;
	}

	/**
	 * 设置：账户类型(1：个人账户2：企业账户)
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取：账户类型(1：个人账户2：企业账户)
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置：账户类别(该值由账户类别字典值管理)
	 */
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	/**
	 * 获取：账户类别(该值由账户类别字典值管理)
	 */
	public String getCatagory() {
		return catagory;
	}

	/**
	 * 设置：账户余额(可用+冻结)
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	/**
	 * 获取：账户余额(可用+冻结)
	 */
	public Long getBalance() {
		return balance;
	}

	/**
	 * 设置：可用余额
	 */
	public void setBalanceUsable(Long balanceUsable) {
		this.balanceUsable = balanceUsable;
	}

	/**
	 * 获取：可用余额
	 */
	public Long getBalanceUsable() {
		return balanceUsable;
	}

	/**
	 * 设置：冻结余额
	 */
	public void setBalanceFrozen(Long balanceFrozen) {
		this.balanceFrozen = balanceFrozen;
	}

	/**
	 * 获取：冻结余额
	 */
	public Long getBalanceFrozen() {
		return balanceFrozen;
	}

	/**
	 * 设置：货币单位
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * 获取：货币单位
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置：创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * 获取：创建人
	 */
	public String getCreateUser() {
		return createUser;
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
		builder.append("Account[");
		builder.append(" 账户号 [ pkid ] = ");
		builder.append(pkid);
		builder.append(" 账户名称 [ name ] = ");
		builder.append(name);
		builder.append(" 会计科目 [ subject ] = ");
		builder.append(subject);
		builder.append(" 账户所属机构/用户 [ belong ] = ");
		builder.append(belong);
		builder.append(" 账户所属机构/用户（值） [ belongValue ] = ");
		builder.append(belongValue);
		builder.append(" 账户类型(1：个人账户2：企业账户) [ type ] = ");
		builder.append(type);
		builder.append(" 账户类别(该值由账户类别字典值管理) [ catagory ] = ");
		builder.append(catagory);
		builder.append(" 账户类别(值) [ catagoryValue ] = ");
		builder.append(catagoryValue);
		builder.append(" 账户余额(可用+冻结) [ balance ] = ");
		builder.append(balance);
		builder.append(" 可用余额 [ balanceUsable ] = ");
		builder.append(balanceUsable);
		builder.append(" 冻结余额 [ balanceFrozen ] = ");
		builder.append(balanceFrozen);
		builder.append(" 货币单位 [ currency ] = ");
		builder.append(currency);
		builder.append(" 创建时间 [ createTime ] = ");
		builder.append(createTime);
		builder.append(" 创建人 [ createUser ] = ");
		builder.append(createUser);
		builder.append(" 修改时间 [ updateTime ] = ");
		builder.append(updateTime);
		builder.append(" 修改人 [ updateUser ] = ");
		builder.append(updateUser);
		builder.append(" 备注 [ remark ] = ");
		builder.append(remark);
		builder.append("]");
		return builder.toString();
	}
}