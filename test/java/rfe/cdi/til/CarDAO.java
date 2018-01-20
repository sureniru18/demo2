package rfe.cdi.til;

import javax.inject.Inject;



public class CarDAO {
    @Inject
    private SomeBean sb;
    
    public String getInjectedChild(){
    	return sb.myName();
    }

}