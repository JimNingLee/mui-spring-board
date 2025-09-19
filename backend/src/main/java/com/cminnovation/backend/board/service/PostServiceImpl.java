package com.cminnovation.backend.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cminnovation.backend.board.domain.Post;
import com.cminnovation.backend.board.mapper.PostMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{
	
	private final PostMapper postMapper;

	@Override
	public Post create(Post post) {
		postMapper.insert(post);
		return postMapper.findById(post.getId());
	}

	@Override
	@Transactional
	public Post get(Long id) {
		postMapper.increaseViews(id);
		return postMapper.findById(id);
	}

	@Override
	public List<Post> getAll() {
		return postMapper.findAll();
	}

	@Override
	public void update(Post post) {
		postMapper.update(post);
	}

	@Override
	public void delete(Long id) {
		postMapper.delete(id);
	}
	
}
