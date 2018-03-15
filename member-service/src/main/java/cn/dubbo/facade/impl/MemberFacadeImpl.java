package cn.dubbo.facade.impl;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.dubbo.facade.member.MemberFacade;
import cn.dubbo.facade.member.model.ScoreReason;
import cn.dubbo.facade.member.service.Memberservice;
import cn.dubbo.facade.payflow.LichenFacade;
import cn.dubbo.facade.payflow.model.CardCoupon;


/**
 * 会员Dubbo服务接口实现类
 */
@Service("memberFacade")
public class MemberFacadeImpl implements MemberFacade {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private Memberservice memberservice;
	
	@Resource
	private LichenFacade lichenService;
	
	public ScoreReason queryScore() {
		logger.info("进入:{}的dubbo服务",this.getClass());
		ScoreReason scoreReason = memberservice.queryScore();
		CardCoupon cardCoupon = lichenService.queryInfos(157);
		scoreReason.setName(cardCoupon.getName());
		return scoreReason;
	}
}
