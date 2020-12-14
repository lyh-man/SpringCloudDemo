package com.lyh.springcloud.producer.mapper;

import com.lyh.springcloud.producer.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
