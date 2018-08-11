package com.cz.cloud.user.sign;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "yang_member")
public class YangMember {
    @Id
    @Column(name = "member_id")
    private Integer memberId;

    private String openid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 邀请人
     */
    private String pid;

    /**
     * 支付密码
     */
    private String pwdtrade;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 1=身份证2=护照
     */
    private String cardtype;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 注册IP
     */
    private String ip;

    /**
     * 注册时间
     */
    @Column(name = "reg_time")
    private Integer regTime;

    /**
     * 本次登录IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Integer loginTime;

    /**
     * vip等级
     */
    @Column(name = "vip_level")
    private Integer vipLevel;

    /**
     * vip到期时间
     */
    @Column(name = "vip_end_time")
    private Integer vipEndTime;

    /**
     * 人民币
     */
    private BigDecimal rmb;

    /**
     * forzen_rmb
     */
    @Column(name = "forzen_rmb")
    private BigDecimal forzenRmb;

    /**
     * head
     */
    private String head;

    /**
     * 省市
     */
    private Integer province;

    /**
     * 城市
     */
    private Integer city;

    /**
     * 职位/头衔
     */
    private String job;

    /**
     * 0是正常 1是锁定
     */
    @Column(name = "is_lock")
    private Byte isLock;

    /**
     * 0=有效未填写个人信息1=有效并且填写完个人信息2=无效
     */
    private Byte status;

    @Column(name = "dividend_num")
    private BigDecimal dividendNum;

    private String threepwd;

    /**
     * 交易密码设置类型1,2,3（1；每次都输入，2：每次都不输入：3：第一次输入）
     */
    private Integer typepwd1;

    /**
     * 若是1，表示首次交易，其它设置为0
     */
    private Integer typepwd2;

    /**
     * 银行卡号
     */
    @Column(name = "bank_id")
    private String bankId;

    /**
     * 银行
     */
    private String bank;

    /**
     * 银行预留手机号
     */
    private String phone1;

    @Column(name = "safe_time")
    private String safeTime;

    /**
     * QQopenid
     */
    private String qqopenid;

    /**
     * 身份证正面 
     */
    private String pic1;

    /**
     * 身份证反面 
     */
    private String pic2;

    /**
     * 受持正面
     */
    private String pic3;

    /**
     * 3 待审核 1 审核通过  2 审核不通过 0为认证
     */
    private Integer shenhestatus;

    private String zhifubao;

    private Double cmoney;

    /**
     * 返利截止时间
     */
    @Column(name = "invit_time")
    private Integer invitTime;

    @Column(name = "google_id")
    private Integer googleId;

    /**
     * 返利天数
     */
    private Integer invit;

    /**
     * 高级交易用户,自己买自己，仅显示一笔交易记录
     */
    @Column(name = "trade_super")
    private Integer tradeSuper;

    /**
     * 0-普通   1-push商家
     */
    @Column(name = "push_super")
    private Short pushSuper;

    /**
     * push成功次数
     */
    @Column(name = "push_num")
    private Integer pushNum;

    /**
     * 交易次数
     */
    @Column(name = "deal_number")
    private Integer dealNumber;

    /**
     * 谷歌令牌
     */
    private String secret;

    /**
     * 0-可以C2C  1-禁止C2C
     */
    @Column(name = "push_lock")
    private Short pushLock;

    /**
     * OTC冻结时间
     */
    @Column(name = "lock_time")
    private Integer lockTime;

    /**
     * 取消C2C订单次数
     */
    @Column(name = "lock_num")
    private Integer lockNum;

    /**
     * 国家手机代码
     */
    private String county;

    /**
     * 在线状态,0离线,1在线
     */
    private Integer online;

    /**
     * 最后登录时间
     */
    @Column(name = "online_time")
    private Integer onlineTime;

    private Boolean webim;

    /**
     * 个人简介
     */
    private String profile;

    /**
     * @return member_id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取邀请人
     *
     * @return pid - 邀请人
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置邀请人
     *
     * @param pid 邀请人
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取支付密码
     *
     * @return pwdtrade - 支付密码
     */
    public String getPwdtrade() {
        return pwdtrade;
    }

    /**
     * 设置支付密码
     *
     * @param pwdtrade 支付密码
     */
    public void setPwdtrade(String pwdtrade) {
        this.pwdtrade = pwdtrade;
    }

    /**
     * 获取昵称
     *
     * @return nick - 昵称
     */
    public String getNick() {
        return nick;
    }

    /**
     * 设置昵称
     *
     * @param nick 昵称
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 获取真实姓名
     *
     * @return name - 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实姓名
     *
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取1=身份证2=护照
     *
     * @return cardtype - 1=身份证2=护照
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 设置1=身份证2=护照
     *
     * @param cardtype 1=身份证2=护照
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 获取身份证
     *
     * @return idcard - 身份证
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证
     *
     * @param idcard 身份证
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取注册IP
     *
     * @return ip - 注册IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置注册IP
     *
     * @param ip 注册IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取注册时间
     *
     * @return reg_time - 注册时间
     */
    public Integer getRegTime() {
        return regTime;
    }

    /**
     * 设置注册时间
     *
     * @param regTime 注册时间
     */
    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取本次登录IP
     *
     * @return login_ip - 本次登录IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置本次登录IP
     *
     * @param loginIp 本次登录IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取vip等级
     *
     * @return vip_level - vip等级
     */
    public Integer getVipLevel() {
        return vipLevel;
    }

    /**
     * 设置vip等级
     *
     * @param vipLevel vip等级
     */
    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    /**
     * 获取vip到期时间
     *
     * @return vip_end_time - vip到期时间
     */
    public Integer getVipEndTime() {
        return vipEndTime;
    }

    /**
     * 设置vip到期时间
     *
     * @param vipEndTime vip到期时间
     */
    public void setVipEndTime(Integer vipEndTime) {
        this.vipEndTime = vipEndTime;
    }

    /**
     * 获取人民币
     *
     * @return rmb - 人民币
     */
    public BigDecimal getRmb() {
        return rmb;
    }

    /**
     * 设置人民币
     *
     * @param rmb 人民币
     */
    public void setRmb(BigDecimal rmb) {
        this.rmb = rmb;
    }

    /**
     * 获取forzen_rmb
     *
     * @return forzen_rmb - forzen_rmb
     */
    public BigDecimal getForzenRmb() {
        return forzenRmb;
    }

    /**
     * 设置forzen_rmb
     *
     * @param forzenRmb forzen_rmb
     */
    public void setForzenRmb(BigDecimal forzenRmb) {
        this.forzenRmb = forzenRmb;
    }

    /**
     * 获取head
     *
     * @return head - head
     */
    public String getHead() {
        return head;
    }

    /**
     * 设置head
     *
     * @param head head
     */
    public void setHead(String head) {
        this.head = head;
    }

    /**
     * 获取省市
     *
     * @return province - 省市
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * 设置省市
     *
     * @param province 省市
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public Integer getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * 获取职位/头衔
     *
     * @return job - 职位/头衔
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置职位/头衔
     *
     * @param job 职位/头衔
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取0是正常 1是锁定
     *
     * @return is_lock - 0是正常 1是锁定
     */
    public Byte getIsLock() {
        return isLock;
    }

    /**
     * 设置0是正常 1是锁定
     *
     * @param isLock 0是正常 1是锁定
     */
    public void setIsLock(Byte isLock) {
        this.isLock = isLock;
    }

    /**
     * 获取0=有效未填写个人信息1=有效并且填写完个人信息2=无效
     *
     * @return status - 0=有效未填写个人信息1=有效并且填写完个人信息2=无效
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0=有效未填写个人信息1=有效并且填写完个人信息2=无效
     *
     * @param status 0=有效未填写个人信息1=有效并且填写完个人信息2=无效
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return dividend_num
     */
    public BigDecimal getDividendNum() {
        return dividendNum;
    }

    /**
     * @param dividendNum
     */
    public void setDividendNum(BigDecimal dividendNum) {
        this.dividendNum = dividendNum;
    }

    /**
     * @return threepwd
     */
    public String getThreepwd() {
        return threepwd;
    }

    /**
     * @param threepwd
     */
    public void setThreepwd(String threepwd) {
        this.threepwd = threepwd;
    }

    /**
     * 获取交易密码设置类型1,2,3（1；每次都输入，2：每次都不输入：3：第一次输入）
     *
     * @return typepwd1 - 交易密码设置类型1,2,3（1；每次都输入，2：每次都不输入：3：第一次输入）
     */
    public Integer getTypepwd1() {
        return typepwd1;
    }

    /**
     * 设置交易密码设置类型1,2,3（1；每次都输入，2：每次都不输入：3：第一次输入）
     *
     * @param typepwd1 交易密码设置类型1,2,3（1；每次都输入，2：每次都不输入：3：第一次输入）
     */
    public void setTypepwd1(Integer typepwd1) {
        this.typepwd1 = typepwd1;
    }

    /**
     * 获取若是1，表示首次交易，其它设置为0
     *
     * @return typepwd2 - 若是1，表示首次交易，其它设置为0
     */
    public Integer getTypepwd2() {
        return typepwd2;
    }

    /**
     * 设置若是1，表示首次交易，其它设置为0
     *
     * @param typepwd2 若是1，表示首次交易，其它设置为0
     */
    public void setTypepwd2(Integer typepwd2) {
        this.typepwd2 = typepwd2;
    }

    /**
     * 获取银行卡号
     *
     * @return bank_id - 银行卡号
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置银行卡号
     *
     * @param bankId 银行卡号
     */
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取银行
     *
     * @return bank - 银行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 设置银行
     *
     * @param bank 银行
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * 获取银行预留手机号
     *
     * @return phone1 - 银行预留手机号
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 设置银行预留手机号
     *
     * @param phone1 银行预留手机号
     */
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    /**
     * @return safe_time
     */
    public String getSafeTime() {
        return safeTime;
    }

    /**
     * @param safeTime
     */
    public void setSafeTime(String safeTime) {
        this.safeTime = safeTime;
    }

    /**
     * 获取QQopenid
     *
     * @return qqopenid - QQopenid
     */
    public String getQqopenid() {
        return qqopenid;
    }

    /**
     * 设置QQopenid
     *
     * @param qqopenid QQopenid
     */
    public void setQqopenid(String qqopenid) {
        this.qqopenid = qqopenid;
    }

    /**
     * 获取身份证正面 
     *
     * @return pic1 - 身份证正面 
     */
    public String getPic1() {
        return pic1;
    }

    /**
     * 设置身份证正面 
     *
     * @param pic1 身份证正面 
     */
    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    /**
     * 获取身份证反面 
     *
     * @return pic2 - 身份证反面 
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * 设置身份证反面 
     *
     * @param pic2 身份证反面 
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    /**
     * 获取受持正面
     *
     * @return pic3 - 受持正面
     */
    public String getPic3() {
        return pic3;
    }

    /**
     * 设置受持正面
     *
     * @param pic3 受持正面
     */
    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    /**
     * 获取3 待审核 1 审核通过  2 审核不通过 0为认证
     *
     * @return shenhestatus - 3 待审核 1 审核通过  2 审核不通过 0为认证
     */
    public Integer getShenhestatus() {
        return shenhestatus;
    }

    /**
     * 设置3 待审核 1 审核通过  2 审核不通过 0为认证
     *
     * @param shenhestatus 3 待审核 1 审核通过  2 审核不通过 0为认证
     */
    public void setShenhestatus(Integer shenhestatus) {
        this.shenhestatus = shenhestatus;
    }

    /**
     * @return zhifubao
     */
    public String getZhifubao() {
        return zhifubao;
    }

    /**
     * @param zhifubao
     */
    public void setZhifubao(String zhifubao) {
        this.zhifubao = zhifubao;
    }

    /**
     * @return cmoney
     */
    public Double getCmoney() {
        return cmoney;
    }

    /**
     * @param cmoney
     */
    public void setCmoney(Double cmoney) {
        this.cmoney = cmoney;
    }

    /**
     * 获取返利截止时间
     *
     * @return invit_time - 返利截止时间
     */
    public Integer getInvitTime() {
        return invitTime;
    }

    /**
     * 设置返利截止时间
     *
     * @param invitTime 返利截止时间
     */
    public void setInvitTime(Integer invitTime) {
        this.invitTime = invitTime;
    }

    /**
     * @return google_id
     */
    public Integer getGoogleId() {
        return googleId;
    }

    /**
     * @param googleId
     */
    public void setGoogleId(Integer googleId) {
        this.googleId = googleId;
    }

    /**
     * 获取返利天数
     *
     * @return invit - 返利天数
     */
    public Integer getInvit() {
        return invit;
    }

    /**
     * 设置返利天数
     *
     * @param invit 返利天数
     */
    public void setInvit(Integer invit) {
        this.invit = invit;
    }

    /**
     * 获取高级交易用户,自己买自己，仅显示一笔交易记录
     *
     * @return trade_super - 高级交易用户,自己买自己，仅显示一笔交易记录
     */
    public Integer getTradeSuper() {
        return tradeSuper;
    }

    /**
     * 设置高级交易用户,自己买自己，仅显示一笔交易记录
     *
     * @param tradeSuper 高级交易用户,自己买自己，仅显示一笔交易记录
     */
    public void setTradeSuper(Integer tradeSuper) {
        this.tradeSuper = tradeSuper;
    }

    /**
     * 获取0-普通   1-push商家
     *
     * @return push_super - 0-普通   1-push商家
     */
    public Short getPushSuper() {
        return pushSuper;
    }

    /**
     * 设置0-普通   1-push商家
     *
     * @param pushSuper 0-普通   1-push商家
     */
    public void setPushSuper(Short pushSuper) {
        this.pushSuper = pushSuper;
    }

    /**
     * 获取push成功次数
     *
     * @return push_num - push成功次数
     */
    public Integer getPushNum() {
        return pushNum;
    }

    /**
     * 设置push成功次数
     *
     * @param pushNum push成功次数
     */
    public void setPushNum(Integer pushNum) {
        this.pushNum = pushNum;
    }

    /**
     * 获取交易次数
     *
     * @return deal_number - 交易次数
     */
    public Integer getDealNumber() {
        return dealNumber;
    }

    /**
     * 设置交易次数
     *
     * @param dealNumber 交易次数
     */
    public void setDealNumber(Integer dealNumber) {
        this.dealNumber = dealNumber;
    }

    /**
     * 获取谷歌令牌
     *
     * @return secret - 谷歌令牌
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 设置谷歌令牌
     *
     * @param secret 谷歌令牌
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 获取0-可以C2C  1-禁止C2C
     *
     * @return push_lock - 0-可以C2C  1-禁止C2C
     */
    public Short getPushLock() {
        return pushLock;
    }

    /**
     * 设置0-可以C2C  1-禁止C2C
     *
     * @param pushLock 0-可以C2C  1-禁止C2C
     */
    public void setPushLock(Short pushLock) {
        this.pushLock = pushLock;
    }

    /**
     * 获取OTC冻结时间
     *
     * @return lock_time - OTC冻结时间
     */
    public Integer getLockTime() {
        return lockTime;
    }

    /**
     * 设置OTC冻结时间
     *
     * @param lockTime OTC冻结时间
     */
    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * 获取取消C2C订单次数
     *
     * @return lock_num - 取消C2C订单次数
     */
    public Integer getLockNum() {
        return lockNum;
    }

    /**
     * 设置取消C2C订单次数
     *
     * @param lockNum 取消C2C订单次数
     */
    public void setLockNum(Integer lockNum) {
        this.lockNum = lockNum;
    }

    /**
     * 获取国家手机代码
     *
     * @return county - 国家手机代码
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置国家手机代码
     *
     * @param county 国家手机代码
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * 获取在线状态,0离线,1在线
     *
     * @return online - 在线状态,0离线,1在线
     */
    public Integer getOnline() {
        return online;
    }

    /**
     * 设置在线状态,0离线,1在线
     *
     * @param online 在线状态,0离线,1在线
     */
    public void setOnline(Integer online) {
        this.online = online;
    }

    /**
     * 获取最后登录时间
     *
     * @return online_time - 最后登录时间
     */
    public Integer getOnlineTime() {
        return onlineTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param onlineTime 最后登录时间
     */
    public void setOnlineTime(Integer onlineTime) {
        this.onlineTime = onlineTime;
    }

    /**
     * @return webim
     */
    public Boolean getWebim() {
        return webim;
    }

    /**
     * @param webim
     */
    public void setWebim(Boolean webim) {
        this.webim = webim;
    }

    /**
     * 获取个人简介
     *
     * @return profile - 个人简介
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 设置个人简介
     *
     * @param profile 个人简介
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }
}