package com.ryfchina.demo.common.kit;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * 数字/金额 工具处理类
 */
public class NumberKit {

    // 默认除法运算精度
    private static final int DEF_DIV_SCALE = 2;

    // 这个类不能实例化
    private NumberKit() {

    }

    /**
     * 提供精确的加法运算
     *
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算
     *
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算 将金额元转换为分，去掉小数位
     *
     * @param v1 金额元
     * @return 金额分
     */
    public static Long mul(double v1) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(100));
        return b1.multiply(b2).longValue();
    }

    /**
     * 提供精确的乘法运算 将金额元转换为分，去掉小数位
     *
     * @param amount 金额元
     * @return 金额分
     */
    public static Long mul(String amount) {
        if (StringUtils.isBlank(amount)) {
            return 0L;
        }
        BigDecimal b1 = new BigDecimal(amount);
        BigDecimal b2 = new BigDecimal(Double.toString(100));
        return b1.multiply(b2).longValue();
    }

    /**
     * 提供精确的乘法运算 将金额转换为分，去掉小数位
     *
     * @param amount    金额元
     * @param mulNumber
     * @return 金额分
     */
    public static Long mul(String amount, int mulNumber) {
        if (StringUtils.isBlank(amount)) {
            return 0L;
        }
        BigDecimal b1 = new BigDecimal(amount);
        BigDecimal b2 = new BigDecimal(Double.toString(mulNumber));
        return b1.multiply(b2).longValue();
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后10位，以后的数字四舍五入
     *
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static Double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero" );
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 提供精确的小数位四舍五入处理。
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero" );
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1" );
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 将分转换为元，再格式化为字符串 防止出现科学计数法
     *
     * @param amount 金额
     * @return 金额
     */
    public static String fenToYuan(Long amount) {
        if (amount == null) {
            return "";
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setGroupingUsed(false);
        BigDecimal b1 = new BigDecimal(Long.toString(amount));
        BigDecimal b2 = new BigDecimal(Long.toString(100));
        Double d = b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
        return numberFormat.format(d);
    }

    /**
     * 将分转换为元，再格式化为字符串 防止出现科学计数法
     *
     * @param amount 金额
     * @return 金额
     */
    public static String fenToYuan(Object amount) {
        if (amount == null) {
            return "";
        }
        Long amt = Long.valueOf(String.valueOf(amount));
        return fenToYuan(amt);
    }

    /**
     * 将元转换为分
     *
     * @param amount
     * @return
     */
    public static Long yuanToFen(String amount) {
        if (StringUtils.isBlank(amount)) {
            return 0L;
        }
        BigDecimal b1 = new BigDecimal(amount);
        BigDecimal b2 = new BigDecimal(Double.toString(100));
        return b1.multiply(b2).longValue();
    }

}
