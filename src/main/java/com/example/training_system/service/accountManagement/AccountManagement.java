package com.example.training_system.service.accountManagement;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.training_system.pojo.Account;
import org.springframework.stereotype.Service;

/**
 * 账号管理
 * @author wangtieliang
 * @since 2023-04-15
 */
@Service
public interface AccountManagement {

    /**
     * 登录
     * @author wangtieliang
     * @date 2023-04-15
     * @param account
     */

    public Account login(Account account);

    /**
     * 注册
     * @author wangtieliang
     * @date 2023-04-15
     * @param account
     */
    public String register(Account account);
}
