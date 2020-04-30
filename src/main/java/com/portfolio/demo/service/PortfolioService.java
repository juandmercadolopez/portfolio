package com.portfolio.demo.service;

import com.portfolio.demo.model.PortfolioModel;

public interface PortfolioService {

	int savePortfolio(PortfolioModel portfolioModel) throws Exception;

	PortfolioModel getZemogaProfileData() throws Exception;	
	
}
