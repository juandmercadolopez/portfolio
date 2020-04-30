package com.portfolio.demo.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.service.TweetService;

@RestController
@RequestMapping("/api/twitter")
public class TweetRestController {
	
	@Autowired
	private TweetService tweetService;
	
	@GetMapping("/getTweets")
	public String getTweets() {
	
		try {
			return tweetService.getListTweet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
		
	}

}
