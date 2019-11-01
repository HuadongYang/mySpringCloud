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

public class ApiRouteFilter extends ZuulFilter {

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
        HttpServletRequest request = context.getRequest();
        HttpServletResponse response = context.getResponse();



        //String uri = (String) context.get(Constants.REQUEST_URI_KEY);
        String uri = request.getRequestURI();
        String currentServiceId = context.get("serviceId").toString();
        if (currentServiceId.startsWith("my")){
            context.set(Constants.SERVICE_ID_KEY, "tools-service");
            context.set(Constants.REQUEST_URI_KEY, "/gateway/test/heart");

        }

        List<String> serviceList = discoveryClient.getServices();

        Optional.ofNullable(serviceList).ifPresent(list->{
            list.forEach(serviceId->{
                String key = patternServiceRouteMapper.apply(serviceId);
                if (uri.startsWith(key))
                    context.set(Constants.SERVICE_ID_KEY, serviceId);
            });
        });
        return null;
    }
}
