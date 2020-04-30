package com.portfolio.demo.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public interface TweetService {

	String getListTweet() throws OAuthMessageSignerException, OAuthExpectationFailedException,
			OAuthCommunicationException, ClientProtocolException, IOException;

	
}
