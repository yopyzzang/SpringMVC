package com.yopy.controller;

import com.yopy.Model.user.UserDAO;
import com.yopy.Model.user.UserVO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("아이디 등록");
        httpServletRequest.setCharacterEncoding("UTF-8");
        String id = httpServletRequest.getParameter("id");
        String pw = httpServletRequest.getParameter("password");
        String nickname = httpServletRequest.getParameter("nickname");

        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPw(pw);
        vo.setNickname(nickname);
        UserDAO userDAO = new UserDAO();
        userDAO.insert(vo);
        return null;
    }
}
