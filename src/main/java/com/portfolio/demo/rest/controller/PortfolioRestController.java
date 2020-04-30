package com.portfolio.demo.rest.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.PortfolioModel;
import com.portfolio.demo.service.PortfolioService;

@RestController
@RequestMapping("/api/administration")
public class PortfolioRestController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1490130040262366109L;

	@Autowired
	private PortfolioService portfolioService;	
	
	@PostMapping("/updateData")
	public int saveProfileData(@RequestBody PortfolioModel request) {
		try {
			return portfolioService.savePortfolio(request);
		} catch (Exception e) {
			return 2;
		}		
	}
	
	@PostMapping("/updatePicture")
	@ResponseBody
	public int saveProfilePicture(@RequestBody PortfolioModel request) {
		try {
			return portfolioService.savePortfolio(request);
		} catch (Exception e) {
			return 2;
		}		
	}
	
	@GetMapping("/getProfileData")
	@ResponseBody
	public PortfolioModel getProfileData() {
		try {
			return portfolioService.getZemogaProfileData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
