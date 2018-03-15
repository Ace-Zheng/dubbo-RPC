package cn.dubbo.facade.impl;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.dubbo.facade.payflow.LichenFacade;
import cn.dubbo.facade.payflow.model.CardCoupon;
import cn.dubbo.facade.payflow.service.LichenService;


/**
 * 支付流水Dubbo服务接口实现类
 */
@Service("lichenFacade")
public class LichenFacadeImpl implements LichenFacade {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private LichenService lichenService;

	
	@Override
	public CardCoupon queryInfos(Integer id) {
		logger.info("进入:{}的dubbo服务",this.getClass());
		return lichenService.queryInfos();
	}


	
}
