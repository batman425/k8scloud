package com.batman.k8szuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author liusongwei
 * @Title: AccessTokenFilter
 * @Description: 前置过滤器
 * @date 2019/6/1216:08
 */
public class PreFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(PreFilter.class);

    @Override
    public String filterType() {
        return "pre";
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
        RequestContext ctx = RequestContext.getCurrentContext();

        String urlstr = ctx.getRequest().getRequestURI();

        log.info("打印请求的路径信息{}",urlstr);
        return null;
    }



}
