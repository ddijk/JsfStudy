/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import javax.enterprise.inject.Model;
import javax.faces.event.ComponentSystemEvent;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@Model
public class CseListener {

    private static final Logger LOGGER = Logger.getLogger(CseListener.class);

    public void eventHandler(ComponentSystemEvent cse) {

        LOGGER.info("CSE happend " + cse);

    }

}
