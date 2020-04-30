package com.portfolio.demo.model;

public class PortfolioModel {

	private int idPortfolio;
	private String description;
	private String imageUrl;
	private String twitterUserName;
	private String title;

	public PortfolioModel() {

	}

	public PortfolioModel(int idPortfolio, String description, String imageUrl, String twitterUserName, String title) {
		super();
		this.idPortfolio = idPortfolio;
		this.description = description;
		this.imageUrl = imageUrl;
		this.twitterUserName = twitterUserName;
		this.title = title;
	}

	public int getIdPortfolio() {
		return idPortfolio;
	}

	public void setIdPortfolio(int idPortfolio) {
		this.idPortfolio = idPortfolio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTwitterUserName() {
		return twitterUserName;
	}

	public void setTwitterUserName(String twitterUserName) {
		this.twitterUserName = twitterUserName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
