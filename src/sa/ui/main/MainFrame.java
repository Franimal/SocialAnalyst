package sa.ui.main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * Creates the frame with the given width and height.
	 * @param w
	 * @param h
	 */
	public MainFrame(int w, int h) {
		super();
		setPreferredSize(new Dimension(w, h));
		
		setEnabled(true);
		setVisible(true);
		pack();
	}
	
	
}
