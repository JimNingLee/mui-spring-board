package com.cminnovation.backend.board.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Post {
	private Long id;
	private String title;
	private String content;
	private String author;
	private Integer views; 
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
