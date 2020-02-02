package com.yopy.Model.board;

import java.util.List;

public class BoradList {
    private int totalCount;
    private int pageNum;
    private int begin;
    private int end;
    private List<BoardVO> boards;

    public BoradList(int totalCount, int pageNum, int begin, int end, List<BoardVO> boards) {
        this.totalCount = totalCount;
        this.pageNum = pageNum;
        this.begin = begin;
        this.end = end;
        this.boards = boards;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public List<BoardVO> getBoards() {
        return boards;
    }

    public void setBoards(List<BoardVO> boards) {
        this.boards = boards;
    }
}
