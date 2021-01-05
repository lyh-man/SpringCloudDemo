package com.lyh.springcloud.eureka_client_consumer_9005.consumizeLoadBalance.impl;

import com.lyh.springcloud.eureka_client_consumer_9005.consumizeLoadBalance.LoadBalacner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class LoadBalancerImpl implements LoadBalacner {
    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public ServiceInstance getInstances(List<ServiceInstance> serviceInstances) {
        if (serviceInstances == null || serviceInstances.size() == 0) {
            return null;
        }
        return serviceInstances.get(incrementAndGetModulo(serviceInstances.size()));
    }

    /**
     * 获取服务下标，自旋 CAS 并取模
     */
    public int incrementAndGetModulo(int count) {
        int current = 0;
        int next = 0;
        do {
            current = atomicInteger.get();
            next = (current >= Integer.MAX_VALUE ? 0 : current + 1) % count;
        } while (!atomicInteger.compareAndSet(current, next));
        return next;
    }
}
