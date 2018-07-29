package com.ryfchina.demo.repository.model;
import java.io.Serializable;


/**
 * 预警模板信息
 *
 * @author renjun
 * @email baolu@medicalunion.cn
 * @createTime 2017-09-15 20:22:42
 * @since JDK 1.8
 */
public class AlarmTemplate implements Serializable{

    private static final long serialVersionUID=1454657565L;

    //主键，模板id
    private String pkid;
    //模板名称
    private String templateName;
    //状态(0、停用，1、启)
    private String validFlag;
    //预警类型(0、运营，1、研发)
    private String alarmType;
    //短信模板
    private String smsContent;
    //邮件模板标题
    private String emailSubject;
    //邮件模板板内容
    private String emailContent;
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



    /**
     * 设置：主键，模板id
     */
    public void setPkid(String pkid){
        this.pkid = pkid;
        }
    /**
     * 获取：主键，模板id
     */
    public String getPkid(){
        return pkid;
        }
    /**
     * 设置：模板名称
     */
    public void setTemplateName(String templateName){
        this.templateName = templateName;
        }
    /**
     * 获取：模板名称
     */
    public String getTemplateName(){
        return templateName;
        }
    /**
     * 设置：状态(0、停用，1、启)
     */
    public void setValidFlag(String validFlag){
        this.validFlag = validFlag;
        }
    /**
     * 获取：状态(0、停用，1、启)
     */
    public String getValidFlag(){
        return validFlag;
        }
    /**
     * 设置：预警类型(0、运营，1、研发)
     */
    public void setAlarmType(String alarmType){
        this.alarmType = alarmType;
        }
    /**
     * 获取：预警类型(0、运营，1、研发)
     */
    public String getAlarmType(){
        return alarmType;
        }
    /**
     * 设置：短信模板
     */
    public void setSmsContent(String smsContent){
        this.smsContent = smsContent;
        }
    /**
     * 获取：短信模板
     */
    public String getSmsContent(){
        return smsContent;
        }
    /**
     * 设置：邮件模板标题
     */
    public void setEmailSubject(String emailSubject){
        this.emailSubject = emailSubject;
        }
    /**
     * 获取：邮件模板标题
     */
    public String getEmailSubject(){
        return emailSubject;
        }
    /**
     * 设置：邮件模板板内容
     */
    public void setEmailContent(String emailContent){
        this.emailContent = emailContent;
        }
    /**
     * 获取：邮件模板板内容
     */
    public String getEmailContent(){
        return emailContent;
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


    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("TAlarmTemplate[");
                builder.append(" 主键，模板id [ pkid ] = ");
            builder.append( pkid );
                builder.append(" 模板名称 [ templateName ] = ");
            builder.append( templateName );
                builder.append(" 状态(0、停用，1、启) [ validFlag ] = ");
            builder.append( validFlag );
                builder.append(" 预警类型(0、运营，1、研发) [ alarmType ] = ");
            builder.append( alarmType );
                builder.append(" 短信模板 [ smsContent ] = ");
            builder.append( smsContent );
                builder.append(" 邮件模板标题 [ emailSubject ] = ");
            builder.append( emailSubject );
                builder.append(" 邮件模板板内容 [ emailContent ] = ");
            builder.append( emailContent );
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