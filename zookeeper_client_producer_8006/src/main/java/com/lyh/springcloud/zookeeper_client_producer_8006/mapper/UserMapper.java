package com.lyh.springcloud.zookeeper_client_producer_8006.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.springcloud.zookeeper_client_producer_8006.entity.User;
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
