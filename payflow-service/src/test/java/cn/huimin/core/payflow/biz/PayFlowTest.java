//package cn.huimin.core.payflow.biz;
//
//import java.util.Iterator;
//import java.util.Map;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
////忽略测试 test
//@Ignore
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
//public class PayFlowTest {
//
//	/** 日志实例 */
//	private Log log = LogFactory.getLog(PayFlowTest.class);
//
//	@Autowired
//	private PayFlowBiz payFlowsBiz;
//
//	/**
//	 * 测试findMarketFlowByCond接口
//	 */
//	@SuppressWarnings("unchecked")
//	@Test
//	public void testFindMarketFlowByCond() {
//		String startDate = "2016-06-14 00:00:00";
//		String endDate = "2016-06-15 18:00:00";
//		String marketID = "888";
//		String sellWay = "A";
//		Map<String, Object> map = payFlowsBiz.findMarketFlowByCond(marketID,
//				startDate, endDate, sellWay);
//		if (null != map && map.size() > 0) {
//			Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
//			while (it.hasNext()) {
//				Map.Entry<String, Object> entry = it.next();
//				log.info("<== key: " + entry.getKey() + " , value: "
//						+ entry.getValue().toString());
//			}
//		} else {
//			log.info("<== null");
//		}
//	}
//}