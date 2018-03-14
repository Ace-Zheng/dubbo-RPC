package cn.dubbo.facade.member;

import java.util.List;
import java.util.Map;

import cn.dubbo.facade.member.model.ScoreReason;


/**
 * member Dubbo服务接口
 * 
 * @author vinceyu
 */
public interface MemberFacade {

	public ScoreReason queryScore();
}
