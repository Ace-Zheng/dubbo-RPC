package cn.dubbo.facade.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dubbo.facade.payflow.LichenFacade;
import cn.dubbo.facade.payflow.model.CardCoupon;
import cn.dubbo.facade.payflow.service.LichenService;


/**
 * 支付流水Dubbo服务接口实现类
 */
@Service("lichenFacade")
public class LichenFacadeImpl implements LichenFacade {
	
	@Resource
	private LichenService lichenService;

	
	@Override
	public CardCoupon queryInfos(Integer id) {
		// TODO Auto-generated method stub
		return lichenService.queryInfos();
	}


	
}
