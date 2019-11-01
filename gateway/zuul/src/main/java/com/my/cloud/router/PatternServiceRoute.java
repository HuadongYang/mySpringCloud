package com.my.cloud.router;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;

public class PatternServiceRoute extends PatternServiceRouteMapper {
    public PatternServiceRoute() {
        super("(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }
}
