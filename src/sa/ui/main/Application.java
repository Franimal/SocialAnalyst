package sa.ui.main;

import javax.swing.JFrame;

public class Application {

	private MainFrame frame;
	
	public Application(){
		frame = new MainFrame(1000, 700);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args){
		Application app = new Application();
	}
	
}
