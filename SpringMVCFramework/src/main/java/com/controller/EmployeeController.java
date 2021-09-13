package com.controller;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class EmployeeController {
    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

    @RequestMapping("/")
    public ModelAndView adminPage(ModelAndView model) {
        model.setViewName("Login");
        return model;
    }

    @PostMapping("/admin")
    public ModelAndView homePage(HttpServletRequest request, ModelAndView model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("admin")) {
            model.setViewName("admin");
        } else {
            model.setViewName("registration-fail");
        }
        return model;
    }

    @GetMapping("/admin")
    public ModelAndView homepage(ModelAndView model) {
        model.setViewName("admin");
        return model;
    }

    @RequestMapping("/delete")
    public ModelAndView deleteElement(ModelAndView model) {
        model.setViewName("delete");
        return model;
    }

    @PostMapping("/deleteEmployee")
    public ModelAndView deleteEmployee(HttpServletRequest request, ModelAndView model) {
        Long mobile = Long.parseLong(request.getParameter("mobile"));
        ArrayList<Employee> employeeList = employeeDao.getEmployeeDetails();
        int count = 0;
        for (Employee employee :
                employeeList) {
            if (employee.getMobile().equals(mobile)) {
                break;
            }
            count++;
        }
        employeeDao.delete(count);
        model.setViewName("deleteSuccessfully");
        return model;
    }

    @RequestMapping(value = "/home")
    //@GetMapping("/home")
    public ModelAndView showHomePage(ModelAndView model) {
        String message = "Welcome to Spring MVC";
        model.addObject("x", message);
        model.setViewName("home-page");
        return model;
    }

    @PostMapping("/addEmployeeDetails")
    public ModelAndView getEmployeeDetails(HttpServletRequest request, ModelAndView model) {
        Employee employee = new Employee();
        employee.setName(request.getParameter("username"));
        employee.setMobile(Long.parseLong(request.getParameter("mobile")));
        employee.setEmail(request.getParameter("email"));
        employee.setGender(request.getParameter("gender"));
        // System.out.println(employee);
        Boolean bool = employeeDao.addEmployeeDetails(employee);
        if (bool) {
            model.addObject("employee", employee);
            model.setViewName("registration-success");
        } else model.setViewName("registration-fail");
        return model;
    }

    @GetMapping("/getAllEmployeeDetails")
    public ModelAndView getAllEmployeeDetails(ModelAndView model) {
        ArrayList<Employee> employeeDetails = employeeDao.getEmployeeDetails();
        model.addObject("list", employeeDetails);
        model.setViewName("list-of-employees");
        return model;
    }

    @RequestMapping("/update")
    public ModelAndView update(ModelAndView model) {
        model.setViewName("update");
        return model;
    }

    @PostMapping("/updateSuccess")
    public ModelAndView updateElement(HttpServletRequest request, ModelAndView model) {
        Long mobile = Long.parseLong(request.getParameter("mobile"));
        ArrayList<Employee> employeeList = employeeDao.getEmployeeDetails();
        int count = 0;
        for (Employee employee :
                employeeList) {
            if (employee.getMobile().equals(mobile)) {
                break;
            }
            count++;
        }
        if(count>=employeeList.size())
        {
            model.setViewName("registration-fail");
            return model;
        }
        employeeDao.delete(count);
        Employee employee = new Employee();
        employee.setName(request.getParameter("username"));
        employee.setMobile(Long.parseLong(request.getParameter("mobile")));
        employee.setEmail(request.getParameter("email"));
        employee.setGender(request.getParameter("gender"));
        Boolean bool = employeeDao.addEmployeeDetails(employee);
        if (bool) {
            model.addObject("employee", employee);
            model.setViewName("registration-success");
        } else {
            model.setViewName("registration-fail");
        }
        return model;
    }


}
