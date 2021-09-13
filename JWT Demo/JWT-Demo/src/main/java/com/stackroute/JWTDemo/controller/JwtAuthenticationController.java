package com.stackroute.JWTDemo.controller;

import com.stackroute.JWTDemo.config.JwtTokenUtil;
import com.stackroute.JWTDemo.model.JwtRequest;
import com.stackroute.JWTDemo.model.JwtResponse;
import com.stackroute.JWTDemo.model.UserDto;
import com.stackroute.JWTDemo.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("8")
public class JwtAuthenticationController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    AuthenticationManager authenticationManager;

    @RequestMapping(value = "/authentication",method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest jwtRequest) throws Exception{
        authenticate(jwtRequest.getUsername(),jwtRequest.getPassword());
        final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto) throws Exception{
        return ResponseEntity.ok(jwtUserDetailsService.save(userDto));
    }

    private void authenticate(String username , String password) throws Exception{
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));

        }catch (DisabledException e){
            throw new Exception("User Disabled",e);
        }catch (BadCredentialsException e){
            throw new Exception("invalid credentials",e);
        }
    }

}
