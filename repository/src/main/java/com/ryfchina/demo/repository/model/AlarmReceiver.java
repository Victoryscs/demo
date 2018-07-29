package com.ryfchina.demo.repository.model;
import java.io.Serializable;


/**
 * 预警信息接收人
 *
 * @author baolu
 * @email baolu@medicalunion.cn
 * @createTime 2017-09-16 12:04:06
 * @since JDK 1.8
 */
public class AlarmReceiver implements Serializable{

    private static final long serialVersionUID=1454657565L;

    //主键
    private String pkid;
    //模板编号
    private String templateId;
    //接收人ID
    private String receiverId;
    //发送类型0、短信，1、邮件，2、短信+邮件
    private String sendType;
    //扩展字段1
    private String extend1;
    //扩展字段2
    private String extend2;
    //扩展字段
    private String extend3;
    //扩展字段4
    private String extend4;
    //扩展字段5
    private String extend5;

    //模板名称
    private String templateName;

    //接收人名称
    private String receiverName;
    //手机号
    private String phone;
    //邮箱
    private String email;
    //模板状态
    private String status;



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
     * 设置：模板编号
     */
    public void setTemplateId(String templateId){
        this.templateId = templateId;
        }
    /**
     * 获取：模板编号
     */
    public String getTemplateId(){
        return templateId;
        }
    /**
     * 设置：接收人ID
     */
    public void setReceiverId(String receiverId){
        this.receiverId = receiverId;
        }
    /**
     * 获取：接收人ID
     */
    public String getReceiverId(){
        return receiverId;
        }
    /**
     * 设置：发送类型0、短信，1、邮件，2、短信+邮件
     */
    public void setSendType(String sendType){
        this.sendType = sendType;
        }
    /**
     * 获取：发送类型0、短信，1、邮件，2、短信+邮件
     */
    public String getSendType(){
        return sendType;
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
     * 设置：扩展字段
     */
    public void setExtend3(String extend3){
        this.extend3 = extend3;
        }
    /**
     * 获取：扩展字段
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

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        builder.append("AlarmReceiver[");
                builder.append(" 主键 [ pkid ] = ");
            builder.append( pkid );
                builder.append(" 模板编号 [ templateId ] = ");
            builder.append( templateId );
                builder.append(" 接收人ID [ receiverId ] = ");
            builder.append( receiverId );
                builder.append(" 发送类型0、短信，1、邮件，2、短信+邮件 [ sendType ] = ");
            builder.append( sendType );
                builder.append(" 扩展字段1 [ extend1 ] = ");
            builder.append( extend1 );
                builder.append(" 扩展字段2 [ extend2 ] = ");
            builder.append( extend2 );
                builder.append(" 扩展字段 [ extend3 ] = ");
            builder.append( extend3 );
                builder.append(" 扩展字段4 [ extend4 ] = ");
            builder.append( extend4 );
                builder.append(" 扩展字段5 [ extend5 ] = ");
            builder.append( extend5 );
            builder.append("]");
        return builder.toString();
        }
        }