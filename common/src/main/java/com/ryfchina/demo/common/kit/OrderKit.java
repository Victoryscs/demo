package com.ryfchina.demo.common.kit;


import com.ryfchina.demo.common.constant.C;

/**
 * ChannelUtil 转换各支付渠道个性化的参数
 *
 * @author renjun
 * @version 1.0
 * @description:
 * @create 2017/7/10 17:00
 * @since JDK 1.7
 */
public class OrderKit {
    /**
     * 根据二维码授权码判断支付通道类型
     *
     * @param authNo
     * @return
     */
    public static String getProviderSubFromAuthNo(String authNo) {
        String payType = null;
        switch (authNo.substring(0, 2)) {
            // 微信
            case "10":
                payType = C.ProviderSub.WECHAT_QR;
                break;
            // 微信
            case "11":
                payType = C.ProviderSub.WECHAT_QR;
                break;
            // 微信
            case "12":
                payType = C.ProviderSub.WECHAT_QR;
                break;
            // 微信
            case "13":
                payType = C.ProviderSub.WECHAT_QR;
                break;
            // 微信
            case "14":
                payType = C.ProviderSub.WECHAT_QR;
                break;
            // 微信
            case "15":
                payType = C.ProviderSub.WECHAT_QR;
                break;
            case "25":// 支付宝
                payType = C.ProviderSub.ALIPAY_QR;
                break;
            case "26":// 支付宝
                payType = C.ProviderSub.ALIPAY_QR;
                break;
            case "27":// 支付宝
                payType = C.ProviderSub.ALIPAY_QR;
                break;
            case "28":// 支付宝
                payType = C.ProviderSub.ALIPAY_QR;
                break;
            case "29":// 支付宝
                payType = C.ProviderSub.ALIPAY_QR;
                break;
            case "30":// 支付宝
                payType = C.ProviderSub.ALIPAY_QR;
                break;

            // case "91":// qq钱包
            // payType = C.lcswPayType.QQ;
            // break;
            // case "62":// 京东钱包、银联均为62开头，不能区分
            // payType = "080";
            // break;
        }
        return payType;
    }

    /**
     * 根据交易来源以及终端ID生成订单前缀
     *
     * @param source
     * @param terminalId
     * @return
     */
    public static String getOrderPre(String source, String terminalId) {
        String pre = "";
        if (C.TradeSource.SELFMACHINE.equals(source)) {
            pre = terminalId;
        } else if (C.TradeSource.COUNTER.equals(source)) {
            pre = "CK";
        }
        return pre;
    }
}
