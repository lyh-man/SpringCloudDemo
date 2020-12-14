package com.lyh.springcloud.producer.service.impl;

import com.lyh.springcloud.producer.entity.User;
import com.lyh.springcloud.producer.mapper.UserMapper;
import com.lyh.springcloud.producer.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
