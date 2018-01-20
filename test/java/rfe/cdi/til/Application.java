package rfe.cdi.til;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Application {
    @Inject
    private CarDAO carDAO;

    public void run() {
       System.out.println(carDAO.getInjectedChild());
    }
}

