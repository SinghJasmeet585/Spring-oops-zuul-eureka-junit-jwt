package com.stackroute.HospitalManagement.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.servlet.http.HttpServletRequest;
//import java.util.logging.Logger;


public class Prefilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(Prefilter.class);

    @Override
    public String filterType() {
        return "Pre Filter Working";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        logger.info("Prefilter"+request.getRequestURL().toString(),request.getMethod());
        return null;
    }
}
