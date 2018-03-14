package cn.dubbo.facade.payflow.mapper;

import cn.dubbo.facade.payflow.model.CardCoupon;


public interface CardCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CardCoupon record);

    int insertSelective(CardCoupon record);

    CardCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardCoupon record);

    int updateByPrimaryKey(CardCoupon record);
}