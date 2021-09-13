package com.stackroute.service;

import com.stackroute.domain.Blog;
import com.stackroute.exception.BlogAlreadyExistsException;
import com.stackroute.exception.BlogNotFoundException;
import com.stackroute.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/* This is ServiceImplementation Class which should implement BlogService Interface and override all the implemented methods.
 * Handle suitable exceptions for all the implemented methods*/

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    BlogRepository repository;

    @Override
    public Blog saveBlog(Blog blog) throws BlogAlreadyExistsException{
        if(repository.existsById(blog.getBlogId())){
            throw new BlogAlreadyExistsException();
        }

        return repository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return (List<Blog>) repository.findAll();
    }

    @Override
    public Blog getBlogById(int id) throws BlogNotFoundException{
        Optional<Blog> blog=repository.findById(id);
        if(!blog.isPresent()){
            throw new BlogNotFoundException();
        }
        return repository.findById(id).get();

    }

    @Override
    public Blog deleteBlog(int id) throws BlogNotFoundException{
        Optional<Blog> blog=repository.findById(id);
        if(blog.isPresent()){
            repository.findById(id);
            repository.deleteById(id);
            return blog.get();
        }
        throw new BlogNotFoundException();
    }

    @Override
    public Blog updateBlog(Blog blog) throws BlogNotFoundException {
        Optional<Blog> blog1=repository.findById(blog.getBlogId());
        if(repository.existsById(blog.getBlogId())){
            repository.findById(blog.getBlogId());
            repository.save(blog);
            return blog;
        }
        throw new BlogNotFoundException();
    }
}

