package rfe.cdi.til;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
//import org.junit.Test;

public class CDIDemoTest {

	public static void main(String[] args) {
		
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		Application application = container.instance().select(Application.class).get();
	    application.run();

		weld.shutdown();
        
		System.out.println("TestSuccess");
		
	}
	

}
