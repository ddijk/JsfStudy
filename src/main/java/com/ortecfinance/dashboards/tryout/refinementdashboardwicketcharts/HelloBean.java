package com.ortecfinance.dashboards.tryout.refinementdashboardwicketcharts;

import java.io.Serializable;
import javax.enterprise.inject.Model;
import org.apache.log4j.Logger;

@Model
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(HelloBean.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSayWelcome() {
        LOGGER.info("naam is " + name);
        //check if null?
        if ("".equals(name) || name == null) {
            return "";
        } else {
            return "Ajax message : Welcome " + name;
        }
    }
}
