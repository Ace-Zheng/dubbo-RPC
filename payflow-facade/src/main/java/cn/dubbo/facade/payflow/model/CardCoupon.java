package cn.dubbo.facade.payflow.model;

import java.io.Serializable;
import java.util.Date;

public class CardCoupon implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1654097067626168373L;

	private Integer id;

    private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


   
}