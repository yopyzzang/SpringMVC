package com.yopy.Model.board;

import java.util.List;

public interface BoardDAO {
    public int count();

    public List<BoardVO> select(int begin, int end);

    public int insert(BoardVO boardVO);

    public int delete(int id);

    public int update(BoardVO boardVO);

}
