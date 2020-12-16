package com.lyh.springcloud.eureka_client_producer_8003.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.springcloud.eureka_client_producer_8003.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * user Mapper 接口
 * </p>
 *
 * @author lyh
 * @since 2020-12-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
