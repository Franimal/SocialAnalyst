package sa.ui.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;

import sa.social.twitter.Tweet;
import sa.social.twitter.TweetManager;
import sa.social.twitter.TwitterCriteria;
import sa.ui.header.HeaderPanel;
import sa.ui.map.MapPanel;
import sa.ui.timeline.TimelinePanel;

public class Application {

	/* The initial size of the application.  Will be able to be resized. */
	private static int INITIAL_APP_WIDTH = 1000;
	private static int INITIAL_APP_HEIGHT = 700;
	
	/* The proportion of the application that the header should take up. */
	private static double HEADER_WIDTH_PERCENT = 1;
	private static double HEADER_HEIGHT_PERCENT = 0.08;
	
	/* The proportion of the application that the map should take up. */
	private static double MAP_WIDTH_PERCENT = 1;
	private static double MAP_HEIGHT_PERCENT = 0.84;
	
	/* The proportion of the application that the time-line should take up. */
	private static double TIMELINE_WIDTH_PERCENT = 1;
	private static double TIMELINE_HEIGHT_PERCENT = 0.08;
	
	/* The various frames and panels that will make up the interface. */
	private MainFrame mainFrame;
	private OuterPanel outerPanel;
	private HeaderPanel headerPanel;
	private MapPanel mapPanel;
	private TimelinePanel timelinePanel;
	
	public Application(){
		
		/* Create the main application JFrame with the specified size, and set the default close operation. */
		mainFrame = new MainFrame(INITIAL_APP_WIDTH, INITIAL_APP_HEIGHT);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		/* Create the main container panel.  This panel will contains the map, the header and the timeline footer. */
		outerPanel = new OuterPanel();
		mainFrame.add(outerPanel);
		
		/* Create the header panel in the NORTH position and add it to the outer panel.  
		 * The header panel will take up a fixed height of the outer container panel, and the full width.*/
		headerPanel = new HeaderPanel();
		headerPanel.setPreferredSize(new Dimension((int)(HEADER_WIDTH_PERCENT * mainFrame.getPreferredSize().getWidth()),
				(int)(HEADER_HEIGHT_PERCENT * mainFrame.getPreferredSize().getHeight())));
		outerPanel.add(headerPanel, BorderLayout.NORTH);
		
		/* Create the map panel in the CENTER position and add it to the outer panel.  
		 * The map panel will take up a fixed height of the outer container panel, and the full width.*/
		mapPanel = new MapPanel();
		mapPanel.setPreferredSize(new Dimension((int)(MAP_WIDTH_PERCENT * mainFrame.getPreferredSize().getWidth()),
				(int)(MAP_HEIGHT_PERCENT * mainFrame.getPreferredSize().getHeight())));
		outerPanel.add(mapPanel, BorderLayout.CENTER);
		
		/* Create the time-line panel in the SOUTH position and add it to the outer panel.  
		 * The time-line panel will take up a fixed height of the outer container panel, and the full width.*/
		timelinePanel = new TimelinePanel();
		timelinePanel.setPreferredSize(new Dimension((int)(TIMELINE_WIDTH_PERCENT * mainFrame.getPreferredSize().getWidth()),
				(int)(TIMELINE_HEIGHT_PERCENT * mainFrame.getPreferredSize().getHeight())));
		outerPanel.add(timelinePanel, BorderLayout.SOUTH);
		
		/* Final pack of the outer JFrame. */
		mainFrame.pack();
	}
	
	public static void main(String[] args){	
		Application app = new Application();
//		TwitterCriteria c = TwitterCriteria.create();
//		c.setMaxTweets(50);
//	
//		c.setSince("2016-1-22");
//		c.setUntil("2016-12-22");
//		c.setQuerySearch("geocode:-41.306482,174.777157,10km");
//		
//		System.out.println("Gathering tweets..");
//		
//		long start = System.currentTimeMillis();
//		List<Tweet> tweets = TweetManager.getTweets(c);
//		long end = System.currentTimeMillis();
//		System.out.println("Execution time: " + (end-start));
//		System.out.println(tweets.size() + " tweets found.");
//		System.out.println("Filtering tweets..");
//		for(Tweet t : tweets){
//			System.out.println(t.getText());
//			System.out.println(t.getPermalink());
//			System.out.println(t.getGeo());
//		}
//	
		
	}
	
}
