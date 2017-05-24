package sa.ui.timeline;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TimelinePanel extends JPanel {

	public TimelinePanel(){
		super();
	}

	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0,  0, getWidth(), getHeight());
	}
	
}
