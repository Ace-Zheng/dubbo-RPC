package cn.dubbo.facade.member.mapper;

import cn.dubbo.facade.member.model.ScoreReason;


public interface ScoreReasonMapper {
    int deleteByPrimaryKey(Integer reason_id);

    int insert(ScoreReason record);

    int insertSelective(ScoreReason record);

    ScoreReason selectByPrimaryKey(Integer reason_id);

    int updateByPrimaryKeySelective(ScoreReason record);

    int updateByPrimaryKey(ScoreReason record);
}