package com.portfolio.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.demo.component.PortfolioConverter;
import com.portfolio.demo.model.PortfolioModel;
import com.portfolio.demo.repository.PortfolioRepository;
import com.portfolio.demo.service.PortfolioService;

@Service
public class PortfolioServiceImpl implements PortfolioService{
	
	@Autowired
	private PortfolioRepository portfolioRepository;
	
	@Autowired
	private PortfolioConverter portfolioConverter;
	
	@Override
	public int savePortfolio(PortfolioModel portfolioModel) throws Exception{
		
		if(null != portfolioModel.getImageUrl()) {
			portfolioRepository.updateImagePortfolio(portfolioModel.getImageUrl());
		}else {
			portfolioRepository.updateDataPortfolio(portfolioModel.getTitle(), portfolioModel.getDescription());
		}		
		
		return 1;
	}
	
	@Override
	public PortfolioModel getZemogaProfileData() throws Exception{
		
		PortfolioModel portfolioModel = portfolioConverter.convertPortfolioEntityToModel(portfolioRepository.findByIdPortfolio(2001));
		
		return portfolioModel;		
		
	}

}
