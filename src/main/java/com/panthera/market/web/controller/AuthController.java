package com.panthera.market.web.controller;

import com.panthera.market.domain.dto.AuthenticationRequest;
import com.panthera.market.domain.dto.AuthenticationResponse;
import com.panthera.market.domain.service.PantheraUserDetailService;
import com.panthera.market.web.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PantheraUserDetailService pantheraUserDetailService;

    @Autowired
    private JWTUtil jwtUtil;


    public AuthController(AuthenticationManager authenticationManager, PantheraUserDetailService pantheraUserDetailService, JWTUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.pantheraUserDetailService = pantheraUserDetailService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request) {
        try {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = pantheraUserDetailService.loadUserByUsername(request.getUsername());
            Date dateNow = new Date();
            Date dateExpiration = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10);
            String jwt = jwtUtil.generateToken(userDetails, dateNow, dateExpiration);
            return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
        } catch (BadCredentialsException e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }
}
