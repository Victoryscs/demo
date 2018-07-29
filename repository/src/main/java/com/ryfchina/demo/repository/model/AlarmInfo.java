package com.ryfchina.demo.repository.model;


import java.io.Serializable;
import java.util.Date;

/**
* 预警信息
*
* @author baolu
* @email baolu@medicalunion.cn
* @createTime 2017-09-15 17:47:46
* @since JDK 1.8
*/
public class AlarmInfo implements Serializable {

   private static final long serialVersionUID=1454657565L;

   //主键
   private String pkid;
   //预警类型模板ID（对应ALARM_TEMPLATE的PKID）
   private String templateId;
   //接收人手机号
   private String phone;
   //短息内容
   private String smsContent;
   //接收人邮件地址
   private String email;
   //邮件详情
   private String emailContent;
   //异常信息状态0、待处理，1、已处理，2、暂停，3、已关闭
   private String status;
   //预警产生时间
   private Date createTime;
   //接收到的参数内容
   private String params;
   //预警接收人
   private String receiver;
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
    * 设置：预警类型模板ID（对应ALARM_TEMPLATE的PKID）
    */
   public void setTemplateId(String templateId){
       this.templateId = templateId;
   }
   /**
    * 获取：预警类型模板ID（对应ALARM_TEMPLATE的PKID）
    */
   public String getTemplateId(){
       return templateId;
   }
   /**
    * 设置：接收人手机号
    */
   public void setPhone(String phone){
       this.phone = phone;
   }
   /**
    * 获取：接收人手机号
    */
   public String getPhone(){
       return phone;
   }
   /**
    * 设置：短息内容
    */
   public void setSmsContent(String smsContent){
       this.smsContent = smsContent;
   }
   /**
    * 获取：短息内容
    */
   public String getSmsContent(){
       return smsContent;
   }
   /**
    * 设置：接收人邮件地址
    */
   public void setEmail(String email){
       this.email = email;
   }
   /**
    * 获取：接收人邮件地址
    */
   public String getEmail(){
       return email;
   }
   /**
    * 设置：邮件详情
    */
   public void setEmailContent(String emailContent){
       this.emailContent = emailContent;
   }
   /**
    * 获取：邮件详情
    */
   public String getEmailContent(){
       return emailContent;
   }
   /**
    * 设置：异常信息状态0、待处理，1、已处理，2、暂停，3、已关闭
    */
   public void setStatus(String status){
       this.status = status;
   }
   /**
    * 获取：异常信息状态0、待处理，1、已处理，2、暂停，3、已关闭
    */
   public String getStatus(){
       return status;
   }
   /**
    * 设置：预警产生时间
    */
   public void setCreateTime(Date createTime){
       this.createTime = createTime;
   }
   /**
    * 获取：预警产生时间
    */
   public Date getCreateTime(){
       return createTime;
   }
   /**
    * 设置：接收到的参数内容
    */
   public void setParams(String params){
       this.params = params;
   }
   /**
    * 获取：接收到的参数内容
    */
   public String getParams(){
       return params;
   }
   /**
    * 设置：预警接收人
    */
   public void setReceiver(String receiver){
       this.receiver = receiver;
   }
   /**
    * 获取：预警接收人
    */
   public String getReceiver(){
       return receiver;
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
       builder.append("[");
       builder.append(" 主键 [ pkid ] = ");
       builder.append( pkid );
       builder.append(" 预警类型模板ID（对应ALARM_TEMPLATE的PKID） [ templateId ] = ");
       builder.append( templateId );
       builder.append(" 接收人手机号 [ phone ] = ");
       builder.append( phone );
       builder.append(" 短息内容 [ smsContent ] = ");
       builder.append( smsContent );
       builder.append(" 接收人邮件地址 [ email ] = ");
       builder.append( email );
       builder.append(" 邮件详情 [ emailContent ] = ");
       builder.append( emailContent );
       builder.append(" 异常信息状态0、待处理，1、已处理，2、暂停，3、已关闭 [ status ] = ");
       builder.append( status );
       builder.append(" 预警产生时间 [ createTime ] = ");
       builder.append( createTime );
       builder.append(" 接收到的参数内容 [ params ] = ");
       builder.append( params );
       builder.append(" 预警接收人 [ receiver ] = ");
       builder.append( receiver );
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




