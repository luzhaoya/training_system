package com.example.training_system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.training_system.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * TODO
 * @copyright 海南华德科技有限公司
 * @author wangtieliang
 * @since 2023-04-15
 */
@Mapper
@Component
public interface AccountManagementDAO extends BaseMapper<Account> {

    /**
     * 登录
     * @author wangtieliang
     * @date 2023-04-15
     * @param account
     */
    @Select("select * from t_account where account = #{account.account} and password = #{account.password}")
    public Account login(@Param("account") Account account);

    /**
     * 判断账号是否存在
     * @author wangtieliang
     * @date 2023-04-15
     * @param account
     */
    @Select("select * from t_account where account = #{account.account}")
    public Account judgeAccount (@Param("account") Account account);
}
