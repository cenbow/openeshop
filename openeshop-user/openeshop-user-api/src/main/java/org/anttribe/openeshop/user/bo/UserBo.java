/*
 * 文  件   名: UserBo.java
 * 版         本 : (Anttribe) openeshop-user-api All rights reserved
 * 描         述 : <描述>
 * 修   改  人: zhaoyong
 * 修改时间: 2015年10月12日
 */
package org.anttribe.openeshop.user.bo;

import java.sql.Timestamp;

/**
 * @author zhaoyong
 * @version 2015年10月12日
 */
public class UserBo
{
    /**
     * 用户编号: 唯一
     */
    private String id;
    
    /**
     * 用户名
     */
    private String username;
    
    /**
     * 用户昵称
     */
    private String nickname;
    
    /**
     * 用户邮箱
     */
    private String email;
    
    /**
     * 联系电话
     */
    private String mobile;
    
    /**
     * 头像
     */
    private String avatar;
    
    /**
     * 个性签名
     */
    private String signature;
    
    /**
     * 创建时间
     */
    private Timestamp createTime;
    
    /**
     * 数据更新时间
     */
    private Timestamp updateTime;
    
    /**
     * 最近登录时间
     */
    private Timestamp latestLoginTime;
    
    /**
     * 可用的
     */
    private boolean available;
    
    /**
     * 环信用户名
     */
    private String hxUsername;
    
    /**
     * 环信的用户密码
     */
    private String hxPassword;
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getNickname()
    {
        return nickname;
    }
    
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getMobile()
    {
        return mobile;
    }
    
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
    
    public String getAvatar()
    {
        return avatar;
    }
    
    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }
    
    public String getSignature()
    {
        return signature;
    }
    
    public void setSignature(String signature)
    {
        this.signature = signature;
    }
    
    public Timestamp getCreateTime()
    {
        return createTime;
    }
    
    public void setCreateTime(Timestamp createTime)
    {
        this.createTime = createTime;
    }
    
    public Timestamp getUpdateTime()
    {
        return updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime)
    {
        this.updateTime = updateTime;
    }
    
    public Timestamp getLatestLoginTime()
    {
        return latestLoginTime;
    }
    
    public void setLatestLoginTime(Timestamp latestLoginTime)
    {
        this.latestLoginTime = latestLoginTime;
    }
    
    public boolean isAvailable()
    {
        return available;
    }
    
    public void setAvailable(boolean available)
    {
        this.available = available;
    }
    
    public String getHxUsername()
    {
        return hxUsername;
    }
    
    public void setHxUsername(String hxUsername)
    {
        this.hxUsername = hxUsername;
    }
    
    public String getHxPassword()
    {
        return hxPassword;
    }
    
    public void setHxPassword(String hxPassword)
    {
        this.hxPassword = hxPassword;
    }
}