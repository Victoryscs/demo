package com.ryfchina.demo.common.kit;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class DateKit {

    public static final String AM_PM = "a";

    public static final String DAY_IN_MONTH = "dd";

    public static final String DAY_IN_YEAR = "DD";

    public static final String DAY_OF_WEEK = "EEEE";

    public static final int DIFF_DAY = 5;

    public static final int DIFF_HOUR = 11;

    public static final int DIFF_MILLSECOND = 14;

    public static final int DIFF_MINUTE = 12;

    public static final int DIFF_MONTH = 2;

    public static final int DIFF_SECOND = 13;

    public static final int DIFF_WEEK = 4;

    public static final int DIFF_YEAR = 1;

    public static final String HOUR_IN_APM = "KK";

    public static final String HOUR_IN_DAY = "HH";

    public static final String HOUR_OF_APM = "hh";

    public static final String HOUR_OF_DAY = "kk";

    public static final String LONG_YEAR = "yyyy";

    public static final String MILL_SECOND = "SSS";

    public static final String MINUTE = "mm";

    public static final String MONTH = "MM";

    public static final String SECOND = "ss";

    public static final String SHORT_YEAR = "yy";

    public static final String WEEK_IN_MONTH = "W";

    public static final String WEEK_IN_YEAR = "ww";

    public static final String yyyy_MM_dd = "yyyy-MM-dd";

    public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";

    public static final String yyyyMMdd = "yyyyMMdd";

    public static final String yyyyMMddHHmmssSSS = "yyyyMMddHHmmssSSS";

    public static final String yyyy_MM = "yyyy-MM";

    public static final String yyyy_MM_dd_HHmmss = "yyyy-MM-dd HH:mm:ss";

    public static final String yyyy_MM_dd_HHmmssSSS = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final String yyyyMMdd_HHmmss = "yyyyMMdd hh:mm:ss";

    public static final String HH_mm_ss = "HHmmss";

    public DateKit() {
    }

    public static String getCurDateString() {
        return getDateString(new Date(), yyyyMMddHHmmssSSS);
    }

    public static String getCurrentDateString() {
        return getCurrentDateString("yyyy-MM-dd HH:mm:ss");
    }

    public static String getCurrentDateString(String formatString) {
        Date currentDate = new Date();
        return getDateString(currentDate, formatString);
    }

    public static String getCurrentDate(Date currentDate, String formatString) {
        return getDateString(currentDate, formatString);
    }

    public static Date getDateFormat(Date date) {
        return getDateFromString(getDateString(date, "yyyy-MM-dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss");
    }

    public static int getCurrentDayOfWeek() {
        return getDayOfWeek(new Date());
    }

    public static Date getDate(Date date) {
        return getDateFromString(getDateString(date, "yyyy-MM-dd"), "yyyy-MM-dd");
    }

    public static Date getDateFromString(String dateString) throws RuntimeException {
        return getDateFromString(dateString, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * String类型日期格式化为date
     */
    public static Date getDateFromString(String dateString, String pattern) throws RuntimeException {
        if (StringUtils.isEmpty(dateString)) {
            return null;
        }
        Date date = null;
        try {
            date = DateUtils.parseDate(dateString, pattern);
        } catch (ParseException e) {
            throw new RuntimeException((new StringBuilder("parse date string '")).append(dateString)
                    .append("' with pattern '").append(pattern).append("' failed: ").append(e.getMessage()).toString());
        }
        return date;
    }

    public static String getDateStringFromCst(String dateString, String formatString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
        Date date = sdf.parse(dateString);
        return DateKit.getDateString(date, formatString);
    }

    /**
     * 得到date的前N天,N为正数则为后几天,负数为前几天
     *
     * @param date
     * @return
     */
    public static Date getIntDay(Date date, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, num);
        date = calendar.getTime();
        return date;
    }

    public static String getDateString(Date date) {
        return getDateString(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getDateStringByFormat(Date date, String pattern) {
        return getDateString(date, pattern);
    }

    public static String getDateStringByFormat(String dateString, String pattern, String pattern1) {
        Date date = DateKit.getDateFromString(dateString, pattern);
        return getDateString(date, pattern1);
    }

    public static String getDateString(Date date, String formatString) {
        return getDateString(date, formatString, Locale.PRC);
    }

    public static String getDateString(Date date, String formatString, Locale locale) {
        if (date == null) {
            return null;
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat(formatString, locale);
            return dateFormat.format(date);
        }
    }

    public static int getDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(7);
    }

    public static int getDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public static int getDaysOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(5);
    }

    public static Date getRelativeDate(Date date, int type, int relate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(type, relate);
        return calendar.getTime();
    }

    public static Date getRelativeDate(int type, int relate) {
        Date current = new Date();
        return getRelativeDate(current, type, relate);
    }

    public static boolean compareElapsedTime(Date destDate, Date sourceDate, int type, int elapse)
            throws RuntimeException {
        if (destDate == null || sourceDate == null)
            throw new RuntimeException("compared date invalid");
        return destDate.getTime() > getRelativeDate(sourceDate, type, elapse).getTime();
    }

    /**
     * 操作STRING类型的时间
     *
     * @param DAY    yyyy-MM-dd
     * @param type   DIFF_*
     * @param relate 天数
     * @return yyyy-MM-dd
     */
    public static String getRelativeStringDate(String DAY, int type, int relate) {
        return DateKit.getDateString(
                DateKit.getRelativeDate(DateKit.getDateFromString(DAY, DateKit.yyyy_MM_dd), type, relate),
                DateKit.yyyy_MM_dd);
    }

    public static String getRelativeDateString(int type, int relate, String formatString) {
        return getDateString(getRelativeDate(type, relate), formatString);
    }

    public static String getTimestampString(Date date) {
        return getDateString(date, "yyyyMMddHHmmssSSS");
    }

    public static int getToday() {
        return Integer.parseInt(getCurrentDateString("dd"));
    }

    public static long getTimeDiff(Date fromDate, Date toDate, int type) {
        fromDate = fromDate != null ? fromDate : new Date();
        toDate = toDate != null ? toDate : new Date();
        long diff = toDate.getTime() - fromDate.getTime();
        switch (type) {
            case 13: // '\r'
                diff /= 1000L;
                break;

            case 12: // '\f'
                diff /= 60000L;
                break;

            case 11: // '\013'
                diff /= 0x36ee80L;
                break;

            case 5: // '\005'
                diff /= 0x5265c00L;
                break;

            case 2: // '\002'
                diff /= 0xffffffff9a7ec800L;
                break;

            case 1: // '\001'
                diff /= 0x57b12c00L;
                break;

            case 3: // '\003'
            case 4: // '\004'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            default:
                diff = 0L;
                break;

            case 14: // '\016'
                break;
        }
        return diff;
    }

    public static boolean isTimestampEqual(Date arg0, Date arg1) {
        return getTimestampString(arg0).compareTo(getTimestampString(arg1)) == 0;
    }

    /**
     * 设置起始时间，在params中显示，开始时间key为start，结束时间key为end，start和end皆为Date格式。
     * <p>
     * 如传入：pointH=0，pointM=0，pointS=0，interval=0，date为2013年5月13日（时分秒忽略）。
     * 则params的值：start为2013年5月12日00点00分00秒，end为2013年5月13日00点00分00秒
     * </p>
     * <p>
     * 如传入：pointH=23，pointM=30，pointS=30，interval=1，date为2013年5月13日（时分秒忽略）。
     * 则params的值：start为2013年5月10日23点30分30秒，end为2013年5月12日23点30分30秒
     * </p>
     *
     * @param params   参数
     * @param pointH   日切点：时（0~23）
     * @param pointM   日切点：分（0~59）
     * @param pointS   日切点：秒（0~59）
     * @param interval 所需要设置的开始时间和结束时间之间的间隔天数，默认为0（大于等于0）
     * @param date     日期，默认当前日期
     * @author wushiju
     * @date 2013-5-13
     */
    @SuppressWarnings("unchecked")
    public static void setParam(Map params, int pointH, int pointM, int pointS, int interval, Date date) {
        if (params == null) {
            return;
        }
        if (pointH < 0 || pointM < 0 || pointS < 0 || interval < 0 || pointH > 23 || pointM > 59 || pointS > 59) {
            return;
        }
        date = date == null ? new Date() : date;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, pointH);
        cal.set(Calendar.MINUTE, pointM);
        cal.set(Calendar.SECOND, pointS);
        if (pointH == 0) {
            params.put("end", cal.getTime());
            cal.add(Calendar.DAY_OF_MONTH, -1 - interval);
            params.put("start", cal.getTime());
        } else {
            cal.add(Calendar.DAY_OF_MONTH, -1);
            params.put("end", cal.getTime());
            cal.add(Calendar.DAY_OF_MONTH, -1 - interval);
            params.put("start", cal.getTime());
        }
    }

    // 把yyyymmdd转成yyyy-MM-dd格式
    public static String formatDate(String str) {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
        String sfstr = "";
        try {
            sfstr = sf2.format(sf1.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sfstr;
    }

    // 把yyyy-MM-dd转成格式yyyymmdd
    public static String formatDate2(String str) {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyyMMdd");
        String sfstr = "";
        try {
            sfstr = sf2.format(sf1.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sfstr;
    }

    // 把yyyymmdd转成date类型
    public static Date yyMMddToDate(String str) {
        if (StringUtils.isEmpty(str))
            return null;
        str = formatDate(str);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = formatter.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取时间timestamp
     *
     * @return
     * @throws ParseException
     */
    public static Timestamp getTimeswap(String timeswap) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = sdf.parse(timeswap);
        return new Timestamp(date.getTime());
    }

	/*
     * public static void main(String[] args) { System.out.println("ceshi:" + getDateFromString("2017-09-25 16:07:25"));
	 * }
	 */

    public static Date getBeginDate(String reconDate) {
        return DateKit.getDateFromString(reconDate + " 00:00:00", "yyyy-MM-dd HH:mm:ss");
    }

    public static Date getEndDate(String reconDate) {
        /*
         * Date beginDate = getBeginDate(reconDate); Calendar c = Calendar.getInstance(); c.setTime(beginDate);
		 * c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天 Date tomorrow = c.getTime(); String endDate =
		 * DateKit.getDateString(tomorrow);
		 */
        return DateKit.getDateFromString(reconDate + " 23:59:59", "yyyy-MM-dd HH:mm:ss");
    }
}
