package com.zefun.web.mapper.bbs;

import com.zefun.web.entity.bbs.BbsSetting;

public interface BbsSettingMapper {
    int deleteByPrimaryKey(Integer storeId);

    int insert(BbsSetting record);

    int insertSelective(BbsSetting record);

    BbsSetting selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(BbsSetting record);

    int updateByPrimaryKey(BbsSetting record);
}