package com.my.cloud.filter;

import com.my.cloud.constant.Constants;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

/**
 * my必须要配置一下，因为zuul如果检测到serviceIds和yml文件里没有，请求直接返回
 *
 * localhost:8001/api/my/a路由到localhost:8001/api/v1/tools-service/gateway/test/heart
 */
public class DynamicRoute extends ZuulFilter {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    PatternServiceRouteMapper patternServiceRouteMapper;


    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();

        String currentServiceId = context.get("serviceId").toString();
        if (currentServiceId.startsWith("my")){
            context.set(Constants.SERVICE_ID_KEY, "tools-service-v1");
            context.set(Constants.REQUEST_URI_KEY, "/gateway/test/heart");
        }

        return null;
    }
}
