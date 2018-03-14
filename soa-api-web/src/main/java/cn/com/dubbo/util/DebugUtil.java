package cn.com.dubbo.util;

import java.io.InputStream;
import java.util.Properties;

public class DebugUtil {
	
	public static Properties properties = new Properties();
	
	static{
		InputStream is = DebugUtil.class.getClassLoader().getResourceAsStream("config/system.properties");
		try {
			properties.load(is);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean getDebugFlag(){
		String flag = properties.getProperty("debug");
		if("true".equals(flag)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(DebugUtil.getDebugFlag());;
	}
}
