package conv;

import javax.enterprise.inject.Model;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.validation.constraints.Size;
import org.apache.log4j.Logger;

/**
 *
 * @author Dick
 */
@Model
public class BeanValBean {

    private static final Logger LOGGER = Logger.getLogger(BeanValBean.class);

    HtmlOutputText hot;

    /**
     * Creates a new instance of BeanValBean
     */
    public BeanValBean() {
        LOGGER.info("constructor ");

    }

    @Size(min = 2, max = 4, message = "{lengte.fout}")
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        LOGGER.info("setting email to " + email);
        this.email = email;
    }

    public void processClick(ActionEvent e) {
        LOGGER.info("processClick called");
    }

    public void preRender(ComponentSystemEvent cse) {

        LOGGER.info("cse happend " + cse);
        if (email == null) {
            return;
        }
        if (email.equalsIgnoreCase("www") || email.equalsIgnoreCase("d@d.nl")) {
            LOGGER.info("hide it");
            cse.getComponent().setRendered(false);
        } else {
            LOGGER.info("show it");

        }

    }

    public HtmlOutputText getHot() {
        return hot;
    }

    public void setHot(HtmlOutputText hott) {
        LOGGER.info("setHot called");
        hot = hott;
        hot.setRendered(true);
    }

}
