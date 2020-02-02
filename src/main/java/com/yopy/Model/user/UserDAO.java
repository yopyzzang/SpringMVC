package com.yopy.Model.user;

import com.yopy.Model.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDAO implements UserDAOImpl{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertUser(UserVO userVO) {
    String INSERT_USER = "insert into exuser(id,password,nickname) values(?,?,?)";
    int cnt = jdbcTemplate.update(INSERT_USER,userVO.getId(),userVO.getPw(),userVO.getNickname());
        System.out.println(cnt + "건 데이터 삽입");
    }

    @Override
    public int insert(UserVO userVO) {
        int insertedCount = jdbcTemplate.update("insert into EXUSER(id, password, nickname) values (?,?,?)",userVO.getId(),userVO.getPw(),userVO.getNickname());
        System.out.println(insertedCount+"건 데이터 삽입");
        return insertedCount;
    }

    public void updateUser(UserVO userVO) {
        String UPDATE_USER = "update exuser set id=? , nickname=? where pw=?";
        Object[] args = {userVO.getId(),userVO.getNickname(),userVO.getPw()};
        int cnt = jdbcTemplate.update(UPDATE_USER,args);
        System.out.println(cnt + "건 데이터 수정");

    }

    public void deleteUser(UserVO userVO) {

    }

    public List<UserVO> getUserList(UserVO userVO) {
        return null;
    }
}
