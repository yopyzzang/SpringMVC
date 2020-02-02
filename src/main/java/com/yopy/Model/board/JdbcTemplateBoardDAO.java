package com.yopy.Model.board;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Types;
import java.util.List;

public class JdbcTemplateBoardDAO implements BoardDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from exboard",Integer.class);
    }

    @Override
    public List<BoardVO> select(int begin, int end) {
        return null;
    }

    @Override
    public int insert(BoardVO boardVO) {
        int insertedCount = jdbcTemplate.update("insert into EXBOARD(MESSAGE_ID, GUEST_NAME, MESSAGE, REGISTRY_DATE) values (guest_seq.nextval,?,?,?)",boardVO.getGuestName(),boardVO.getMessage(),boardVO.getRegistryDate());
        return insertedCount;
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from EXBOARD where MESSAGE_ID =?",id);
    }

    @Override
    public int update(BoardVO boardVO) {
        return jdbcTemplate.update("update EXBOARD set MESSAGE=? where MESSAGE_ID=?",new Object[]{boardVO.getMessage(),boardVO.getId()},new int[]{Types.VARCHAR,Types.INTEGER});
    }
}
