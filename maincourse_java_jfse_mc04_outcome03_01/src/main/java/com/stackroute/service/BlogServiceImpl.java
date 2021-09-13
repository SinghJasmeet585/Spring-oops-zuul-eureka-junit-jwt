package com.stackroute.service;


import com.stackroute.domain.Blog;
import com.stackroute.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* Add annotation to declare this class as Service class.
 * Also it should implement BlogService Interface and override all the implemented methods.*/
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository repository;

    @Override
    public Blog saveBlog(Blog blog) {
        return repository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return (List<Blog>) repository.findAll();
    }

    @Override
    public Blog getBlogById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Blog deleteBlog(int id) {
        /*
        Blog blog= repository.findById(id).get();
        repository.deleteById(id);
        return blog;
        */
        Optional<Blog> blog=repository.findById(id);
        if(blog.isPresent()){
            repository.findById(id);
            repository.deleteById(id);
            return blog.get();
        }
        return null;
    }

    @Override
    public Blog updateBlog(Blog blog) {
        Optional<Blog> blog1=repository.findById(blog.getBlogId());
        if(blog1.isPresent()){
            repository.findById(blog.getBlogId());
            repository.save(blog);
            return blog;
        }
        return null;
    }
}
