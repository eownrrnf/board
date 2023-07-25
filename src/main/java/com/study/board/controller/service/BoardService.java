package com.study.board.controller.service;

import com.study.board.controller.entity.Board;
import com.study.board.controller.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    // di 자동 주입 new로 생성 안해도 됨
    private BoardRepository boardRepository;
    public void write(Board board) {    // 글 작성 처리
        boardRepository.save(board);
    }
    public List<Board> boardList() {    // 게시글 리스트 처리
        return boardRepository.findAll();
    }

    // 특정 게시물 불러오기
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }

}
