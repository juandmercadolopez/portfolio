package com.portfolio.demo.service.impl;

import java.io.IOException;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.*; //HttpHead, HttpPut, HttpGet, etc...
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.portfolio.demo.service.TweetService;


@SuppressWarnings("deprecation")
@Service
public class TweetServiceImpl implements TweetService {

	@Value("${zemoga.twitter.dev.endpoint}")
	private String endpoint;
	@Value("${zemoga.twitter.dev.apikey}")
	private String apiKey;
	@Value("${zemoga.twitter.dev.apisecretkey}")
	private String apiSecretKey;
	@Value("${zemoga.twitter.dev.accesstoken}")
	private String accessToken;
	@Value("${zemoga.twitter.dev.accesstokensecret}")
	private String accessTokenSecret;

	@Override
	public String getListTweet() throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, IOException  {
				
		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(apiKey, apiSecretKey);
		consumer.setTokenWithSecret(accessToken, accessTokenSecret);

		@SuppressWarnings("resource")
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(endpoint);
		httpget.setHeader("Content-Type", "application/json");
		
		consumer.sign(httpget);

		HttpResponse response = httpclient.execute(httpget);
		response.getStatusLine().toString();
		HttpEntity entity = response.getEntity();		
		
		return EntityUtils.toString(entity);
				 

	}

}


