package com.ryfchina.demo.common.constant;

/**
 * 全局常量
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/29 16:23
 * @since JDK 1.8
 */
@SuppressWarnings("all")
public interface C {
    /**
     * 超级管理员
     */
    public static final String SUPER_ADMIN = "1";

    public static final String LOGIN_USER_KEY = "LOGIN_USER_KEY";

    /**
     * 英文逗号(,)
     */
    public static final String ID_SPLIT = ",";

    /**
     * 菜单类型wa
     */
    public static interface MenuType {
        /**
         * 目录
         */
        String CATALOG = "0";

        /**
         * 菜单
         */
        String MENU = "1";

        /**
         * 按钮
         */
        String BUTTON = "2";
    }

    /**
     * 菜单状态(展开/折叠)
     */
    public static interface MenuState {
        /**
         * 折叠
         */
        String CLOSED = "0";

        /**
         * 展开OPENED
         */
        String OPENED = "1";

    }

    public static interface UserStatus {
        /**
         * 锁定
         */
        String LOCK = "0";
        /**
         * 正常
         */
        String NORMAL = "1";
        /**
         * 销户
         */
        String RELEASE = "2";
    }

    public static interface SystemType {
        /**
         * 平台
         */
        String PLATFORM_USER = "1";
        /**
         * 机构
         */
        String ORG_USER = "2";
    }

    /**
     * 定时任务状态
     */
    public static interface ScheduleStatus {
        /**
         * 正常
         */
        int NORMAL = 0;

        /**
         * 暂停
         */
        int PAUSE = 1;

    }

    /**
     * R 返回的code
     */
    public static interface Code {
        /**
         * 默认值
         */
        int SUCCESS = 0;

        /**
         * 参数错误
         */
        int PARAM_ERROR = 22;

        /**
         * 服务器内部异常
         */
        int INTERNAL_SERVER_ERROR = 500;

        /**
         * 未授权
         */
        int UNAUTHORIZED = 401;

    }

    /**
     * R 返回的msg
     */
    public static interface Message {
        /**
         * 默认值
         */
        String SUCCESS = "成功";

        /**
         * 参数错误
         */
        String PARAM_ERROR = "参数错误";

        /**
         * 服务器内部异常
         */
        String INTERNAL_SERVER_ERROR = "服务器内部异常";

        /**
         * 未授权
         */
        String UNAUTHORIZED = "未授权";

    }

    /**
     * 报文的key
     */
    public static interface Action {
        /**
         * 返回报文响应码
         */
        public static final String CODE = "code";

        /**
         * 返回报文响应信息
         */
        public static final String MSG = "msg";

        /**
         * 返回报文的签名
         */
        public static final String SIGN = "sign";

        /**
         * 报文的请头
         */
        public static final String BUSI_CODE = "busiCode";

        /**
         * 返回报文的业务数据
         */
        public static final String BUSI_DATA = "busiData";


    }

    /**
     * 编码
     */
    public static interface Charset {
        /**
         * UTF-8编码
         */
        String UTF8 = "UTF-8";
        /**
         * GBK编码
         */
        String GBK = "GBK";

    }

    /**
     * 内容类型
     */
    public static interface ContentType {
        /**
         * JSON内容
         */
        String JSON = "application/json";
        /**
         * FORM内容
         */
        String FORM = "application/x-www-form-urlencoded";

    }

    /**
     * 通用的是和否
     */
    public static interface YesOrNo {
        /**
         * 是
         */
        String YES = "1";

        /**
         * 否
         */
        String NO = "2";
    }

    /**
     * 报文返回格式
     */
    public static interface Format {
        /**
         * JSON格式
         */
        String JSON = "json";
        /**
         *
         */
        String XML = "xml";
    }

    /**
     * 加密方式
     */
    public static interface SignType {
        /**
         * RSA
         */
        String RSA = "RSA";
        /**
         * RSA2
         */
        String RSA2 = "RSA2";

        /**
         * MD5
         */
        String MD5 = "MD5";
    }

    /**
     * 渠道商类型
     **/
    public static interface Provider {

        /**
         * 支付宝
         */
        String ALIPAY = "1";

        /**
         * 银联
         */
        String UNIONPAY = "2";

        /**
         * 微信
         */
        String WECHAT = "3";

        /**
         * 通联支付
         */
        String ALL_IN_PAY = "4";

        /**
         * 扫呗
         */
        String LCSW = "5";
        /**
         * 快钱
         */
        String QUICK = "6";
        /**
         * 银行卡刷卡
         */
        String BANK_CARD = "7";
    }

    /**
     * 支付宝支付常量
     **/
    public static interface AlipayProvider {
        /**
         * 超时时间 可空
         */
        String TIMEOUT_EXPRESS = "2m";

        /**
         * 销售产品码 必填
         */
        String PRODUCT_CODE = "QUICK_WAP_PAY";

    }

    /**
     * 订单支付状态
     */
    public static interface OrderStatus {
        /**
         * 0、已过期/已关闭
         */
        String EXPIRED = "0";
        /**
         * 1、支付成功
         */
        String PAID_SUCCESS = "1";

        /**
         * 2、支付中
         */
        String PAYING = "2";

        /**
         * 3、支付失败
         */
        String PAID_FAIL = "3";

        /**
         * 4、退款成功
         */
        String REFUND_SUCCESS = "4";

        /**
         * 5、退款中
         */
        String REFUNDING = "5";

        /**
         * 6、退款失败
         */
        String REFUND_FAIL = "6";

        /**
         * 7、撤销成功
         */
        String CANCEL_SUCCESS = "7";

        /**
         * 8、撤销中
         */
        String CANCELING = "8";

        /**
         * 9、撤销失败
         */
        String CANCEL_FAIL = "9";

        /**
         * 10、退款审核中
         */
        String CHECKING = "10";

        /**
         * 11、运营审核拒绝
         */
        String REJECTION_OPERATION_AUDIT = "11";

        /**
         * 12、风控拒绝交易
         */
        String RISK_REFUSE = "12";
        /**
         * 13.退款异常
         */
        String CHANGE = "13";
        /**
         * 14.待财务审核
         */
        String PENDE_FINANCIAL_AUDIT = "14";
        /**
         * 15.财务审核拒绝
         */
        String REFUSE_FINANCIAL_AUDIT = "15";
        /**
         * 16.退款审核通过
         */
        String PASS = "16";

        /**
         * 17.未付款交易超时关闭，或支付完成后全额退款
         */
        String TRADE_CLOSED = "17";

        /**
         * 18.交易结束，不可退款
         */
        String TRADE_FINISHED = "18";

        /**
         * 19、支付订单转入退款流程中
         */
        String TO_REFUNDING = "19";
    }

    /**
     * 订单类型
     */
    public static interface OrderType {
        /**
         * 1、支付订单
         */
        String PAY = "1";

        /**
         * 2、退款订单
         */
        String REFUND = "2";

        /**
         * 3、撤销订单
         */
        String CANCEL = "3";

    }

    /**
     * 订单差异状态
     */
    public static interface OrderDiffStatus {

        /**
         * 1、平衡
         */
        String BALANCE = "1";

        /**
         * 2、长款
         */
        String LONG_TERM = "2";

        /**
         * 3、短款
         */
        String SHORT_TERM = "3";

        /**
         * 4、长款短款都有
         */
        String LONG_AND_SHORT_TERM = "4";
    }

    /**
     * 订单是否异常
     */
    public static interface NeedRefund {
        /**
         * 可能需要退款
         */
        String YES = "0";
        /**
         * 不需要退款
         */
        String NO = "1";
    }

    /**
     * PayQueryInfo 接口调用的返回码
     */
    public static interface ReturnDataCode {
        /**
         * 成功
         */
        String SUCCESS = "00";

        /**
         * 退款成功(仅扫呗使用)
         */
        String REFUND_SUCCESS = "01";

        /**
         * 未知交易业务码busiCode
         */
        String UNKOWN_BUSI_CODE = "02";

        /**
         * 失败
         */
        String FAIL = "11";

        /**
         * 系统异常
         */
        String EXCEPTION = "44";

        /**
         * 商户订单号不存在
         */
        String MERCHANT_ORDER_NO_NOT_EXIST = "12";

        /**
         * 商户订单号重复
         */
        String MERCHANT_ORDER_NO_REPEAT = "13";

        /**
         * 平台中没有该商户ID
         */
        String MERCHANT_ID_NOT_EXIST = "14";

        /**
         * 服务不可用
         */
        String BUSY = "22";

        /**
         * 授权权限不足
         */
        String PERMISSION_DENIED = "21";

        /**
         * 缺少必填参数
         */
        String MISSING_PARAMETER = "23";

        /**
         * 非法的参数
         */
        String INVALID_PARAMETER = "24";

        /**
         * 权限不足
         */
        String PERMISSION_NOT_ENOUGH = "25";

        /**
         * 未知错误
         */
        String UNKOWN = "99";

        /**
         * 接口无响应
         */
        String NO_RESPONSE = "77";

        /**
         * 卖家余额不足
         */
        String SELLER_BALANCE_NOT_ENOUGH = "40";

        /**
         * 退款金额超限/该笔订单已全额退款
         */
        String REFUND_AMT_NOT_EQUAL_TOTAL = "41";

        /**
         * 请求退款的交易被冻结
         */
        String REASON_TRADE_BEEN_FREEZEN = "42";

        /**
         * 交易不存在
         */
        String TRADE_NOT_EXIST = "43";

        /**
         * 交易已完结
         */
        String TRADE_HAS_FINISHED = "49";

        /**
         * 交易状态非法
         */
        String TRADE_STATUS_ERROR = "45";

        /**
         * 不一致的请求
         */
        String DISCORDANT_REPEAT_REQUEST = "46";

        /**
         * 退款金额无效
         */
        String REASON_TRADE_REFUND_FEE_ERR = "47";

        /**
         * 当前交易不允许退款
         */
        String TRADE_NOT_ALLOW_REFUND = "48";

        /**
         * 验签失败
         */
        String CHECK_SIGN_FAIL = "49";

        /**
         * 未获取到返回报文或返回http状态码非200
         */
        String GET_NONE_RETURN_MSG = "50";

        /**
         * 重复交易
         */
        String REPEAT_TRADE = "51";

        /**
         * 商户状态不正确
         */
        String MER_STATUS_ERROR = "52";

        /**
         * 交易金额超限
         */
        String OVER_AMOUNT = "53";

        /**
         * 与原交易信息不符
         */
        String INCONSISTENT_INFO = "54";

        /**
         * 输入的卡号无效，请确认后输入
         */
        String WRONG_CARD_NUMBER = "55";

        /**
         * 卡状态不正确
         */
        String CARD_STATUS_ERROR = "56";

        /**
         * 卡上的余额不足
         */
        String INSUFFICIENT_BALANCE = "57";

        /**
         * 输入的密码、有效期或CVN2有误，交易失败
         */
        String PASSWORD_ERROR = "58";

        /**
         * 持卡人身份信息或手机号输入不正确，验证失败
         */
        String IDENTITY_INFO_ERROR = "59";

        /**
         * 密码输入次数超限
         */
        String PASSWORD_COUNT_EXCEEDED = "60";

        /**
         * 报文格式错误
         */
        String FORMAT_ERROR = "61";

        /**
         * 查询通讯超时，请重新发起查询
         */
        String QUERY_AGAIN = "62";
        /**
         * 交易创建，等待买家付款
         */
        String PAYING = "63";

        /**
         * 未支付
         */
        String NOT_PAY = "64";

        /**
         * 交易超时
         */
        String OVER_TIME = "65";

        /**
         * 商户渠道状态不正确
         */
        String MER_PROVIDER_STATUS_ERROR = "66";

        /**
         * 报文RSA解密失败
         */
        String DATAGRAM_RSA_FAIL = "67";

        /**
         * 商户密钥状态不正常
         */
        String MER_SECRET_STATUS_ERROR = "68";

        /**
         * 违反风控规则，无法继续交易
         */
        String VIOLATE_RISK_RULE = "70";

        /**
         * 订单创建失败
         */
        String ORDER_CREATE_FAIL = "71";
    }

    /**
     * PayQueryInfo 交易状态返回码
     */
    public static interface TradeStatus {
        /**
         * 交易创建，等待买家付款
         */
        String WAIT_BUYER_PAY = "0001";

        /**
         * 未付款交易超时关闭，或支付完成后全额退款
         */
        String TRADE_CLOSED = "0002";

        /**
         * 交易支付成功
         */
        String TRADE_SUCCESS = "0000";

        /**
         * 交易结束，不可退款
         */
        String TRADE_FINISHED = "0003";

        /**
         * 渠道方异常，需重新发起
         */
        String TRADE_AGAIN = "0004";
    }

    /**
     * 支付宝接口调用返回码
     */
    public static interface AlipayCallCode {
        /**
         * 接口调用成功
         */
        String SUCCESS = "10000";

        /**
         * 服务不可用
         */
        String BUSY = "20000";

        /**
         * 授权权限不足
         */
        String PERMISSION_DENIED = "20001";

        /**
         * 缺少必选参数
         */
        String MISSING_PARAMETER = "40001";

        /**
         * 非法的参数
         */
        String INVALID_PARAMETER = "40002";

        /**
         * 业务处理失败
         */
        String FAIL = "40004";

        /**
         * 权限不足
         */
        String PERMISSION_NOT_ENOUGH = "40006";

        /**
         * 未知错误
         */
        String UNKOWN = "40007";
    }

    /**
     * 支付宝同步返回的业务错误码
     */
    public static interface AlipaySubCode {
        /**
         * 系统错误
         */
        String SYSTEM_ERROR = "ACQ.SYSTEM_ERROR";

        /**
         * 参数无效
         */
        String INVALID_PARAMETER = "ACQ.INVALID_PARAMETER";

        /**
         * 卖家余额不足
         */
        String SELLER_BALANCE_NOT_ENOUGH = "ACQ.SELLER_BALANCE_NOT_ENOUGH";

        /**
         * 退款金额超限
         */
        String REFUND_AMT_NOT_EQUAL_TOTAL = "ACQ.REFUND_AMT_NOT_EQUAL_TOTAL";

        /**
         * 请求退款的交易被冻结
         */
        String REASON_TRADE_BEEN_FREEZEN = "ACQ.REASON_TRADE_BEEN_FREEZEN";

        /**
         * 交易不存在
         */
        String TRADE_NOT_EXIST = "ACQ.TRADE_NOT_EXIST";

        /**
         * 交易已完结
         */
        String TRADE_HAS_FINISHED = "ACQ.TRADE_HAS_FINISHED";

        /**
         * 交易状态非法
         */
        String TRADE_STATUS_ERROR = "ACQ.TRADE_STATUS_ERROR";

        /**
         * 不一致的请求
         */
        String DISCORDANT_REPEAT_REQUEST = "ACQ.DISCORDANT_REPEAT_REQUEST";

        /**
         * 退款金额无效
         */
        String REASON_TRADE_REFUND_FEE_ERR = "ACQ.REASON_TRADE_REFUND_FEE_ERR";

        /**
         * 当前交易不允许退款
         */
        String TRADE_NOT_ALLOW_REFUND = "ACQ.TRADE_NOT_ALLOW_REFUND";
    }

    /**
     * 支付宝交易状态码
     */
    public static interface AlipayTradeStatus {
        /**
         * 交易创建，等待买家付款
         */
        String WAIT_BUYER_PAY = "WAIT_BUYER_PAY";

        /**
         * 未付款交易超时关闭，或支付完成后全额退款
         */
        String TRADE_CLOSED = "TRADE_CLOSED";

        /**
         * 交易支付成功
         */
        String TRADE_SUCCESS = "TRADE_SUCCESS";

        /**
         * 交易结束，不可退款
         */
        String TRADE_FINISHED = "TRADE_FINISHED";

    }

    /**
     * 银联接口调用返回码
     */
    public static interface UnionpayRespCode {
        /**
         * 接口调用成功
         */
        String SUCCESS = "00";

        /**
         * 带缺陷的成功
         */
        String DEFECT_SUCCESS = "A6";

        /**
         * 交易通讯超时，请发起查询交易
         */
        String TIME_OUT = "03";

        /**
         * 交易状态未明，请查询对账结果
         */
        String UNKNOW_STATUS = "04";

        /**
         * 交易已受理，请稍后查询交易结果
         */
        String QUERY_LATER = "05";

        /**
         * 系统繁忙，请稍后再试
         */
        String SYS_BUSY = "06";

        /**
         * 报文格式错误
         */
        String FORMAT_ERROR = "10";

        /**
         * 验证签名失败
         */
        String SIGN_ERROR = "11";

        /**
         * 重复交易
         */
        String REPEAT_TRADE = "12";

        /**
         * 报文交易要素缺失
         */
        String MISSING_PARAMETER = "13";

        /**
         * 商户状态不正确
         */
        String MER_STATUS_ERROR = "31";

        /**
         * 无此交易权限
         */
        String NO_AUTHORITY = "32";

        /**
         * 交易金额超限
         */
        String OVER_AMOUNT = "33";

        /**
         * 查无此交易
         */
        String TRADE_NOT_EXIST = "34";

        /**
         * 原交易不存在或状态不正确
         */
        String TRADE_STATUS_ERROR = "35";

        /**
         * 与原交易信息不符
         */
        String INCONSISTENT_INFO = "36";

        /**
         * 输入的卡号无效，请确认后输入
         */
        String WRONG_CARD_NUMBER = "61";

        /**
         * 卡状态不正确
         */
        String CARD_STATUS_ERROR = "63";

        /**
         * 卡上的余额不足
         */
        String INSUFFICIENT_BALANCE = "64";

        /**
         * 输入的密码、有效期或CVN2有误，交易失败
         */
        String PASSWORD_ERROR = "65";

        /**
         * 持卡人身份信息或手机号输入不正确，验证失败
         */
        String IDENTITY_INFO_ERROR = "66";

        /**
         * 密码输入次数超限
         */
        String PASSWORD_COUNT_EXCEEDED = "67";
    }

    /**
     * 收到支付宝异步通知后返回给支付宝的信息
     */
    public static interface AlipayNotifyRetrunCode {
        /**
         * 异步通知处理成功
         */
        String SUCCESS = "success";

        /**
         * 异步通知处理失败
         */
        String FAIL = "fail";

    }

    public static interface ActionKey {

        String ACTION_NAME = "actionName";
        String ACTION_INFO = "actionInfo";
        String ACTION_INVOKER = "actionInvoker";
        String ACTION_VERIFY_STRING = "verifyString";
        String RETURN_CODE = "resultCode";
        String RETURN_MESSAGE = "errorMsg";

        String ACTION_RETURN_CODE = "code";
        String ACTION_RETURN_MESSAGE = "msg";
    }

    /**
     * 商户的产品状态
     */
    public static interface MerchantProductStatus {
        /**
         * 停用
         */
        String STOP = "0";
        /**
         * 正常
         */
        String NORMAL = "1";

    }

    /**
     * 支付渠道状态
     */
    public static interface ProviderStatus {
        /**
         * 停用
         */
        String STOP = "0";
        /**
         * 正常
         */
        String NORMAL = "1";

    }

    /**
     * Controller中请求报文中的节点名称
     */
    public static interface ControllerNodeName {
        /**
         * 请求业务节点名称
         */
        String BUSINESS_CODE = "actionName";
        /**
         * 请求数据节点名称
         */
        String BUSINESS_DATA = "actionInfo";

    }

    /**
     * 通联接口业务状态码
     */
    public static interface allinpayBusiness {
        /**
         * 支付
         */
        String PAY = "ALLINPAY_PAY";
        /**
         * 撤销
         */
        String CANCEL = "ALLINPAY_CANCEL";
        /**
         * 退货
         */
        String REFUND = "ALLINPAY_REFUND";

    }

    /**
     * 子支付渠道类型
     **/
    public static interface ProviderSub {

        /**
         * 支付宝
         */
        String ALIPAY_ = "1";
        /**
         * 支付宝APP
         */
        String ALIPAY_APP = "2";
        /**
         * 支付宝扫码
         */
        String ALIPAY_QR = "3";
        /**
         * 支付宝当面付/刷卡支付
         */
        String ALIPAY_FACE_PAY = "4";

        /**
         * 银联WAP支付
         */
        String UNIONPAY_WAP = "5";

        /**
         * 银联APP支付
         */
        String UNIONPAY_APP = "6";

        /**
         * 银联扫码支付
         */
        String UNIONPAY_QR = "7";

        /**
         * 微信APP
         */
        String WECHAT_APP = "9";
        /**
         * 微信扫码支付
         */
        String WECHAT_QR = "10";
        /**
         * 微信H5
         */
        String WECHAT_H5 = "11";
        /**
         * 微信公众号支付
         */
        String WECHAT_JS = "12";

        /**
         * 微信刷卡支付
         */
        String WECHAT_SWIPE = "13";

        /**
         * QQ钱包
         */
        String QQ_PAY = "15";

        /**
         * 建行二维码支付
         */
        String CCB_QR = "16";

        /**
         * 银行卡消费
         */
        String BANK_CARD = "17";

        /**
         * 未知支付类型
         */
        String UNKOWN = "44";

    }

    /**
     * 通联交易类型transType
     */
    public static interface allinpayTransType {
        /**
         * 银行卡消费
         */
        String BANK_CARD = "银行卡消费";
        /**
         * 支付宝扫码
         */
        String ALIPAY_QR = "支付宝扫码";
        /**
         * 微信扫码
         */
        String WECHAT_QR = "微信扫码";
        /**
         * 银联扫码
         */
        String UNIONPAY_QR = "银联扫码";
    }

    /**
     * 通联输入方式enterMode
     */
    public static interface allinpayEnterMode {
        /**
         * 手工输入
         */
        String MANAUL = "1";
        /**
         * 刷卡
         */
        String SWIPE = "2";
        /**
         * 插卡
         */
        String INSERT = "3";
        /**
         * C卡回退
         */
        String FALLBACK = "4";
        /**
         * 预约支付
         */
        String SUBSCRIBE = "5";

        /**
         * 非接快速支付
         */
        String QPBOC = "6";

        /**
         * 非接完整PBOC
         */
        String CLSS_PBOC = "7";

        /**
         * 非接读取CUPMobile
         */
        String MOBILE = "8";

        /**
         * 扫码支付
         */
        String QR = "9";
    }

    /**
     * 通联返回交易状态
     */
    public static interface allinpayTradeStatus {
        /**
         * 交易成功
         */
        String SUCCESS = "0000";
        /**
         * 交易超时
         */
        String OVER_TIME = "3045";
        /**
         * 余额不足
         */
        String INSUFFICIENT_BALANCE = "3008";
        /**
         * 交易失败
         */
        String FAIL = "3999";
        /**
         * 交易处理中
         */
        String PROCESSING = "2008";
    }

    /**
     * 扫呗返回交易状态
     */
    public static interface lcswTradeStatus {
        /**
         * 成功
         */
        String SUCCESS = "01";
        /**
         * 失败
         */
        String FAIL = "02";
        /**
         * 支付中
         */
        String PAYING = "03";

    }

    /**
     * 扫呗支付类型
     */
    public static interface lcswPayType {
        /**
         * 微信支付
         */
        String WECHAT = "010";

        /**
         * 支付宝支付
         */
        String ALIPAY = "020";

        /**
         * QQ钱包支付
         */
        String QQ = "060";

    }

    /**
     * 扫呗返回交易状态
     */
    public static interface lcswCheckMerchantStatus {
        /**
         * 待审核
         */
        String WAIT = "03";
        /**
         * 成功
         */
        String SUCCESS = "01";
        /**
         * 失败
         */
        String FAIL = "02";

    }

    public static interface AppUserStatus {
        /**
         * 正常
         */
        String NORMAL = "0";
        /**
         * 销户
         */
        String RELEASE = "2";
        /**
         * 锁定
         */
        String LOCK = "1";
    }

    public static interface AppTokenStatus {
        /**
         * 正常
         */
        String NORMAL = "00";
        /**
         * 处理失败
         */
        String ERROR = "11";
        /**
         * token不存在
         */
        String NOT_EXIST = "12";

        /**
         * 已过期
         */
        String EXPIRED = "13";

        /**
         * token对应的用户不存在
         */
        String USER_NOT_EXIST = "14";

        /**
         * 用户被销户
         */
        String USER_RELEASED = "15";

        /**
         * 用户被锁定
         */
        String USER_LOCKED = "16";

        /**
         * 商户不存在
         */
        String MER_NOT_EXIST = "17";

        /**
         * 商户状态异常
         */
        String MER_STATUS_ABNORMAL = "18";

        /**
         * 产品不存在
         */
        String PRODUCT_NOT_EXIST = "19";

        /**
         * 产品无效
         */
        String PRODUCT_INVALID = "20";

        /**
         * 渠道不存在
         */
        String PROVIDER_NOT_EXIST = "21";

        /**
         * 渠道无效
         */
        String PROVIDER_INVALID = "22";

        /**
         * 系统异常
         */
        String SYSTEM_ERROR = "23";

        /**
         * 入参格式错误
         */
        String PARAM_ERROR = "24";
    }

    /**
     * 商户状态
     */
    public static interface MerStatus {
        /**
         * 正常
         */
        String NORMAL = "1";

        /**
         * 销户
         */
        String RELEASE = "2";

        /**
         * 取消/删除
         */
        String DELETE = "3";

        /**
         * 待销户
         */
        String WAIT_RELEASE = "4";

        /**
         * 停用
         */
        String STOP = "5";
    }

    /**
     * APP升级类型code
     */
    public static interface AppUpdateType {
        /**
         * 全量安装升级
         */
        String FULL_INSTALL = "1";

        /**
         * 应用资源升级
         */
        String APP_RESOURCE_UPDATE = "2";

        /**
         * 应用资源差量升级
         */
        String Delta = "3";

    }

    /**
     * 风控黑名单账号类型
     */
    public static interface RiskSpecialAccountType {
        /**
         * 用户
         */
        String USER = "1";

        /**
         * 商户
         */
        String MERCHANT = "2";

    }

    /**
     * 风控规则组类型
     */
    public static interface RiskGroupType {
        /**
         * 商户
         */
        String MERCHANT = "1";

        /**
         * 用户
         */
        String USER = "2";

    }

    /**
     * 风控黑名单名单类型
     */
    public static interface RiskSpecialAccountListType {
        /**
         * 黑
         */
        String BLACK = "1";

        /**
         * 白
         */
        String WHITE = "2";

        /**
         * 灰
         */
        String GRAY = "3";

    }

    /**
     * 风控规则状态
     */
    public static interface RiskRuleState {
        /**
         * 禁用
         */
        String OFF = "0";

        /**
         * 正常
         */
        String ON = "1";

    }

    public static interface TransType {
        /**
         * 消费
         */
        String CONSUME = "1";

        /**
         * 信用卡还款
         */
        String CREDIT = "2";

        /**
         * 转账
         */
        String TRANSFER = "3";
    }

    public static interface abnormalType {
        /**
         * 大额交易
         */
        String BLOCK_TRADE = "1";

        /**
         * 灰名单
         */
        String GRAY_LIST = "2";

        /**
         * 其他异常交易类型
         */
        String OTHER = "3";
    }

    /**
     * Risk 返回的code
     */
    public static interface RiskCode {
        /**
         * 黑名单用户
         */
        int BLACK_USER = 100;

        /**
         * 灰名单用户
         */
        int GRAY_USER = 101;

        /**
         * 超出大额交易上限
         */
        int BLOCK_TRADE_LIMIT_BEYOND = 102;

        /**
         * 风控系统全局的默认大额限额配置不存在或配置错误
         */
        int BLOCK_TRADE_LIMIT_NOT_EXIST = 103;

        /**
         * 不在风控交易起止时间范围内
         */
        int RISK_RULE_BEGIN_END_TIME_BEYOND = 104;

        /**
         * 超出风控单笔交易上下限范围
         */
        int RISK_RULE_PER_MONEY_BEYOND = 105;

        /**
         * 日限额校验
         */
        int RISK_RULE_DAY_MONEY_MAX = 106;

        /**
         * 日累计次数校验
         */
        int RISK_RULE_DAY_NUMBER_MAX = 107;

        /**
         * 月限额校验
         */
        int RISK_RULE_MONTH_MONEY_MAX = 108;

        /**
         * 月累计次数校验
         */
        int RISK_RULE_MONTH_NUMBER_MAX = 109;

    }

    /**
     * Risk 返回的msg
     */
    public static interface RiskMessage {
        /**
         * 黑名单用户
         */
        String BLACK_USER = "风控黑名单，无法交易";

        /**
         * 灰名单用户
         */
        String GRAY_USER = "风控灰名单";
        /**
         * 超出风控大额交易上限
         */
        String BLOCK_TRADE_LIMIT_BEYOND = "超出风控大额交易上限";

        /**
         * 风控系统全局的默认大额限额配置不存在或配置错误
         */
        String BLOCK_TRADE_LIMIT_NOT_EXIST = "风控系统全局的默认大额限额配置不存在或配置错误";

        /**
         * 不在风控交易起止时间范围内
         */
        String RISK_RULE_BEGIN_END_TIME_BEYOND = "不在风控交易起止时间范围内";

        /**
         * 超出风控单笔交易上下限范围
         */
        String RISK_RULE_PER_MONEY_BEYOND = "超出风控单笔交易上下限范围";

        /**
         * 超出风控日限额
         */
        String RISK_RULE_DAY_MONEY_MAX = "超出风控日限额";

        /**
         * 超出风控日累计次数
         */
        String RISK_RULE_DAY_NUMBER_MAX = "超出风控日累计次数";

        /**
         * 超出风控月限额
         */
        String RISK_RULE_MONTH_MONEY_MAX = "超出风控月限额";

        /**
         * 超出风控月累计次数
         */
        String RISK_RULE_MONTH_NUMBER_MAX = "超出风控月累计次数";

    }

    /**
     * 消息发送方式 sendType
     */
    public static interface SendType {
        /**
         * 钉钉
         */
        String DINGDING = "1";
        /**
         * 邮件
         */
        String EMAIL = "2";
        /**
         * 钉钉+邮件
         */
        String DINGDING_EMAIL = "3";
    }

    /**
     * 日志类型
     */
    public static interface LogType {
        String LOGIN = "登录";
        String LOGOUT = "注销";
        String SELECT = "查询";
        String INSERT = "新增";
        String UPDATE = "修改";
        String DELETE = "删除";
        String VIEW = "查看详情";
        String STAT = "统计";
        String IMPORT = "导入";
        String EXPORT = "导出";
        String UNDO = "锁定";
        String REDO = "解锁";

        String ACCREDITIP = "授权IP";
        String AUDITIP = "审核IP";
        String DELIP = "删除授权IP";
        String ADDIP = "新增授权IP";
        String SELEIP = "查看授权IP";
        String EDITIP = "审核授权IP";

        String ALL_UNDO = "批量下线";
        String ALL_REDO = "批量上线";

        String START_USING = "启用 ";
        String STOP_USING = "停用";
        String SYNC = "同步";
        String AUDIT_PASS = "审核通过";
        String AUDIT_BACK = "审核退回";

        String BACTH_AUDIT_PASS = "批量审核通过";
        String BACTH_AUDIT_BACK = "批量审核退回";

        String REFUND = "申请退款";
        String AUDIT_REFUND = "审核退款订单";

        String AUTHROLE = "授权角色";
        String UPLOAD = "上传文件";

    }

    /**
     * 快钱业务类型代码
     */
    public static interface bizType {
        String ORDER_INFO = "ISV001";// 订单详情查询
        String SCANPAY = "ISV011";// 扫码支付
        String QUERY_ORDER = "ISV012";// 轮询
        String REFUND = "ISV013";// 退货 /撤销
        String SUCCESS = "00";// 支付成功
        String PAYING = "68";// 支付中
        String WAITING = "C0";// 交易处理中
        // 快钱订单类型编号
        String SANPAY_TYPE = "20200";// 扫码支付订单
        String REFUND_TYPE = "00500";// 退货订单
        String SCAN_REFUND = "20210";// 扫码撤销订单
        // 交易状态标识
        String S = "S";// 成功
        String F = "F";// 交易失败
        String P = "P";// 交易处理中
        String V = "V";// 交易撤销
        String R = "R";// 交易冲正

    }

    /**
     * 告警消息队列名称
     */
    public static interface QueueName {
        String RISK_QUEUE = "riskQueue";// 风控消息队列
        String WARN_QUEUE = "warnQueue";// 常规告警消息队列
        String PAY_QUEUE = "payQueue";// 支付告警消息队列
        String PAY_NOTIFY_QUEUE = "payNotifyQueue";// 商户支付结果异步通知消息队列
    }

    /**
     * 告警消息模板编码
     */
    public static interface WarnTemplateCode {
        String GENERAL_WARN = "GENERAL_WARN";// 常规异常告警消息模板
        String QURATZ_WARN = "QURATZ_WARN";// 定时任务异常告警消息模板
        String PAY_WARN = "PAY_WARN";// 支付异常告警消息模板
        String REFUND_WARN = "REFUND_WARN";// 退款异常告警消息模板
        String QUERY_WARN = "QUERY_WARN";// 查询异常告警消息模板
        String RISK_RULE_WARN = "RISK_RULE_WARN";// 违反风控规则告警消息模板
        String RISK_BLOCK_TRADE_WARN = "RISK_BLOCK_TRADE_WARN";// 风控大额交易告警消息模板
        String RISK_GRAY_ACCOUNT_WARN = "RISK_GRAY_ACCOUNT_WARN";// 风控灰名单告警消息模板
        String RISK_BLACK_ACCOUNT_WARN = "RISK_BLACK_ACCOUNT_WARN";// 风控黑名单告警消息模板

    }

    /**
     * 告警消息处理状态
     */
    public static interface AlarmInfoStatus {
        String WAITTING = "0";// 待处理
        String DEALED = "1";// 已处理
        String PAUSE = "2";// 暂停
        String CLOSED = "3";// 关闭

    }

    /**
     * 定时任务状态
     */
    public static interface TaskStatus {
        /**
         * 禁用
         */
        String OFF = "0";

        /**
         * 启用
         */
        String ON = "1";

        /**
         * 暂停
         */
        String PAUSE = "2";

    }

    /**
     * 定时任务是否并发执行
     */
    public static interface IsConcurrent {
        /**
         * 等待
         */
        String No = "0";

        /**
         * 并发
         */
        String YES = "1";

    }

    /**
     * 业务系统返回的执行码
     */
    public static interface ResponseCode {
        /**
         * 网络异常
         */
        String NET_ERROE = "22";

        /**
         * 任务正在处理中
         */
        String NET_OK = "00";

        /**
         * 执行失败
         */
        String FAIL = "11";

        /**
         * 执行成功
         */
        String SUCCESS = "88";

        /**
         * 平台内部异常
         */
        String EXCEPTION = "44";

    }

    /**
     * 定时任务Quartz鉴权返回码
     */
    public static interface QuartzAuthCode {

        /**
         * 请求合法
         */
        String VALID = "00";

        /**
         * 重放鉴定失败
         */
        String VILD_FAIL = "11";

        /**
         * 鉴权防重放处理异常
         */
        String EXCEPTION = "33";
        /**
         * IP非法
         */
        String INVALID_IP = "55";
        /**
         * nonce重复
         */
        String NONCE_REPEAT = "66";
        /**
         * 请求已过期
         */
        String REQUEST_TIMEOUT = "77";

        /**
         * 失败
         */
        String RETURN_FAIL = "81";

        /**
         * 相应成功
         */
        String RETURN_SUSSCESS = "88";

        /**
         * 密码摘要不合法
         */
        String DIGEST_INVALID = "99";

    }

    /**
     * 返回信息
     */
    public static interface QuartzAuthMessage {
        String VALID = "请求合法";
        String EXCEPTION = "鉴权防重放处理异常";
        String INVALID_IP = "IP非法";
        String NONCE_REPEAT = "nonce重复";
        String REQUEST_TIMEOUT = "请求已过期";
        String DIGEST_INVALID = "密码摘要不合法";
        String LOAD_PROPS_ERROR = "从配置文件获取密钥,合法IP,缓存超时时间参数失败";
    }

    /**
     * 传入的JSON参数的关键字
     */
    public static interface ActionKeyNew {
        String ACTION_RETURN_CODE = "ACTION_RETURN_CODE";
        String ACTION_RETURN_MESSAGE = "ACTION_RETURN_MESSAGE";
    }

    /**
     * app用户类型
     */
    public static interface AppUserType {
        /**
         * 1、企业内部用户
         */
        String INNER = "1";
        /**
         * 2、公众用户
         */
        String PUBLIC = "2";
    }

    /**
     * 微信查询退款返回状态
     */
    public static interface WechatRefundQuery {
        /**
         * 1,业务成功
         */
        String SUCCESS = "00";
        /**
         * 2业务失败
         */
        String FAIL = "04";
        /**
         * 3.系统超时
         */
        String SYSTEMERROR = "SYSTEMERROR";
        /**
         * 4.订单号错误或订单状态不正确
         */
        String REFUNDNOTEXIST = "REFUNDNOTEXIST";
        /**
         * 5.无效transaction_id
         */
        String INVALID_TRANSACTIONID = "INVALID_TRANSACTIONID";
        /**
         * 6.参数错误
         */
        String PARAM_ERROR = "PARAM_ERROR";
        /**
         * 7APPID不存在
         */
        String APPID_NOT_EXIST = "APPID_NOT_EXIST";
        /**
         * 8.MCHID不存在
         */
        String MCHID_NOT_EXIST = "MCHID_NOT_EXIST";
        /**
         * 9.请使用post方法
         */
        String REQUIRE_POST_METHOD = "REQUIRE_POST_METHOD";
        /**
         * 10.签名错误
         */
        String SIGNERROR = "SIGNERROR";
        /**
         * 11.XML格式错误
         */
        String XML_FORMAT_ERROR = "XML_FORMAT_ERROR";

    }

    /**
     * 风控规则审核状态
     */
    public static interface RiskParamAuditStatus {
        /**
         * 0.未审核
         */
        String NOT_AUDIT = "0";
        /**
         * 1.审核通过
         */
        String PASS = "1";
        /**
         * 2.审核拒绝
         */
        String REFUSE = "2";
    }

    /**
     * 微信查询订单支付状态
     */
    public static interface WechatQueryStatus {
        /**
         * 支付成功
         */
        String SUCCESS = "SUCCESS";
        /**
         * 转入退款
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
         * 已撤销（刷卡支付）
         */
        String REVOKED = "REVOKED";
        /**
         * 用户支付中
         */
        String USERPAYING = "USERPAYING";
        /**
         * 支付失败(其他原因，如银行返回失败)
         */
        String PAYERROR = "PAYERROR";

    }

    /**
     * 微信撤销订单状态
     */
    public static interface WechatCloseOrder {
        /**
         * 撤销成功
         */
        String SUCCESS = "SUCCESS";
        /**
         * 订单已支付不能发起撤销
         */
        String ORDERPAID = "ORDERPAID";
        /**
         * 系统错误
         */
        String SYSTEMERROR = "SYSTEMERROR";
        /**
         * 订单已关闭
         */
        String ORDERCLOSED = "ORDERCLOSED";
        /**
         * 签名错误
         */
        String SIGNERROR = "SIGNERROR";
        /**
         * 请使用post提交
         */
        String REQUIRE_POST_METHOD = "REQUIRE_POST_METHOD";
        /**
         * XML格式错误
         */
        String XML_FORMAT_ERROR = "XML_FORMAT_ERROR";
        /**
         * 支付失败(其他原因，如银行返回失败)
         */
        String PAYERROR = "PAYERROR";

    }

    /**
     * 统计方式
     */
    public static interface StatisticWay {
        /**
         * 汇总
         */
        String SUM = "0";
        /**
         * 年
         */
        String Year = "1";
        /**
         * 月
         */
        String MONTH = "2";
        /**
         * 日
         */
        String DAY = "3";

    }

    /**
     * 交易类型
     */
    public static interface TradeType {
        /**
         * 挂号
         */
        String REGISTR = "01";
        /**
         * 预约挂号
         */
        String RESERVATION_EGISTR = "02";
        /**
         * 门诊缴费
         */
        String PATIENT_PAYMENT = "03";
        /**
         * 门诊充值
         */
        String outpatient_prepaid = "04";
        /**
         * 住院预交金
         */
        String HOSPITALIZATION = "05";
        /**
         * 住院结算
         */
        String HOSPITAL_SETTLEMENT = "06";

    }

    public static interface BusiCode {

        /**
         * 多码合一扫码支付
         */
        String QR_PAY = "QR_PAY";

        /**
         * 刷卡支付
         */
        String SWIPE_PAY = "SWIPE_PAY";

        /**
         * 微信公众号支付
         */
        String WX_JSAPI = "WX_JSAPI";

        /**
         * 微信原生扫码支付
         */
        String WX_NATIVE = "WX_NATIVE";

        /**
         * 微信APP支付
         */
        String WX_APP = "WX_APP";

        /**
         * 微信H5支付
         */
        String WX_H5 = "WX_H5";

        /**
         * 支付宝移动支付
         */
        String ALIPAY_MOBILE = "ALIPAY_MOBILE";

        /**
         * 支付宝PC支付
         */
        String ALIPAY_PC = "ALIPAY_PC";

        /**
         * 支付宝WAP支付
         */
        String ALIPAY_WAP = "ALIPAY_WAP";

        /**
         * 退费
         */
        String REFUND = "REFUND";

        /**
         * 订单状态查询
         */
        String ORDER_STATUS = "ORDER_STATUS";

        /**
         * 支付结果异步通知
         */
        String NOTIFY = "NOTIFY";
        /**
         * 取消订单
         */
        String CANCEL_ORDER = "CANCEL_ORDER";

        /**
         * 业务系统推送HIS订单号
         */
        String BACK_HIS_ORDER_NO = "BACK_HIS_ORDER_NO";

        /**
         * 查询患者订单信息列表
         */
        String ORDER_LIST = "ORDER_LIST";
        /**
         * 自助机银行卡支付
         */
        String CREATE_MISPOS_ORDER = "CREATE_MISPOS_ORDER";

        /**
         * 自助机银行卡支付结果返回
         */
        String PUSH_MISPOS_RESULT = "PUSH_MISPOS_RESULT";

    }

    /**
     * 交易来源
     */
    public static interface TradeSource {
        /**
         * 自助机
         */
        String SELFMACHINE = "01";
        /**
         * 窗口扫码
         */
        String COUNTER = "02";
        /**
         * APP
         */
        String APP = "03";
        /**
         * 微信公众号
         */
        String MP = "04";

    }
}
