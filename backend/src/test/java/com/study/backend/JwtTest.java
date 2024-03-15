package com.study.backend;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/15 21:39
 */
public class JwtTest {

    @Test
    public void testGen() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("username", "张三");
        // 生成jwt的代码
        String token = JWT.create()
                .withClaim("user", claims)// 添加载荷
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 12))// 添加过期时间
                .sign(Algorithm.HMAC256("bigevent"));// 指定算法，配置密钥
        System.out.println(token);
    }

    @Test
    public void testParse() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9" +
                ".eyJleHAiOjE3MTA1NTM1MjksInVzZXIiOnsiaWQiOjEsInVzZXJuYW1lIjoi5byg5LiJIn19" +
                ".mTUxAXgbRbhZdA_UPHEzsKu2Z-s8qqUnksnlUrqdjYQ";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("bigevent")).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token); // 验证token，生成一个解析后的JWT对象
        Map<String, Claim> claims = decodedJWT.getClaims();
        System.out.println(claims.get("user"));
        // 如果修改了头部和载荷部分的数据，验证失败
        // 如果密钥改了或者过期了，验证失败
    }
}
