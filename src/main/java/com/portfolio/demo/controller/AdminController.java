package com.portfolio.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.demo.constant.ViewConstant;

@Controller
@RequestMapping("/updates")
public class AdminController {
	
	@GetMapping("/updateProfilePicture")
	public String getUpdateProfileView() {
		return ViewConstant.UPDATE_PHOTO_VIEW;
	}
	
	@GetMapping("/updateProfileData")
	public String getUpdateProfileDataView() {
		return ViewConstant.UPDATE_DATA_VIEW;
	}

}
