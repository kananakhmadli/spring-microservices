package com.company.akh.security.jwt.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.Map;

@Service
public class JwtUtil {

    private static final int expireInMs = 300 * 10000;

    private final static Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static String generate(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuer("MaYzkSjmkzPC57L")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expireInMs))
                .setHeader(Map.of("typ","JWT"))
                .signWith(key)
                .compact();
    }

    public static void main(String[] args) {
        System.out.println(generate("moon"));
    }

    public boolean validate(String token) {
        if (getUsername(token) != null && isExpired(token)) {
            return true;
        }
        return false;
    }

    public String getUsername(String token) {
        Claims claims = getClaims(token);
        return claims.getSubject();
    }

    public boolean isExpired(String token) {
        Claims claims = getClaims(token);
        return claims.getExpiration().after(new Date(System.currentTimeMillis()));
    }

    private Claims getClaims(String token) {
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
    }

}