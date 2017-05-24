package sa.ui.header;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HeaderPanel extends JPanel {

	public HeaderPanel(){
		super();
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0,  0, getWidth(), getHeight());
	}
	
}
