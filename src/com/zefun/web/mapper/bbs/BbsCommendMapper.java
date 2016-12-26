package com.zefun.web.mapper.bbs;

import com.zefun.web.entity.bbs.BbsCommend;

public interface BbsCommendMapper {
    int deleteByPrimaryKey(Integer commendId);

    int insert(BbsCommend record);

    int insertSelective(BbsCommend record);

    BbsCommend selectByPrimaryKey(Integer commendId);

    int updateByPrimaryKeySelective(BbsCommend record);

    int updateByPrimaryKey(BbsCommend record);
}