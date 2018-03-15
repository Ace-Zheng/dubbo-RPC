

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用MainClass启动Dubbo服务
 * 
 * @author vinceyu
 */
public class RunDubbo {

	/** 日志实例 */
	private static final Log log = LogFactory.getLog(RunDubbo.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring/spring-context.xml");
			context.start();
		} catch (Exception e) {
			log.error("==>Dubbo start error:", e);
		}
		synchronized (RunDubbo.class) {
			while (true) {
				try {
					RunDubbo.class.wait();
				} catch (InterruptedException e) {
					log.error("==>synchronized error:", e);
				}
			}
		}
	}
}