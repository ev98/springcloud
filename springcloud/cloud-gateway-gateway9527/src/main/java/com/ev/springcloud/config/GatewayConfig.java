package com.ev.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    /*
    * 配置了一个id为route-name的路由规则
    * 当访问http://localhost:9527/guomei时会自动转发到地址：http://news.baidu.com/guomei
    * */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_ev",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

}
