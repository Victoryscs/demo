package com.ryfchina.demo.common.constant;

/**
 * LcswConstant
 * 
 * @description:
 * @author renjun
 * @create 2017/7/7 16:00
 * @since JDK 1.7
 * @version 1.0
 */
@SuppressWarnings("all")
public interface LcswConstant {

	/**
	 * 子支付渠道类型
	 *
	 **/
	public static interface ProviderSub {
		/**
		 * 微信扫码支付
		 */
		String WECHAT_QR = "010";

		/**
		 * 支付宝扫码
		 */
		String ALIPAY_QR = "020";

	}

	/**
	 * 交易状态
	 */
	public static interface TradeState {
		/**
		 * 支付成功
		 */
		String SUCCESS = "SUCCESS";

		/**
		 * 退款成功/转入退款
		 */
		String REFUND = "REFUND";

		/**
		 * 未支付
		 */
		String NOTPAY = "NOTPAY";

		/**
		 * 已关闭
		 */
		String CLOSED = "CLOSED";

		/**
		 * 支付中
		 */
		String USERPAYING = "USERPAYING";

		/**
		 * 已撤销
		 */
		String REVOKED = "REVOKED";

		/**
		 * 未支付/支付超时
		 */
		String NOPAY = "NOPAY";

		/**
		 * 支付失败
		 */
		String PAYERROR = "PAYERROR";

	}

}
