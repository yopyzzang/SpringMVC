package com.yopy.Model.user;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<UserVO> {
    public UserVO mapRow(ResultSet resultSet, int i) throws SQLException {
        UserVO user = new UserVO();
        user.setId(resultSet.getString("id"));
        user.setPw(resultSet.getString("password"));
        user.setNickname(resultSet.getString("nickname"));
        return user;

    }
}
