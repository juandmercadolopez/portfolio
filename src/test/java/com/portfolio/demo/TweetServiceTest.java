package com.portfolio.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.portfolio.demo.repository.PortfolioRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TweetServiceTest {

	@Autowired
	private PortfolioRepository portfolioRepository;
	
	private static final Log LOG = LogFactory.getLog(TweetServiceTest.class);
	
	@Test
	public void getPortfolioById() {
		
		LOG.info(portfolioRepository.findById(2001).toString());
		
	}

}
