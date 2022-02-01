package com.gusta.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gusta.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
