package com.cminnovation.backend.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cminnovation.backend.board.domain.Post;

@Mapper
public interface PostMapper {
	
	int insert(Post post);
	Post findById(@Param("id") Long id);
	List<Post> findAll();
	int update(Post post);
	int delete(@Param("id") Long id);
	int increaseViews(@Param("id") Long id);
	
}
