package com.yopy.Model.user;

import com.yopy.Model.board.BoardVO;

import java.util.List;

public interface UserDAOImpl {
    public int insert(UserVO userVO);
    void updateUser(UserVO userVO);
    void deleteUser(UserVO userVO);
    List<UserVO> getUserList(UserVO userVO);


}
