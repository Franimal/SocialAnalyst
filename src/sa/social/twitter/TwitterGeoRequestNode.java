package sa.social.twitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class is a single thread node to be used in a pool in order to request tweets in parallel.
 * @author Tim
 *
 */
public class TwitterGeoRequestNode extends Thread {

	private boolean ready = true;
	private boolean hasTweets = false;
	
	private TwitterCriteria criteria;
	private List<Tweet> tweets;
	
	public TwitterGeoRequestNode(){
		super();
		tweets = new ArrayList<>();
	}
	
	public void requestInfo(TwitterCriteria criteria){
		this.criteria = criteria;
		ready = false;
		hasTweets = false;
		
		tweets.clear();
		start();
	}
	
	@Override
	public void run(){
		System.out.println("requesting");
		tweets = TweetManager.getTweets(criteria);
		ready = true;
		hasTweets = true;
		System.out.println("done");
	}
	
	public boolean hasTweets(){
		return hasTweets;
	}
	
	public boolean isReady(){
		return ready;
	}
	
	public List<Tweet> getTweets(){
		return tweets;
	}

	public Collection<? extends Tweet> consumeTweets() {
		hasTweets = false;
		return tweets;
	}
	
}
