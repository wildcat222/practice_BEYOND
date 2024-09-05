package com.ohgiraffers.chap11.section02.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class RequestWrapper extends HttpServletRequestWrapper {

    public RequestWrapper(HttpServletRequest request) {
        super(request);


    }

    @Override
    public String getParameter(String name) {
        String value = "";
        if("password".equals(name)) {
            // 비밀번호 암호화 처리한 값으로 변경한다.
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            value = passwordEncoder.encode(name);
        } else {
            value = super.getParameter(name);   // 클라이언트에서 넘어온 값 그대로 처리한다.
        }


        return value;
    }


}
