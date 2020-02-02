package com.yopy.Model.board;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardRowMapper implements RowMapper<BoardVO> {
    @Override
    public BoardVO mapRow(ResultSet resultSet, int i) throws SQLException {
        BoardVO boardVO = new BoardVO();
        boardVO.setId(resultSet.getInt("MESSAGE_ID"));
        boardVO.setGuestName(resultSet.getString("GUEST_NAME"));
        boardVO.setMessage(resultSet.getString("MESSAGE"));
        boardVO.setRegistryDate(resultSet.getDate("REGISTRY_DATE"));
        return boardVO;

    }
}
