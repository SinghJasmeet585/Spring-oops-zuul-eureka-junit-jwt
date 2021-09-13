package com.stackroute.HospitalManagement.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.servlet.http.HttpServletResponse;
//import java.util.logging.Logger;

public class PostFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(PostFilter.class);


    @Override
    public String filterType() {
        return "Post filter";
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
        System.out.println("inside");
        HttpServletResponse response= RequestContext.getCurrentContext().getResponse();
        logger.info("postfilter"+response.getStatus());
        return null;
    }
}
