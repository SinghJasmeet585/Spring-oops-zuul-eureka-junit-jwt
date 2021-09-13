package com.stackroute.JWTDemo.repository;

import com.stackroute.JWTDemo.model.DaoUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DaoUser,Integer> {
    DaoUser findByUsername(String username);
}
