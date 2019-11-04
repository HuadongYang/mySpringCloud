package com.my.cloud.configure;

import com.my.cloud.filter.DynamicRoute;
import com.my.cloud.filter.PreFilter;
import com.my.cloud.router.PatternServiceRoute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public DynamicRoute getApiRouteFilter(){
        return new DynamicRoute();
    }

    @Bean
    public PatternServiceRoute getPatternServiceRoute(){
        return new PatternServiceRoute();
    }

    @Bean
    public PreFilter getPreFilter(){
        return new PreFilter();
    }
    /*@Bean
    public ApiFallbackProvider getApiFallbackProvider(){
        return new ApiFallbackProvider();
    }*/
}
