package com.yopy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public interface Controller {
    String handleRequest(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException;
}
