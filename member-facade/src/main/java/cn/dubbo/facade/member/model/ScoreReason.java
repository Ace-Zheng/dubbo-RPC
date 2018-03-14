package cn.dubbo.facade.member.model;

import java.io.Serializable;

public class ScoreReason implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3725020889427214305L;

	private Integer reason_id;

    private String reason_type;

    private String reason_name;
    
    private String name;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getReason_id() {
        return reason_id;
    }

    public void setReason_id(Integer reason_id) {
        this.reason_id = reason_id;
    }

    public String getReason_type() {
        return reason_type;
    }

    public void setReason_type(String reason_type) {
        this.reason_type = reason_type == null ? null : reason_type.trim();
    }

    public String getReason_name() {
        return reason_name;
    }

    public void setReason_name(String reason_name) {
        this.reason_name = reason_name == null ? null : reason_name.trim();
    }
}