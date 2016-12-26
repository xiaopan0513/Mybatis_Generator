package com.zefun.web.mapper.bbs;

import com.zefun.web.entity.bbs.BbsShare;

public interface BbsShareMapper {
    int deleteByPrimaryKey(Integer shareId);

    int insert(BbsShare record);

    int insertSelective(BbsShare record);

    BbsShare selectByPrimaryKey(Integer shareId);

    int updateByPrimaryKeySelective(BbsShare record);

    int updateByPrimaryKey(BbsShare record);
}