package com.fse1.tweet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fse1.tweet.entity.TweetEntity;

@Repository
public interface TweetRepository extends MongoRepository<TweetEntity, String> {

}
