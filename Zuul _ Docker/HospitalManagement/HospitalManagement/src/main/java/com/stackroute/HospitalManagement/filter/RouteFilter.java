package com.stackroute.HospitalManagement.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.http.HttpServletRequest;
//import java.util.logging.Logger;


public class RouteFilter extends ZuulFilter {

    private static Logger logger = (Logger) LoggerFactory.getLogger(RouteFilter.class);

    @Override
    public String filterType() {
        return "Route Filter";
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
        System.out.println("inside Route Filter");
        RequestContext context = RequestContext.getCurrentContext();
       // HttpServletRequest request =request.getRequestURL().toString(),request.getMethod();
        HttpServletRequest request = context.getRequest();
        logger.info("Postfilter"+request.getRequestURL().toString(),request.getMethod());

        return null;
    }
}
