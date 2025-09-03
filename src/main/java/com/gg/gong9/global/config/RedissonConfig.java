//package com.gg.gong9.global.config;
//
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RedissonConfig {
//    private static final String REDISSON_HOST_PREFIX = "redis://";
//
//    @Bean
//    public RedissonClient redissonClient() {
//        Config config = new Config();
//        config.useSingleServer().setAddress(REDISSON_HOST_PREFIX + "redis-eb.btpay7.ng.0001.apn2.cache.amazonaws.com:6379");
//        return Redisson.create(config);
//    }
//}
