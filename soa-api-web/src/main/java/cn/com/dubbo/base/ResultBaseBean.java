package cn.com.dubbo.base;

import java.io.Serializable;

/**
 * 返回json结果基础类（尽量都返回这个类）
 *
 */
public class ResultBaseBean implements Serializable {
	private static final long serialVersionUID = 5211682409608784947L;
	private Integer code = Config.SUCCESS; // 0: 成功;
	private String msg = "";
	private Object data = "";
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
