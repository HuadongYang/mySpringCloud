package com.my.cloud.hystrix.service;

import com.netflix.hystrix.*;

/**
 *
 */
public class NativeTest extends HystrixCommand<Integer> {

    public NativeTest() {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("orderService"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("queryByOrderId"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                        .withCircuitBreakerRequestVolumeThreshold(1)//至少有10个请求，熔断器才进行错误率的计算
                        .withCircuitBreakerSleepWindowInMilliseconds(50000)//熔断器中断请求5秒后会进入半打开状态,放部分流量过去重试
                        .withCircuitBreakerErrorThresholdPercentage(50)//错误率达到50开启熔断保护
                        .withExecutionTimeoutEnabled(true))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties
                        .Setter().withCoreSize(2)));

    }

    @Override
    protected Integer getFallback() {
        return 12345678;
    }

    @Override
    protected Integer run() throws Exception {
        System.out.println("error");
        throw new Exception("exception");
    }

    public static void main(String[] args) {
        for (int i = 0 ; i< 10; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(new NativeTest().execute());
                }
            }).start();
        }
    }
}
