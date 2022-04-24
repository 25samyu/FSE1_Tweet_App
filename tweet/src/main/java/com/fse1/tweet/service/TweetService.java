package com.fse1.tweet.service;

import org.springframework.stereotype.Service;

import com.fse1.tweet.dto.TweetDto;

@Service
public interface TweetService {

	String createTweet(TweetDto tweetDto);

}
