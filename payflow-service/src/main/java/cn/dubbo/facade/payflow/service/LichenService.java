package cn.dubbo.facade.payflow.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dubbo.facade.payflow.mapper.CardCouponMapper;
import cn.dubbo.facade.payflow.model.CardCoupon;



/**
 * service 逻辑层
 *
 */
@Service("lichenService")
@Transactional
public class LichenService {
	@Resource
	private CardCouponMapper cardCouponMapper;


	public CardCoupon queryInfos() {
		return cardCouponMapper.selectByPrimaryKey(157);
	}

	
}