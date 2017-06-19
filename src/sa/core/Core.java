package sa.core;

import java.util.ArrayList;
import java.util.List;

import sa.social.twitter.Tweet;
import sa.social.twitter.TweetManager;
import sa.social.twitter.TwitterCriteria;

/**
 * Core class to be used for testing and using the framework.
 * @author Tim
 *
 */
public class Core {

	public static void main(String[] args){

		TwitterCriteria c = TwitterCriteria.create();
		c.setMaxTweets(2);
	
		c.setSince("2015-5-15");
		c.setUntil("2017-5-26");
		c.setQuerySearch("hello");
		
		System.out.println("Gathering tweets..");
				
		long start = System.currentTimeMillis();
		
		
		List<Coordinate> coords = new ArrayList<>();
		//Dubai
		coords.add(new Coordinate(25.0657, 55.17128));
		//San Francisco
		coords.add(new Coordinate(37.77493,-122.41942));
		
		//Get 2 from each city, 4 in total.  50km from city center.  2 threads.
		List<Tweet> tweets = TweetManager.getMultipleGeoTweets(c, coords, 50, 2);

		
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start));
		System.out.println(tweets.size() + " tweets found.");
		System.out.println("Filtering tweets..");
				
		for(Tweet t : tweets){
			System.out.println(t.getText());
			System.out.println(t.getPermalink());
			System.out.println(t.getGeo());
		}
	}
}
