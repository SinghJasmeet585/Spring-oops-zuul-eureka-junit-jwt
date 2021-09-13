package com.stackroute.controller;


import com.stackroute.domain.Blog;
import com.stackroute.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* Add annotation to declare this class as REST Controller */
@RestController
@RequestMapping("/api/v1")
public class BlogController {

    /* Provide implementation code for these methods */
    @Autowired
    BlogService service;
    /*This method should save blog and return savedBlog Object */
    @PostMapping("/blog")
    public ResponseEntity<Blog> saveBlog(@RequestBody  Blog blog) {
        return new ResponseEntity<Blog>(service.saveBlog(blog), HttpStatus.CREATED);
    }

    /*This method should fetch all blogs and return the list of all blogs */
    @GetMapping("/blogs")
    public List<Blog> getAllBlogs() {
        return service.getAllBlogs();
    }

    /*This method should fetch the blog taking its id and return the respective blog */
    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable int id){
        return new ResponseEntity<Blog>(service.getBlogById(id), HttpStatus.FOUND);
    }

    /*This method should delete the blog taking its id and return the deleted blog */
    @DeleteMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogAfterDeleting(@PathVariable int id) {
        return new ResponseEntity<Blog>(service.deleteBlog(id), HttpStatus.OK);
    }

    /*This method should update blog and return the updatedBlog */
    @PutMapping("/blog")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog) {
        return new ResponseEntity<Blog>(service.updateBlog(blog), HttpStatus.OK);
    }
}