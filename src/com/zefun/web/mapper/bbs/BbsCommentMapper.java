package com.zefun.web.mapper.bbs;

import com.zefun.web.entity.bbs.BbsComment;

public interface BbsCommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(BbsComment record);

    int insertSelective(BbsComment record);

    BbsComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(BbsComment record);

    int updateByPrimaryKey(BbsComment record);
}