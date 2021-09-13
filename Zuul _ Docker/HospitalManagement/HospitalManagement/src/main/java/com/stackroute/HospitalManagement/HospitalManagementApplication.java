package com.stackroute.HospitalManagement;

import com.stackroute.HospitalManagement.filter.ErrorFilter;
import com.stackroute.HospitalManagement.filter.PostFilter;
import com.stackroute.HospitalManagement.filter.Prefilter;
import com.stackroute.HospitalManagement.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class HospitalManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
	}


	@Bean
	public Prefilter preFilter(){
		return new Prefilter();
	}

	@Bean
	public PostFilter postFilter(){
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter(){
		return new RouteFilter();
	}

}
