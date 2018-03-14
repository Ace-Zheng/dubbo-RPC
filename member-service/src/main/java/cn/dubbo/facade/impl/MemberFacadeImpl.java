package cn.dubbo.facade.impl;


import javax.annotation.Resource;

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
	@Resource
	private Memberservice memberservice;
	
	@Resource
	private LichenFacade lichenService;
	
	public ScoreReason queryScore() {
		
		ScoreReason scoreReason = memberservice.queryScore();
		CardCoupon cardCoupon = lichenService.queryInfos(157);
		scoreReason.setName(cardCoupon.getName());
		return scoreReason;
	}
}
