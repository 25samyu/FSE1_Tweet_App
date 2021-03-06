package com.fse1.tweet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fse1.tweet.dto.TweetDto;
import com.fse1.tweet.service.TweetService;

@RequestMapping("/tweets")
@RestController
public class TweetAppController {

	@Autowired
	TweetService tweetService;

	@PostMapping("/add")
	public ResponseEntity<String> createTweet(@RequestBody TweetDto tweetDto) {

		return new ResponseEntity<>(tweetService.createTweet(tweetDto), HttpStatus.CREATED);
	}

}
