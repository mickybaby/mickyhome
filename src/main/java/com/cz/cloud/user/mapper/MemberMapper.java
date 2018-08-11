package com.cz.cloud.user.mapper;

import com.cz.cloud.user.sign.YangMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author Micky
 * @Title: MemberMapper
 * @ProjectName test_db
 * @Description: TODO
 * @date 2018/8/6下午12:53
 */
@Mapper
@Component
public interface MemberMapper {

    public YangMember findAll(int memberId) ;
}
