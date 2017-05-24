package sa.ui.map;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MapPanel extends JPanel {

	public MapPanel(){
		super();
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,  0, getWidth(), getHeight());
	}
	
}
