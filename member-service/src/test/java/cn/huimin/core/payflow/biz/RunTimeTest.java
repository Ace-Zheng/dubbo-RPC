//package cn.huimin.core.payflow.biz;
//
//import java.util.List;
//
//import net.sf.json.JSONObject;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import cn.huimin.common.mongo.MongodbBaseDao;
//import cn.huimin.facade.payflow.entity.PayFlow;
//
//// 忽略测试 test
//@Ignore
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
//public class RunTimeTest {
//
//	/** 日志实例 */
//	private Log log = LogFactory.getLog(RunTimeTest.class);
//	@Autowired
//	private MongodbBaseDao<PayFlow> mongodbBaseDao;
//
//	@Test
//	public void findAll() {
//		List<PayFlow> l = null;
//		try {
//			l = mongodbBaseDao.find(new Query(), PayFlow.class);
//		} catch (Exception e) {
//			log.error("==>error:", e);
//		}
//		for (PayFlow p : l) {
//			log.info("==>" + JSONObject.fromObject(p).toString());
//		}
//	}
//}