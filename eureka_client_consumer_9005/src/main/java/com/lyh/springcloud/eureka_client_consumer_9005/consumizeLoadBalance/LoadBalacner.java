package com.lyh.springcloud.eureka_client_consumer_9005.consumizeLoadBalance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalacner {
    /**
     * 从服务实例列表中获取出 服务实例
     */
    ServiceInstance getInstances(List<ServiceInstance> serviceInstances);
}
