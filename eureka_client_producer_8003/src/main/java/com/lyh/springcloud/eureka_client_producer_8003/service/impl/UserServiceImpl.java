package com.lyh.springcloud.eureka_client_producer_8003.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyh.springcloud.eureka_client_producer_8003.entity.User;
import com.lyh.springcloud.eureka_client_producer_8003.mapper.UserMapper;
import com.lyh.springcloud.eureka_client_producer_8003.service.UserService;
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
