import com.ryfchina.demo.common.constant.C;
import com.ryfchina.demo.common.kit.HttpKit;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class AllPayControllerTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(AllPayControllerTests.class);

    private static final String merId = "1711301105210001";

    private static final String merKey = "ryf2018001";

//    private static final String host = "http://192.168.171.207:9999/api/v1/trans/";

    //    private static final String host = "http://testpay.ryfchina.com/api/v1/trans/";
    private static final String host = "http://127.0.0.1:9999/api/v1/trans/";

//    private static final String host = "http://61.183.119.40:80/api/v1/trans/";

    private static final String merchantNotifyUrl = "http://127.0.0.1:9999/api/v1/receiveNotify";

    @Test
    public void contextLoads() {
    }


    /**
     * 统一支付平台与支付宝微信对账测试
     */
    @Test
    public void reconAllProviderBillTest() throws Exception {
        LOGGER.info("进入AllPayControllerTests.reconAllProviderBillTest()方法......");
        String host = "http://127.0.0.1:9999/recon/checkByDay/";
        Map p = new HashMap();
        p.put("recDate", "2018-05-02");
        String returnData = HttpKit.post(host, p, C.Charset.UTF8, null);
    }


    @Test
    public void testMath() {
        LOGGER.info("执行AllPayControllerTests.testMath()方法完毕......,出参:[]：{}", Math.abs(-3000L));
    }
}
