package com.portfolio.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.portfolio.demo.service.TweetService;

@RunWith(SpringRunner.class)
public class PortfolioRepositoryTest {

	@Autowired
	private TweetService tweetService;
	
	private static final Log LOG = LogFactory.getLog(PortfolioRepositoryTest.class);
	
	@Test
	public void getPortfolioById() {
		
		try {
			
			LOG.info(tweetService.getListTweet());
		
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		
	}

}
