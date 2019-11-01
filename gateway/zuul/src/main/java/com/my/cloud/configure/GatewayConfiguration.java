package com.my.cloud.configure;

import com.my.cloud.filter.ApiRouteFilter;
import com.my.cloud.filter.PreFilter;
import com.my.cloud.hystrx.ApiFallbackProvider;
import com.my.cloud.router.PatternServiceRoute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public ApiRouteFilter getApiRouteFilter(){
        return new ApiRouteFilter();
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
