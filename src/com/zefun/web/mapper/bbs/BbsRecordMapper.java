package com.zefun.web.mapper.bbs;

import com.zefun.web.entity.bbs.BbsRecord;

public interface BbsRecordMapper {
    int deleteByPrimaryKey(Integer bbsId);

    int insert(BbsRecord record);

    int insertSelective(BbsRecord record);

    BbsRecord selectByPrimaryKey(Integer bbsId);

    int updateByPrimaryKeySelective(BbsRecord record);

    int updateByPrimaryKey(BbsRecord record);
}