package com.cz.cloud.user.controller;

import com.cz.cloud.user.mapper.MemberMapper;
import com.cz.cloud.user.sign.YangMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Micky
 * @Title: MemberController
 * @ProjectName test_db
 * @Description:
 * @date 2018/8/6下午12:52
 */
@RestController
public class MemberController {
    @Autowired
    private MemberMapper memberMapper;
    @RequestMapping("/db")
    public String findAll(int memberId) {
        YangMember yangMember = memberMapper.findAll(memberId);
        return yangMember.getPwd();
    }

}
