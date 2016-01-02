/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import org.apache.log4j.Logger;

/**
 *
 * @author Dick
 */
public class MyActionListener implements ActionListener {

    private static final Logger LOGGER = Logger.getLogger(MyActionListener.class);

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        LOGGER.info("MyActionListener called");
    }

}
