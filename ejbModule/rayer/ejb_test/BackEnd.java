package rayer.ejb_test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BackEnd
 */
@Stateless
@LocalBean
public class BackEnd implements BackEndRemote {

    /**
     * Default constructor. 
     */
    public BackEnd() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void callMeMaybe() {
    	System.out.println("Hey i just met you");

    }

}
