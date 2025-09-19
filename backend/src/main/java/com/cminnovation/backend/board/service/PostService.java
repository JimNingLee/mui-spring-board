package com.cminnovation.backend.board.service;

import java.util.List;

import com.cminnovation.backend.board.domain.Post;

public interface PostService {
	Post create(Post post);
	Post get(Long id);
	List<Post> getAll();
	void update(Post post);
	void delete(Long id);
}
