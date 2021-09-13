package com.controller;

import com.dao.BookDAO;
import com.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class BookController {
    BookDAO bookDAO =new BookDAO();

    @RequestMapping("/")
    public ModelAndView homePage(ModelAndView model) {
        ArrayList<Book> bookDetails = bookDAO.returnList();
        model.addObject("list", bookDetails);
        model.setViewName("book-list");
        return model;
    }
}
