package com.lyh.springcloud.eureka_client.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyh.springcloud.eureka_client.entity.User;
import com.lyh.springcloud.eureka_client.mapper.UserMapper;
import com.lyh.springcloud.eureka_client.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * user 服务实现类
 * </p>
 *
 * @author lyh
 * @since 2020-12-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
