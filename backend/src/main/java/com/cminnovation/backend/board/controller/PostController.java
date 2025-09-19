package com.cminnovation.backend.board.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cminnovation.backend.board.domain.Post;
import com.cminnovation.backend.board.service.PostService;

import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
	private final PostService postService;
	
	@PostMapping
	public ResponseEntity<Post> create(@RequestBody Post post){
		Post created = postService.create(post);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Post> get(@PathVariable Long id) {
        Post found = postService.get(id);
        if (found == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(found);
    }
	
	@GetMapping
	public ResponseEntity<List<Post>> getAll() {
        return ResponseEntity.ok(postService.getAll());
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Post> update(@PathVariable Long id, @RequestBody Post post) {
        post.setId(id);
        postService.update(post);
        Post updated = postService.get(id);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        postService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
