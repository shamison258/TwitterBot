package com.shamison.TwitterUtils;

import twitter4j.Twitter;

/**
 * Created by shamison on 14/12/23.
 */
public class TwitterUtils {
	private OAuth oAuth;
	private Twitter twitter;

	TwitterUtils(){
		if(!oAuth.isOAuth()){
			oAuth.start();
		}
		twitter = oAuth.getTwitter();
	}

}