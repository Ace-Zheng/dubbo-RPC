package cn.dubbo.facade.member.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dubbo.facade.member.mapper.ScoreReasonMapper;
import cn.dubbo.facade.member.model.ScoreReason;


/**
 * service 逻辑层
 * 
 */
@Service("memberService")
public class Memberservice {

	@Resource
	private ScoreReasonMapper scoreReasonMapper;

	public ScoreReason queryScore() {
		return scoreReasonMapper.selectByPrimaryKey(1);
	}
}