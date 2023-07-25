package com.study.board.controller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
// 엔티티는 테이블을 의미
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Id는 프라이머리키를 의미
    // GeneratedValue 전략 db형태를 정하는 것
    private Integer id;
    private String title;
    private String content;
}
