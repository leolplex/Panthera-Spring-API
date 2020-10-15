package com.panthera.market.web.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {
    private static final String KEY = "Ph4nth3r4";

    public String generateToken(UserDetails userDetails, Date dateNow, Date dateExpiration) {
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(dateNow) // new Date()
                .setExpiration(dateExpiration) // new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)
                .signWith(SignatureAlgorithm.HS256, KEY).compact();
    }

    public boolean validateToken(String token, UserDetails userDetails) {

        System.out.println("Variable A: " + userDetails.getUsername().equals(extractUsername(token)));
        System.out.println("Variable B: " + !isTokenExpire(token));

        return userDetails.getUsername().equals(extractUsername(token)) && !isTokenExpire(token);

    }

    public String extractUsername(String token) {
        try {
            return getClaims(token).getSubject();
        } catch (ExpiredJwtException e) {
            return e.getMessage();
        }
    }

    public boolean isTokenExpire(String token) {
        try {
            return getClaims(token).getExpiration().before(new Date());
        } catch (ExpiredJwtException e) {
            return true;
        }
    }

    private Claims getClaims(String token) {
        return Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
    }
}
