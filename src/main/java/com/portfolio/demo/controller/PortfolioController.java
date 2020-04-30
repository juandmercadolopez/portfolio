package com.portfolio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.portfolio.demo.constant.ViewConstant;
import com.portfolio.demo.service.PortfolioService;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController {

	@Autowired
	private PortfolioService portfolioService;
	
	@GetMapping({ "/index", "/" })
	public ModelAndView getIndexView() {

		ModelAndView mav = new ModelAndView(ViewConstant.HOME_VIEW);

		try {
			mav.addObject("portfolioModel", portfolioService.getZemogaProfileData());
		} catch (Exception e) {
			mav.addObject("portfolioModel", null);
			e.printStackTrace();
		}

		return mav;
	}

	@GetMapping("/tweets")
	public ModelAndView getTweetsView() {
		ModelAndView mav = new ModelAndView(ViewConstant.TWEETS_VIEW);

		try {
			mav.addObject("portfolioModel", portfolioService.getZemogaProfileData());
			mav.addObject("tweets", null);
		} catch (Exception e) {
			mav.addObject("portfolioModel", null);
			e.printStackTrace();
		}

		return mav;
	}
	


}
