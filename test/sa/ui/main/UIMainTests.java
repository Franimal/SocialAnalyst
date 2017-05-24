package sa.ui.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class UIMainTests {

	@Test
	public void creationTest(){
		MainFrame main = new MainFrame(200, 200);
		
		if(main.isEnabled() && main.isVisible() && main.getSize().getWidth() == 200 && main.getSize().getHeight() == 200){
			main.dispose();
			return;
		}
		
		fail("Main frame has not been created correctly.");
		
	}
	
}
