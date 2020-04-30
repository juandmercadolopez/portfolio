package com.portfolio.demo.component;

import org.springframework.stereotype.Component;

import com.portfolio.demo.entity.Portfolio;
import com.portfolio.demo.model.PortfolioModel;

@Component
public class PortfolioConverter {

	public Portfolio convertPortfolioModelToEntity(PortfolioModel portfolioModel) {

		Portfolio portfolio = new Portfolio(portfolioModel.getIdPortfolio(), portfolioModel.getDescription(),
				portfolioModel.getImageUrl(), portfolioModel.getTwitterUserName(), portfolioModel.getTitle());

		return portfolio;

	}
	
	public PortfolioModel convertPortfolioEntityToModel(Portfolio portfolio) {

		PortfolioModel portfolioModel = new PortfolioModel(portfolio.getIdPortfolio(), portfolio.getDescription(),
				portfolio.getImageUrl(), portfolio.getTwitterUserName(), portfolio.getTitle());

		return portfolioModel;

	}

}
