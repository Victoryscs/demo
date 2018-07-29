package com.ryfchina.demo.repository.model;
import java.io.Serializable;


/**
 * 预警接收人信息
 *
 * @author baolu
 * @email baolu@medicalunion.cn
 * @createTime 2017-09-16 17:41:44
 * @since JDK 1.8
 */
public class AlarmReceiverInfo implements Serializable{

    private static final long serialVersionUID=1454657565L;

    //主键
    private String pkid;
    //接收人姓名
    private String receiverName;
    //手机号
    private String phone;
    //邮件地址
    private String email;
    //状态
    private String validFlag;
    //备注
    private String remark;
    //扩展字段1
    private String extend1;
    //扩展字段2
    private String extend2;
    //扩展字段3
    private String extend3;
    //扩展字段4
    private String extend4;
    //扩展字段5
    private String extend5;

    //创建人名称
    private String createUserName;

    //修改人名称
    private String updateUserName;

    /**
     * 设置：主键
     */
    public void setPkid(String pkid){
        this.pkid = pkid;
    }
    /**
     * 获取：主键
     */
    public String getPkid(){
        return pkid;
    }
    /**
     * 设置：接收人姓名
     */
    public void setReceiverName(String receiverName){
        this.receiverName = receiverName;
    }
    /**
     * 获取：接收人姓名
     */
    public String getReceiverName(){
        return receiverName;
    }
    /**
     * 设置：手机号
     */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /**
     * 获取：手机号
     */
    public String getPhone(){
        return phone;
    }
    /**
     * 设置：邮件地址
     */
    public void setEmail(String email){
        this.email = email;
    }
    /**
     * 获取：邮件地址
     */
    public String getEmail(){
        return email;
    }
    /**
     * 设置：状态
     */
    public void setValidFlag(String validFlag){
        this.validFlag = validFlag;
    }
    /**
     * 获取：状态
     */
    public String getValidFlag(){
        return validFlag;
    }
    /**
     * 设置：备注
     */
    public void setRemark(String remark){
        this.remark = remark;
    }
    /**
     * 获取：备注
     */
    public String getRemark(){
        return remark;
    }
    /**
     * 设置：扩展字段1
     */
    public void setExtend1(String extend1){
        this.extend1 = extend1;
    }
    /**
     * 获取：扩展字段1
     */
    public String getExtend1(){
        return extend1;
    }
    /**
     * 设置：扩展字段2
     */
    public void setExtend2(String extend2){
        this.extend2 = extend2;
    }
    /**
     * 获取：扩展字段2
     */
    public String getExtend2(){
        return extend2;
    }
    /**
     * 设置：扩展字段3
     */
    public void setExtend3(String extend3){
        this.extend3 = extend3;
    }
    /**
     * 获取：扩展字段3
     */
    public String getExtend3(){
        return extend3;
    }
    /**
     * 设置：扩展字段4
     */
    public void setExtend4(String extend4){
        this.extend4 = extend4;
    }
    /**
     * 获取：扩展字段4
     */
    public String getExtend4(){
        return extend4;
    }
    /**
     * 设置：扩展字段5
     */
    public void setExtend5(String extend5){
        this.extend5 = extend5;
    }
    /**
     * 获取：扩展字段5
     */
    public String getExtend5(){
        return extend5;
    }

    public String getCreateUserName(){
        return createUserName;
    }

    public void setCreateUserName(String createUserName){
        this.createUserName=createUserName;
    }

    public String getUpdateUserName(){
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName){
        this.updateUserName=updateUserName;
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("AlarmReceiverInfo[");
        builder.append(" 主键 [ pkid ] = ");
        builder.append( pkid );
        builder.append(" 接收人姓名 [ receiverName ] = ");
        builder.append( receiverName );
        builder.append(" 手机号 [ phone ] = ");
        builder.append( phone );
        builder.append(" 邮件地址 [ email ] = ");
        builder.append( email );
        builder.append(" 状态 [ validFlag ] = ");
        builder.append( validFlag );
        builder.append(" 备注 [ remark ] = ");
        builder.append( remark );
        builder.append(" 扩展字段1 [ extend1 ] = ");
        builder.append( extend1 );
        builder.append(" 扩展字段2 [ extend2 ] = ");
        builder.append( extend2 );
        builder.append(" 扩展字段3 [ extend3 ] = ");
        builder.append( extend3 );
        builder.append(" 扩展字段4 [ extend4 ] = ");
        builder.append( extend4 );
        builder.append(" 扩展字段5 [ extend5 ] = ");
        builder.append( extend5 );
        builder.append("]");
        return builder.toString();
    }
}