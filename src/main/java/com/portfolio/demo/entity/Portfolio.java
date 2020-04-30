package com.portfolio.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio {

	@Id
	@Column(name = "idportfolio")
	private int idPortfolio;
	@Column(name = "description", length = 255)
	private String description;
	@Column(name = "image_url", length = 255)
	private String imageUrl;
	@Column(name = "twitter_user_name", length = 255)
	private String twitterUserName;
	@Column(name = "title", length = 255)
	private String title;

	public Portfolio() {

	}

	public Portfolio(int idPortfolio, String description, String imageUrl, String twitterUserName, String title) {
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
