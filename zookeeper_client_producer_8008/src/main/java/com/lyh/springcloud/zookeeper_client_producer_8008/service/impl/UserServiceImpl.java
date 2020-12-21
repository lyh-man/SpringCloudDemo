package com.lyh.springcloud.zookeeper_client_producer_8008.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyh.springcloud.zookeeper_client_producer_8008.entity.User;
import com.lyh.springcloud.zookeeper_client_producer_8008.mapper.UserMapper;
import com.lyh.springcloud.zookeeper_client_producer_8008.service.UserService;
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
